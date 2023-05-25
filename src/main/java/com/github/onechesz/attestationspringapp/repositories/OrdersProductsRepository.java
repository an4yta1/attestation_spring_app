package com.github.onechesz.attestationspringapp.repositories;

import com.github.onechesz.attestationspringapp.embeddable.OrdersProductsKey;
import com.github.onechesz.attestationspringapp.entities.OrdersProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersProductsRepository extends JpaRepository<OrdersProductsEntity, OrdersProductsKey> {

}
