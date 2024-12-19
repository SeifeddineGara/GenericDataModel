package com.ninetengr.Generic.Data.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

// Entity for storing attribute values for a specific entity instance
@Entity
@Table(name = "attribute_value")
@Data
public class AttributeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attributeValueId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "instance_id")
    private EntityInstance instance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    @Column(name = "value_text")
    private String valueText;

    @Column(name = "value_number")
    private Double valueNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "value_date")
    private Date valueDate;

    @Column(name = "value_boolean")
    private Boolean valueBoolean;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt = new Date();

}
