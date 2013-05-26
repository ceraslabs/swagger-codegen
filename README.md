# Swagger Code Generator

## Overview
This is a [swagger codegen project](https://github.com/wordnik/swagger-codegen) customized for [Pattern Deployer](https://github.com/ceraslabs/pattern-deployer), which allows generation of client libraries automatically from a 
Pattern Deployer server.  You can find out more about both the spec and the framework at https://github.com/ceraslabs/pattern-deployer/wiki.  

### Supported programming language(s)

* [Java](http://java.oracle.com)

### Generator Prerequisites
You need a machine as generator, and have the following dependencies installed and available in your $PATH:

* [Java 1.6](http://java.oracle.com)

  For example(In Ubuntu-12.04):
  ```
  apt-get install openjdk-6-jdk
  export JAVA_HOME=/usr/lib/jvm/java-6-openjdk-amd64
  export PATH=${PATH}:${JAVA_HOME}/bin
  ```

* [Apache maven 3.0.3 or greater](http://maven.apache.org/)

  For example:
  ```
  apt-get install maven
  ```

* [Scala 2.9.1](http://www.scala-lang.org)

  For example:
  ```
  apt-get install scala
  ```

* [Git](http://git-scm.com/)

  For example:
  ```
  apt-get install git-core
  ```

### Clone the project
```
git clone git://github.com/ceraslabs/swagger-codegen.git
```


After cloning the project, you need to build it from source:

```
cd swagger-codegen
mvn package
```

### To generate a [Pattern Deployer](https://github.com/ceraslabs/pattern-deployer) client library
You can build a Java client against Pattern Deployer's API as follows:

```
./bin/runscala.sh patterndeployer/java/JavaPatterndeployer.scala http://YOUR_SERVER_URL/api_docs.json
```

This will run the script in [patterndeployer/java/JavaPatterndeployer.scala](https://github.com/ceraslabs/swagger-codegen/blob/master/patterndeployer/java/JavaPatterndeployer.scala) and create the client.

If you want to override some of the defaults--like packages, etc.  For doing this, just modify the scala
script [JavaPatterndeployer.scala](https://github.com/ceraslabs/swagger-codegen/blob/master/patterndeployer/java/JavaPatterndeployer.scala) with the overrides you want.

### To package the client library

This will package the Pattern Deployer client library.  

```
cd patterndeployer/java
mvn package
```

Now you should see the library being package as Jar files in the folder patterndeployer/java/target.

### To use the generated client

First, you need to import the generated Jar file as library. Then coding. A sample client program is as below:

```java
import com.patterndeployer.*;
import com.patterndeployer.model.*;
import com.patterndeployer.api.*;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.io.*;
import java.net.*;

public class TestClient{

    static final String pdUser = "YOUR_USERNAME";
    static final String pdPass = "YOUR_PASSWORD";
    static final String basePath = "http://YOUR_PATTERN_DEPLOYER_SERVER/api";

    static class MyAuthenticator extends Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            System.err.println("Feeding username and password for " + getRequestingScheme());
            return (new PasswordAuthentication(pdUser, pdPass.toCharArray()));
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Authenticator.setDefault(new MyAuthenticator());

		try 
		{		
			Uploaded_filesApi fApi = new Uploaded_filesApi();
			fApi.setBasePath(basePath);

			for (UploadedFile f : fApi.getFiles().getAll())
			{
				if (f.getFileName().equals("myapp.war")) {
					fApi.deleteFileById(f.getId());
				}
				if (f.getFileName().equals("mydb.sql")) {
					fApi.deleteFileById(f.getId());
				}
				if (f.getFileName().equals("testkey.pem")) {
					fApi.deleteFileById(f.getId());
				}
			}
			fApi.createFile(new File("myapp.war"), "war_file", null, null, null);
			fApi.createFile(new File("mydb.sql"), "sql_script_file", null, null, null);
			fApi.createFile(new File("testkey.pem"), "identity_file", null, "YOUR_KEY_PAIR_ID", "ec2");

			CredentialsApi cApi = new CredentialsApi();
			cApi.setBasePath(basePath);

			for (Credential c : cApi.getCredentials().getAll())
			{
				if (c.getName().equals("mykey")) {
					cApi.deleteCredentialById(c.getId());
				}
			}
			cApi.createCredential("mykey", "ec2", "YOUR_AWS_ACCESS_KEY_ID", "YOUR_AWS_SECRET_ACCESS_KEY", null, null, null, null);
			
			TopologiesApi tApi = new TopologiesApi();
			tApi.setBasePath(basePath);

			for (Topology t : tApi.getTopologies().getAll())
			{
				if (t.getName().equals("test_topology")) {
					tApi.deleteTopologyById(t.getId());
				}
			}
			Topology myTopology = tApi.createTopology(new File("test_topology.xml"), null, null, null);
			
			//deploy
			tApi.modifyTopologyById(myTopology.getId(), "deploy", null, null);

			//wait for finish
			boolean repaired = false;
			while (true)
			{
				Thread.sleep(30000);
				
				myTopology = tApi.getTopologyById(myTopology.getId());
				String status = myTopology.getDeployment().getStatus();
				if (status.equals("deployed")) {
					break;
				}
				else if (status.equals("failed")) {
					if (!repaired) {
						repaired = true;
						tApi.modifyTopologyById(myTopology.getId(), "repair", null, null);
					}
					else {
					  throw new RuntimeException(myTopology.getDeployment().getError());
					}
				}
				else if (status.equals("deploying")) {
					System.out.println("waiting");
				}
				else {
					throw new RuntimeException("unexpected status " + status);
				}
			}
			
			//confirm application is up
			for (Application app : myTopology.getDeployment().getApplications())
			{
				System.out.println("Application " + app.getName() + " deployed in " + app.getUrl());
			}

			//undeploy
			myTopology = tApi.modifyTopologyById(myTopology.getId(), "undeploy", null, null);
			System.out.println("Status after undeploy operation: " + myTopology.getDeployment().getStatus());
		} 
		catch (Exception ex)
		{
		  System.out.print(ex);
		}
	}
}
```

License
-------

Copyright 2013 Marin Litoiu, Hongbin Lu, Mark Shtern, Bradlley Simmons, Mike Smit

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
