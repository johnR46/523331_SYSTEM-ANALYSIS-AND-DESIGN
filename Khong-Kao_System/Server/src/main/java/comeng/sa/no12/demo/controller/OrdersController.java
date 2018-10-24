package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Orders;
import comeng.sa.no12.demo.repository.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.Date;
import lombok.*;


@RestController

class OrdersController {
    
    @Autowired 
    private OrdersRepository ordersRepository;

    public OrdersController(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @GetMapping("/Orders")
    public Collection<Orders> Orders(){
        return ordersRepository.findAll().stream().collect(Collectors.toList());
		}


    
}