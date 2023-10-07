# Agile-SQA-and-Testing
1. Generating Test Cases: 
- If all required tools are Eclipse IDE, Maven, and EvoSuite are running well,
    - Download the source code for the project
    - Open Eclipse IDE and import the project selecting the option “import existing Project”
    - Open the terminal on the main directory of the application.
- Add Evosuite Dependency in POM.XML File

  \<build\>
  
      \<plugins\>
      \<plugin\>
  
  \<groupId\>org.evosuite.plugins\<\/groupId\>
  
  <artifactId>evosuite-maven-plugin</artifactId>
  <version>1.0.6</version>
  </plugin>
  </plugins>
  </build> 
  
- Resolve dependencies
  <pluginRepositories>
  <pluginRepository>
  <id>EvoSuite</id>
  <name>EvoSuite Repository</name>
  <url>http://www.evosuite.org/m2</url>
  </pluginRepository>
  </pluginRepositories>

Add it at the end, before the closing </project> tag.
- Generate Test cases
    - mvn evosuite:generate
    - mvn -Dcores=4 evosuite:generate -D memoryInMB=3500 -D timeInMinutesPerClass=1
- Export Test Cases
    - mvn evosuite:export
- Execute the generated test cases

Add a new item to the <dependencies> tag in pom.xml:

  <dependency>
  <groupId>org.evosuite</groupId>
  <artifactId>evosuite-standalone-runtime</artifactId>
  <version>1.0.6</version>
  <scope>test</scope>
  </dependency>

The same needs to be updated in the Eclipse build path.  Finally, right-click and run the project as Junit.
1. Examine Defects4j

Defects4J is a collection of reproducible bugs and a supporting infrastructure with the goal of advancing software engineering research.

- compile
- test
- fix and recompile the code.
