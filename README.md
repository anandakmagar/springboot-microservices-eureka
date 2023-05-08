Spring Boot Microservices with Eureka
-------------------------------------
This is a simple application that has 3 client services and a server such as user-service, authentication-service, api-gatway-service, and service-discovery-service.

1. user-service has the methods that register the new user and finds all the registered uses.
2. authentication-service has the methods that authenticates the user with email and password.
3. api-gatway-service routes the user's requests to the specified services.
4. service-discovery-service registers the microservices.

Assigned Ports
--------------
1. user-service              : 8091
2. authentication-service    : 8093
3. api-gateway               : 8092
4. service-discovery-service : 8762

API Endpoints
-------------
1. Register User (POST)    : localhost:8092/user-service/users
2. Get All Users (GET)     : localhost:8092/user-service/users
3. Authenticate User (GET) : localhost:8092/authentication-service/authenticate/{email}/{password}

![1](https://user-images.githubusercontent.com/107140001/236745404-73e61227-5425-4fb0-90d3-34a79b7aff01.png)
