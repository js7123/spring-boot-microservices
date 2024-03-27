# spring-boot-microservices
Microservices implemented with Spring Boot, Spring Cloud, Spring JPA, MySQL and Eureka server.

Implements three microservices: configuration, discovery and profile management.

Supports the following HTTP calls:

1) POST servername:8083 
   Adds an employee profile to the database.

2) GET servername:8083 
   Retrieves all employee profiles available in the database.

Prerequisites:

Database requirements:

MySQL database must be running in the host and have a 'profile_management' database. Database credentials provided must correspond to user with access to that database.

Remote configuration:

A remote properties file should be available in GitHub. Please see https://github.com/js7123/spring-boot-microservices-remote-config.


Usage Notes:

Start services in the following order:

1 - Configuration server 
2 - Discovery server 
3 - Profile Management server

A server can be started running the following command from the source directory. 
For example, for the configuration file:

Source directory: /microservice/configserver

Maven commands to run: mvn clean mvn spring-boot:run
