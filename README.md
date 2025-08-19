# TaskManagementSystem
A simple Task Management System built with Spring Boot.

## Features

\- RESTful API with a `/tms` context path  
\- Example endpoint: `/tms/hello` returns a JSON response  
\- JPA integration for entity management

## Getting Started
### Prerequisites

\- Java 21 (SDK 21)  
\- Maven

### Setup

1. Clone the repository:
```
git clone git@github.com:busyarone/TaskManagementSystem.git 
cd TaskManagementSystem
```

2. Build the project:
```
mvn clean install
```
3. Run the application:
```
mvn spring-boot:run
```
### Configuration
The application uses `/tms` as the context path. You can change it in `src/main/resources/application.properties`:

server.servlet.context-path=/tms
### Example Endpoint

\- `GET /tms/hello`  
  Response:
  ```json
  {
    "success": true,
    "result": "Hello World"
  }
```
License
This project is licensed under the MIT License.
This makes it clear that Java 21 is required.