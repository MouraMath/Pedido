# Sistema de Pedidos - Produtor RabbitMQ 🚀    ||     Português - English


## 🇧🇷 Português

Este repositório faz parte de um projeto de estudo sobre mensageria utilizando RabbitMQ e persistência de dados com PostgreSQL.
Ele atua como **produtor** de mensagens, enviando pedidos para uma fila que será consumida pelo serviço de processamento.

### Tecnologias utilizadas:
- Java 21
- Spring Boot 3
- RabbitMQ
- Spring AMQP
- PostgreSQL
- Spring Data JPA
- Lombok

### Funcionalidades:
- Criação e gerenciamento de pedidos
- Persistência de dados dos pedidos no PostgreSQL
- Envio de pedidos para processamento através de filas do RabbitMQ
- Demonstração prática do padrão de comunicação assíncrona

### Comunicação com serviço de Processamento:
Este serviço produz mensagens que são enviadas para filas do RabbitMQ e posteriormente consumidas pelo serviço de [Processamento](https://github.com/MouraMath/Processamento), 
permitindo desacoplamento e escalabilidade entre os serviços.

### Como executar:
1. Certifique-se de ter o RabbitMQ e o PostgreSQL instalados e rodando
2. Configure as credenciais do banco de dados no arquivo application.properties
3. Clone este repositório
4. Execute o projeto Spring Boot
5. Use a API para criar pedidos que serão persistidos e enviados para processamento

## 🇬🇧 English

This repository is part of a study project on messaging using RabbitMQ and data persistence with PostgreSQL.
It acts as a **producer** of messages, sending orders to a queue that will be consumed by the processing service.

### Technologies used:
- Java 21
- Spring Boot 3
- RabbitMQ
- Spring AMQP
- PostgreSQL
- Spring Data JPA
- Lombok

### Features:
- Order creation and management
- Order data persistence in PostgreSQL
- Sending orders for processing through RabbitMQ queues
- Practical demonstration of asynchronous communication pattern

### Communication with Processing service:
This service produces messages that are sent to RabbitMQ queues and later consumed by the [Processing service](https://github.com/MouraMath/Processamento),
allowing decoupling and scalability between services.

### How to run:
1. Make sure you have RabbitMQ and PostgreSQL installed and running
2. Configure the database credentials in the application.properties file
3. Clone this repository
4. Run the Spring Boot project
5. Use the API to create orders that will be persisted and sent for processing
