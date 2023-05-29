package com.example.twoot.hexagonal.application.order.service;
import com.example.twoot.hexagonal.application.order.port.in.OrderRequest;
import com.example.twoot.hexagonal.application.order.port.in.OrderResult;
import com.example.twoot.hexagonal.application.order.port.in.PlaceOrderUseCase;
import com.example.twoot.hexagonal.application.order.port.out.OrderRecord;
import com.example.twoot.hexagonal.application.order.port.out.RecordOrderPort;
import com.example.twoot.hexagonal.domain.Order;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class PlaceOrderService implements PlaceOrderUseCase {
  private final RecordOrderPort recordOrderPort;

  @Override
  public OrderResult placeOrder(OrderRequest orderDetail) {

    Order order = new Order(UUID.randomUUID().toString(), orderDetail.getMoney());

    order.place();

    recordOrderPort.recordOrder(new OrderRecord(order.getId(), order.getMoney()));


    return new OrderResult(order.getId(), order.getMoney());
  }
}
