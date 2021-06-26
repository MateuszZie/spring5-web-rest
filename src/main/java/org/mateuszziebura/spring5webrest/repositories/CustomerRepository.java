package org.mateuszziebura.spring5webrest.repositories;

import org.mateuszziebura.spring5webrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
