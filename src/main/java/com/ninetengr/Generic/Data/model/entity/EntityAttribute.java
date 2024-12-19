package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.*;
import lombok.Data;

// Entity for linking entities and their default/custom attributes
@Entity
@Table(name = "entity_attribute")
@Data
public class EntityAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entityAttributeId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entity_id")
    private EntityDefinition entity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    @Column(name = "is_default")
    private Boolean isDefault = false;

}
