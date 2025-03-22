# Online Java Chat Application

A fully functional online chat application built using Java. It utilizes **Spring Boot WebSocket** for real-time messaging, **Java Swing** for a user-friendly desktop GUI, **Docker** for containerizing the WebSocket server, and **Render** for easy deployment.

## Features
- **Real-time messaging** using WebSockets
- **User-friendly desktop interface** with Java Swing
- **Scalable backend** with Spring Boot
- **Secure communication** with WebSocket protocol
- **Dockerized backend** for seamless deployment
- **Hosted on Render** for easy accessibility

## Technologies Used
- **Java 17**
- **Spring Boot** (WebSocket, Web, Security)
- **Java Swing** (GUI)
- **Maven** (Dependency management)
- **Docker** (Containerization)
- **Render** (Cloud deployment)

## Setup Instructions

### 1. Clone the Repository
```sh
 git clone https://github.com/smokemoha/online-java-chat-app.git
 cd online-java-chat-app
```

### 2. Run the Backend Server (Spring Boot)
```sh
 mvn clean install
 mvn spring-boot:run
```

### 3. Run the Desktop Client (Java Swing)
```sh
 java -jar target/chat-client.jar
```

### 4. Running with Docker
#### Build the Docker Image
```sh
 docker build -t online-chat-app .
```
#### Run the Container
```sh
 docker run -p 8080:8080 online-chat-app
```

### 5. Deploying on Render
1. Push your code to **GitHub**.
2. Create a **new service** on [Render](https://render.com/).
3. Select your repository and configure build settings.
4. Deploy and access the chat app online!

