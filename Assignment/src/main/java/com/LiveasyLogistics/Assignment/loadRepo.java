package com.LiveasyLogistics.Assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface loadRepo extends JpaRepository<load,Long> {
    List<load> findByShipperId(Long shipperId);
}
