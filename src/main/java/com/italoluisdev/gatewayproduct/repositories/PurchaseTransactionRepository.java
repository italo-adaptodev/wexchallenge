package com.italoluisdev.gatewayproduct.repositories;

import com.italoluisdev.gatewayproduct.entities.PurchaseTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseTransactionRepository  extends JpaRepository<PurchaseTransaction, Long> {
}