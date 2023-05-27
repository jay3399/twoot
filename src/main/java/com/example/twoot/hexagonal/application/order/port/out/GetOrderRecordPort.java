package com.example.twoot.hexagonal.application.order.port.out;

public interface GetOrderRecordPort {

  OrderRecord getOrder(String orderId);

}
