# spark-thymeleaf-skeleton

This repository offer a simple skeleton to build a **Spark** application with **Thymeleaf** templates.

### Dependencies

For this skeleton app, all dependencies are summarized to these:

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>com.sparkjava</groupId>
      <artifactId>spark-core</artifactId>
      <version>2.5.4</version>
    </dependency>
    <dependency>
      <groupId>com.sparkjava</groupId>
      <artifactId>spark-template-thymeleaf</artifactId>
      <version>2.3</version>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-simple</artifactId>
      <version>1.7.22</version>
    </dependency>

### Usage

**Spark** needs to run on Java 8. To install and compile, run:

    mvn compile

To execute a local server (with SLF4J), run:

    mvn exec:java

### License

The MIT License (MIT). Please see [License File](LICENSE) for more information.
