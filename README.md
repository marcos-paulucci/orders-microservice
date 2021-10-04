mvn clean package spring-boot:repackage

docker build --tag=orders-server:latest .

docker run -p8080:8080 orders-server:latest

curl localhost:8080/orders

docker-compose up
