package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.*;

// Entity for defining relationships between different entity instances
@Entity
@Table(name = "entity_relationship")
public class EntityRelationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relationshipId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_instance_id")
    private EntityInstance fromInstance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_instance_id")
    private EntityInstance toInstance;

    @Column(name = "relationship_type")
    private String relationshipType;

}
