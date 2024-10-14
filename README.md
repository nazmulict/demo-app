# demo-app

## check the database username and password

## Assignment 1:
## Create a REST API using Spring Boot that returns a list of users in JSON format.
## Requirements:
## Create a simple User class with fields like id, name, and email.
## Implement a controller to return a hardcoded list of users as a JSON response.
## Run the rest API using curl command
```bash 
curl --location 'http://localhost:8080/api/users'
```

## Assignment 2:
## 2. Write a Spring Boot service that performs CRUD operations for a Product entity in a MySQL database.
## Requirements:
## Create a Product class with fields like id, name, and price.
## Implement the service to perform basic Create, Read, Update, Delete (CRUD) operation
## Run the rest API using curl command
## Create Product Info
```bash 
curl --location 'http://localhost:8080/api/create-product' \
--header 'Content-Type: application/json' \
--data '{
"id":1,
"name": "T-Shirt",
"price":100.00
}' 
```
## Update Product Info
```bash
curl --location --request PUT 'http://localhost:8080/api/update-product' \
--header 'Content-Type: application/json' \
--data '{
    "id":1,
    "name": "Long T-Shirt",
    "price":200.00
}'
```
## Get Product Info
```bash
curl --location 'http://localhost:8080/api/products?id=1'
```
## Delete Product Info
```bash
curl --location 'http://localhost:8080/api/delete-product?id=1'
```