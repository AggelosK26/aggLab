![Build status](https://github.com/AggelosK26/aggLab/actions/workflows/maven.yml/badge.svg)

# technologies and tools used to buid this project


## Maven: The project is managed and built using Maven, a build automation and dependency management tool.

## Java: The project is written in Java programming language.

## JUnit: The JUnit framework is used for unit testing. It is included as a dependency for testing purposes.

## Mockito: The Mockito framework is used for mocking dependencies in unit tests. It is included as a dependency for testing purposes.

## JaCoCo: The JaCoCo Maven plugin is used for code coverage reporting. It generates code coverage reports to measure the extent of code covered by unit tests.

## gradeshistogram: This is one of the project modules, which contains code related to generating histograms for grades.

## unittesting: This is another project module, which contains code related to unit testing and includes test classes and test cases for the functionality being tested.

# how to build and run the project.

1. cd into seip2023_practical_assignments 
2. mvn package
3. java -jar gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar grades.txt

- [Link to io Folder](seip2023_practical_assignments/unittesting/src/main/java/io)
- [Link to math Folder](seip2023_practical_assignments/unittesting/src/main/java/math)
- [Link to io Folder with the test cases](seip2023_practical_assignments/unittesting/src/test/java/io)
- [Link to math Folder with the test cases](seip2023_practical_assignments/unittesting/src/test/java/math)