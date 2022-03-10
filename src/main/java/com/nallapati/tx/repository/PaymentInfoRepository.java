package com.nallapati.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nallapati.tx.entity.PaymentInfo;
@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
