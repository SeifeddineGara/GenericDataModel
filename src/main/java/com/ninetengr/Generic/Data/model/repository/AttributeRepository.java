package com.ninetengr.Generic.Data.model.repository;

import com.ninetengr.Generic.Data.model.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {}
