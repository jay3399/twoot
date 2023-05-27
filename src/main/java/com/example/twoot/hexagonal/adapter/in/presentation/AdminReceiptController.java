package com.example.twoot.hexagonal.adapter.in.presentation;


import com.example.twoot.hexagonal.application.order.port.in.GetReceiptUseCase;
import com.example.twoot.hexagonal.application.order.port.in.ReceiptResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AdminReceiptController {

  private final GetReceiptUseCase getReceiptUseCase;


  @GetMapping("/receipt/{orderId}")
  public ReceiptResult getReceipt(@PathVariable String orderId) {

    return getReceiptUseCase.getReceipt(orderId);


  }



}
