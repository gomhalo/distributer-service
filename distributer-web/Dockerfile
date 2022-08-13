FROM openjdk:8-jdk-alpine
MAINTAINER amanuel.com
ADD target/distributer-web-0.0.1-SNAPSHOT.war distributer-web.war
ENTRYPOINT ["java","-jar","/distributer-web.war"]