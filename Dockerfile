FROM openjdk:17
EXPOSE 8081
ADD target/app-login.jar app-login.jar
ENTRYPOINT ["java","-jar","/app-login.jar"]
   