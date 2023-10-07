# Agile-SQA-and-Testing
1. Generating Test Cases: 
- If all required tools are Eclipse IDE, Maven, and EvoSuite are running well,
    - Download the source code for the project
    - Open Eclipse IDE and import the project selecting the option “import existing Project”
    - Open the terminal on the main directory of the application.
- Add Evosuite Dependency in POM.XML File
    ```
      <build>  
      <plugins>
      <plugin>      
          <groupId>org.evosuite.plugins</groupId>      
          <artifactId>evosuite-maven-plugin</artifactId>
          <version>1.0.6</version>
      </plugin>
      </plugins>
      </build> 
  ```
- Resolve dependencies  
  ```
      <pluginRepositories>
      <pluginRepository>
          <id>EvoSuite</id>
          <name>EvoSuite Repository</name>
          <url>http://www.evosuite.org/m2</url>
      </pluginRepository>
      </pluginRepositories>
    ```
    Add it at the end, before the closing \<\/project\> tag.
