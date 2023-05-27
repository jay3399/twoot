package com.example.twoot.hexagonal.adapter.out.infrastructure.persistence;

import com.example.twoot.hexagonal.application.order.port.out.OrderRecord;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class OrderRecordEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private int money;


  private void setRecord(OrderRecord orderRecord) {
    this.id = orderRecord.getOrderId();
    this.money = orderRecord.getMoney();
  }

  public static OrderRecordEntity from(OrderRecord orderRecord) {
    OrderRecordEntity orderRecordEntity = new OrderRecordEntity();

    orderRecordEntity.setRecord(orderRecord);

    return orderRecordEntity;
  }




}
