# Rest-DAO-DTO API

This project is a RESTful API built with Java and Spring Boot, designed to manage data interactions between a `Maker` entity and a list of `Products`. The application uses the DAO (Data Access Object) and DTO (Data Transfer Object) patterns to ensure a clean and maintainable architecture.

## Features

- **CRUD operations**: Create, read, update, and delete operations for `Maker` and `Product` entities.
- **DAO Pattern**: Abstracts the data access logic, allowing for easier maintenance and scalability.
- **DTO Pattern**: Ensures that only necessary data is transferred between the client and the server, improving performance and security.
- **Database Persistence**: Uses MySQL for data storage, with JPA and Hibernate handling the ORM (Object-Relational Mapping).
- **RESTful Endpoints**: Provides RESTful APIs for easy integration with front-end applications.

## Technologies Used

- **Java**
- **Spring Boot**
- **JPA (Java Persistence API)**
- **Hibernate**
- **MySQL**
- **Maven**

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/OctavioToledo/Rest-DAO-DTO.git
    cd Rest-DAO-DTO
    ```

2. **Set up the MySQL database**:
    - Create a database named `your_database_name`.
    - Update the database configuration in `application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```

3. **Build and run the application**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. **Access the API**:
    - The API will be available at `http://localhost:8080`.

## API Endpoints

- **GET /makers**: Retrieve all makers.
- **GET /makers/{id}**: Retrieve a specific maker by ID.
- **POST /makers**: Create a new maker.
- **PUT /makers/{id}**: Update an existing maker by ID.
- **DELETE /makers/{id}**: Delete a maker by ID.

- **GET /products**: Retrieve all products.
- **GET /products/{id}**: Retrieve a specific product by ID.
- **POST /products**: Create a new product.
- **PUT /products/{id}**: Update an existing product by ID.
- **DELETE /products/{id}**: Delete a product by ID.

## Contributing

Feel free to fork this repository and submit pull requests. Any feedback or contributions are welcome!
