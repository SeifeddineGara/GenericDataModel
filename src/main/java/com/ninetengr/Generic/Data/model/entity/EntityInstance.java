package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

// Entity for storing instances of entities
@Entity
@Table(name = "entity_instance")
@Data
public class EntityInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instanceId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entity_id")
    private EntityDefinition entity;

    @Column(name = "instance_name")
    private String instanceName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt = new Date();

}

