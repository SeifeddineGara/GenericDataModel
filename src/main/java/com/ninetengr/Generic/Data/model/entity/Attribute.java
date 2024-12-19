package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.*;
import lombok.Data;

// Entity for storing attributes
@Entity
@Table(name = "attribute")
@Data
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attributeId;

    @Column(nullable = false)
    private String attributeName;

    @Column(name = "attribute_type")
    private String attributeType;

    @Column(name = "is_required")
    private Boolean isRequired = false;
}
