# This is a Spring Boot project to demonstrate spring security's in memory authentication and authorization features.
# Spring Boot provide us with security starter spring-boot-starter-security which adds a basic login form and authentication functionality to our application.
# The default authentication configuration takes in a user named "user" and password is displayed in the console everytime the app is started.
# In this application, I've created a simple REST controller with 3 different APIs having GET mapping and all three of them return API specific string message.
# The 3 APIs are:
              i.) Mapped to / for all users and do not require any credentials
              ii.) Mapped to /user for roles USER and ADMIN
              iii.) Mapped to /admin for roles ADMIN.
# This project is using Spring Boot version 2.4.4 and Java 11, please note, the security configurer (WebSecurityConfigurerAdapter) used in this project has been deprecated starting from Spring Boot version 2.7.0
# WebSecurityConfigurerAdapter provides us with number of methods, in this application, I'm using the configure() method for authentication and authorization.
# The auhtentication can be configured using AuthenticationManagerBuilder object and authorization can be configured using HttpSecurity object (see class SecurityConfiguration.java).
