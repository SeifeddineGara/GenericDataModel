package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

// Entity for storing specific entity definitions
@Entity
@DiscriminatorValue("EntityDefinition")
@Data
public class EntityDefinition extends BaseEntity {

   /* @Column(name = "entity_type", nullable = false)
    private String entityType;*/
}
