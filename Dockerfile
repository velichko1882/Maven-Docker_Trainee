FROM ubuntu:18.04

MAINTAINER Valentin Velichko <velichko1880@gmail.com>

RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y maven

ADD oop .

RUN mvn package

CMD ["java", "-cp", "./target/classes/", "staff.Runner"]
