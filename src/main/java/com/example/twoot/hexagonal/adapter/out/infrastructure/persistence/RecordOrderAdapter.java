package com.example.twoot.hexagonal.adapter.out.infrastructure.persistence;


import com.example.twoot.hexagonal.application.order.port.out.GetOrderRecordPort;
import com.example.twoot.hexagonal.application.order.port.out.OrderRecord;
import com.example.twoot.hexagonal.application.order.port.out.RecordOrderPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RecordOrderAdapter implements RecordOrderPort, GetOrderRecordPort {

  private final OrderRecordRepository recordRepository;

  @Override
  public OrderRecord getOrder(String orderId) {

    OrderRecordRepository recordRepository1 = recordRepository;
    OrderRecordEntity orderRecordEntity = recordRepository1.findById(orderId)
        .orElseThrow(IllegalAccessError::new);

    return new OrderRecord(orderRecordEntity.getId(), orderRecordEntity.getMoney());
  }

  @Override
  public void recordOrder(OrderRecord orderRecord) {

    recordRepository.save(OrderRecordEntity.from(orderRecord));

  }
}
