FROM openjdk:8

ADD target/jenkins-docker-git.jar jenkins-docker-git.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","jenkins-docker-git.jar"]