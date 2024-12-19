package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

// Base Entity for storing common attributes
@Entity
@Table(name = "base_entity")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // This is the key annotation
@DiscriminatorColumn(name = "entity_type", discriminatorType = DiscriminatorType.STRING)
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entityId;

    @Column(nullable = false)
    private String entityName;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt = new Date();

}
