Order Management System
A simple Spring Boot REST API to manage customer orders and products, built for easy extensibility. Features boilerplate reduction with Lombok and in-browser API docs/test UI powered by Swagger.

Getting Started
Prerequisites
Before you begin, make sure you have:

Java 17 or above

Maven (or compatible build tool)

MySQL (or the DB configured in your application, if using persistence)

An IDE like IntelliJ IDEA or Eclipse with Lombok support

Setup & Run
1. Clone this repository:
git clone https://github.com/kavanjoshi127/ecommerce.git
cd order-management-system

2. Build the project:
mvn clean install

3. Run the application:
mvn spring-boot:run

Or, start the Application main class directly from your IDE:
@SpringBootApplication
public class ProductOrderManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductOrderManagementApplication.class, args);
    }
}


API Access: 
Step1: Import the postman collection from the GitHub to your postman.

Step2: One by One run all the requests.
