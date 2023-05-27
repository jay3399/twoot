package com.example.twoot.hexagonal.adapter.out.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRecordRepository extends JpaRepository<OrderRecordEntity, String> {


}
