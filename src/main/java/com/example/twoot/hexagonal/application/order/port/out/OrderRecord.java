package com.example.twoot.hexagonal.application.order.port.out;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;

@Getter
public class OrderRecord {


  @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
  private String orderId;
  private int money;

  public OrderRecord(String orderId, int money) {
    this.orderId = orderId;
    this.money = money;
  }

}
