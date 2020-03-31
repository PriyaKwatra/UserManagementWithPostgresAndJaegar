FROM java:8

COPY target/user-management-0.0.1-SNAPSHOT.jar /etc/nagp/user-management.jar

WORKDIR /etc/nagp

EXPOSE 8000

ENTRYPOINT ["java","-jar","user-management.jar"]