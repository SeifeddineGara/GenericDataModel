package com.ninetengr.Generic.Data.model.repository;

import com.ninetengr.Generic.Data.model.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {}
