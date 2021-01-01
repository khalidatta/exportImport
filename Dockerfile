FROM openjdk:8
ADD target/exportImportApi-0.0.1-SNAPSHOT.jar target/exportImportApi-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/target/exportImportApi-0.0.1-SNAPSHOT.jar"]