# Swagger Code Generator

## Overview
This is the swagger codegen project customized for [Pattern Deployer](https://github.com/ceraslabs/pattern-deployer), which allows generation of client libraries automatically from a 
Pattern Deployer server.  You can find out more about both the spec and the framework at 
http://swagger.wordnik.com.  For more information about Pattern Deployer's APIs, please visit https://github.com/ceraslabs/pattern-deployer/wiki.  

### Prerequisites
You need the following installed and available in your $PATH:

* [Java 1.6](http://java.oracle.com)

* [Apache maven 3.0.3 or greater](http://maven.apache.org/)

* [Scala 2.9.1](http://www.scala-lang.org)

You also need to add the scala binary to your PATH.

After cloning the project, you need to build it from source with this command:

```
mvn package
```

### To generate a [Pattern Deployer](https://github.com/ceraslabs/pattern-deployer) client library
You can build a Java client against Pattern Deployer's API as follows:

```
./bin/runscala.sh patterndeployer/java/JavaPatterndeployer.scala http://YOUR_SERVER_URL/api_docs.json
```

This will run the script in [patterndeployer/java/JavaPatterndeployer.scala](https://github.com/ceraslabs/swagger-codegen/blob/master/patterndeployer/java/JavaPatterndeployer.scala) and create the client.  You can then
compile and package the client:

```
cd patterndeployer/java
mvn package
```

You will probably want to override some of the defaults--like packages, etc.  For doing this, just modify the scala
script [JavaPatterndeployer.scala](https://github.com/ceraslabs/swagger-codegen/blob/master/patterndeployer/java/JavaPatterndeployer.scala) with the overrides you want.

### Modifying the client library format
Don't like the default swagger client syntax?  Want a different language supported?  No problem!  Swagger codegen
processes mustache templates with the [scalate](http://scalate.fusesource.org/) engine.  You can modify our templates or
make your own.

You can look at [src/main/resources/Java](https://github.com/ceraslabs/swagger-codegen/tree/master/src/main/resources/Java) for examples.  To make your own templates, modify the files
in that folder.  It actually is that easy.

### To package the client library

This will package the Pattern Deployer client library.  

```
cd patterndeployer/java
mvn package
```

Now you should see the library being package as Jar files in the folder patterndeployer/java/target.

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
