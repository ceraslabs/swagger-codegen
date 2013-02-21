import com.wordnik.swagger.codegen.BasicJavaGenerator

object JavaPetstoreCodegen extends BasicJavaGenerator {
  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "Java"

  // where to write generated code
  override def destinationDir = "patterndeployer/java/src/main/java"

  // package for api invoker, error files
  override def invokerPackage = Some("com.patterndeployer")

  // package for models
  override def modelPackage = Some("com.patterndeployer.model")

  // package for api classes
  override def apiPackage = Some("com.patterndeployer.api")

  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replaceAll("\\.", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replaceAll("\\.", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
      ("pom.mustache", "patterndeployer/java", "pom.xml"))
}
