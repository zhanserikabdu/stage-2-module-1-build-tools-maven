# Build Tools

## Materials
+ [Download Maven](https://maven.apache.org/download.cgi)
+ [Maven Installation](https://maven.apache.org/install.html)
## Practice

### Task 1

1. Find root pom.xml in stage-2-module-1-build-tools-maven project. Now it looks like this:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>stage-2-module-1-build-tools-maven</artifactId>
    <packaging>pom</packaging>
    <version>1.0-SNAPSHOT</version>
    <modules>
        <module>utils</module>
        <module>demo</module>
    </modules>

    <properties>
        <junit.version>5.8.1</junit.version>
    </properties>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.junit.jupiter</groupId>
                <artifactId>junit-jupiter-params</artifactId>
                <version>${junit.version}</version>
                <scope>test</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    <build>
        <plugins>
            <plugin>
                <!-- something should be here-->
            </plugin>
        </plugins>
    </build>
</project>
```

- Add something to plugin section and make sure it is compatible with java 8

### Task 2

Custom jar `utils-1.3.5.jar` will be created with the following instructions:
 - The jar should contain class `StringUtils` with method `boolean isPositiveNumber(String str)`.
 - `Apache Commons Lang 3.10` library is used to implement this method.


1. Find pom.xml in 'utils' and fill it with proper groupId, artifactId and Apache Commons Lang 3.10 (or higher) dependency
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <artifactId>stage-2-module-1-build-tools-maven</artifactId>
        <groupId>org.example</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    
    <groupId> <!-- something should be here--></groupId>
    <artifactId> <!-- something should be here--></artifactId>
    <version> <!-- something should be here--></version>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
        <!-- something should be here-->
        
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

2. Implement method in StringUtils.class:
```java
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //here magic will happen
    }
}
```

### Task 3

Now we will use the created util class:
1. Find pom.xml in 'demo' and fill in everything that is missed:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>stage-2-module-1-build-tools-maven</artifactId>
        <groupId>org.example</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>demo</artifactId>
    <dependencies>
        <!-- something should be here-->
        
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```
2. Provide required implementation:
```java
public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
    }
}
```

### Task 4
Make sure that application passes all test suits.