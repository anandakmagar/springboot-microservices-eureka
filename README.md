Spring Boot Microservices with Eureka
-------------------------------------
This is a simple application that has 3 client services and a server such as user-service, authentication-service, api-gatway, and service-registry.

1. user-service has methods, one registers the new user and another finds all the registered users.
2. authentication-service has a method that authenticates the user with email and password.
3. api-gatway routes the user's requests to the specified services.
4. service-registry registers the microservices.

Assigned Ports
--------------
1. user-service              : 8091
2. authentication-service    : 8093
3. api-gateway               : 8092
4. service-registry : 8761

API Endpoints
-------------
1. Register User (POST)    : localhost:8092/user-service/users
2. Get All Users (GET)     : localhost:8092/user-service/users
3. Authenticate User (GET) : localhost:8092/authentication-service/authenticate/{email}/{password}

![1](https://user-images.githubusercontent.com/107140001/236755213-7ef8b930-dbfb-49d1-adda-608a1afcfcb7.png)

