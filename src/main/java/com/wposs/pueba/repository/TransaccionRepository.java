package com.wposs.pueba.repository;

import com.wposs.pueba.entities.TranasaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository<TranasaccionEntity, Long> {
}
