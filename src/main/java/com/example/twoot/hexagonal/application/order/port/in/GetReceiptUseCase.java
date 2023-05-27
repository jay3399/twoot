package com.example.twoot.hexagonal.application.order.port.in;

public interface GetReceiptUseCase {


  ReceiptResult getReceipt(String orderId);



}
