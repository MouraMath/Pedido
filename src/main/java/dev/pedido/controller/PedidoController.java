package dev.pedido.controller;


import dev.pedido.model.Pedido;
import dev.pedido.service.PedidoService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final RabbitTemplate rabbitTemplate;
    private final PedidoService pedidoService;


    public PedidoController(RabbitTemplate rabbitTemplate, PedidoService pedidoService) {
        this.rabbitTemplate = rabbitTemplate;
        this.pedidoService = pedidoService;
    }
    @Value("${broker.queue.processamento.name}")
    private String routingKey;


    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido) {
        Pedido pedidoSalvo = pedidoService.salvarPedido(pedido);
        rabbitTemplate.convertAndSend(exchange: "", routingKey, pedidoSalvo.getDescricao());
        return "Pedido salvo e enviado para processamento: " +pedido.getDescricao();
    }

    @GetMapping
    public List<Pedido> listaPedidos(){
        return pedidoService.listarPedidos();
    }

}
