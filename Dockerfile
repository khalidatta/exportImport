FROM openjdk:8
EXPOSE 8080
ADD target/exportImport.jar exportImport.jar
ENTRYPOINT ["java","-jar","/exportImport.jar exportImport.jar"]