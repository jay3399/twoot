package com.example.twoot.hexagonal.application.order.service;

import com.example.twoot.hexagonal.application.order.port.in.GetReceiptUseCase;
import com.example.twoot.hexagonal.application.order.port.in.ReceiptResult;
import com.example.twoot.hexagonal.application.order.port.out.GetOrderRecordPort;
import com.example.twoot.hexagonal.application.order.port.out.OrderRecord;
import com.example.twoot.hexagonal.domain.Receipt;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetReceiptService implements GetReceiptUseCase {


  private final GetOrderRecordPort orderRecordPort;

  @Override
  public ReceiptResult getReceipt(String orderId) {

    OrderRecord order = orderRecordPort.getOrder(orderId);

    Receipt receipt = new Receipt(order.getOrderId(), order.getMoney());

    return new ReceiptResult(order.getOrderId(), order.getMoney());


  }
}
