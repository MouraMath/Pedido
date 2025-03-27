# Sistema de Pedidos - Produtor RabbitMQ 🚀    ||     Português - English


## 🇧🇷 Português

Este repositório faz parte de um projeto de estudo sobre mensageria utilizando RabbitMQ. Ele atua como **produtor** de mensagens, enviando pedidos para uma fila
que será consumida pelo serviço de processamento.

### Tecnologias utilizadas:
- Java 21
- Spring Boot 3
- RabbitMQ
- Spring AMQP

### Funcionalidades:
- Criação e gerenciamento de pedidos
- Envio de pedidos para processamento através de filas do RabbitMQ
- Demonstração prática do padrão de comunicação assíncrona

### Comunicação com serviço de Processamento:
Este serviço produz mensagens que são enviadas para filas do RabbitMQ e posteriormente consumidas pelo serviço de [Processamento](https://github.com/MouraMath/Processamento),
permitindo desacoplamento e escalabilidade entre os serviços.

### Como executar:
1. Certifique-se de ter o RabbitMQ instalado e rodando
2. Clone este repositório
3. Execute o projeto Spring Boot
4. Use a API para criar pedidos que serão enviados para processamento

## 🇬🇧 English

This repository is part of a study project on messaging using RabbitMQ. It acts as a **producer** of messages,
sending orders to a queue that will be consumed by the processing service.

### Technologies used:
- Java 21
- Spring Boot 3
- RabbitMQ
- Spring AMQP

### Features:
- Order creation and management
- Sending orders for processing through RabbitMQ queues
- Practical demonstration of asynchronous communication pattern

### Communication with Processing service:
This service produces messages that are sent to RabbitMQ queues and later consumed by the [Processing service](https://github.com/MouraMath/Processamento),
allowing decoupling and scalability between services.

### How to run:
1. Make sure you have RabbitMQ installed and running
2. Clone this repository
3. Run the Spring Boot project
4. Use the API to create orders that will be sent for processing
