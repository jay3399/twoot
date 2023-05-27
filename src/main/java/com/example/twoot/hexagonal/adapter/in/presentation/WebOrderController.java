package com.example.twoot.hexagonal.adapter.in.presentation;


import com.example.twoot.hexagonal.application.order.port.in.OrderRequest;
import com.example.twoot.hexagonal.application.order.port.in.OrderResult;
import com.example.twoot.hexagonal.application.order.port.in.PlaceOrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WebOrderController {


  private final PlaceOrderUseCase orderUseCase;

  @GetMapping("/web/{money}")
  public OrderResult order(@PathVariable int money) {

    OrderRequest orderRequest = new OrderRequest(money);

    return orderUseCase.placeOrder(orderRequest);


  }


}
