package com.javatechie.spring.batch.repository;

import com.javatechie.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
                                                           //Entity, Primary key return type
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
