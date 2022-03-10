package com.nallapati.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nallapati.tx.entity.PassengerInfo;
@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
