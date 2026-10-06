FROM eclipse-temurin:17-jdk
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/jenkins-cicd-pipeline.jar jenkins-cicd-pipeline.jar.jar
ENTRYPOINT ["java","-jar","/jenkins-cicd-pipeline.jar.jar"]