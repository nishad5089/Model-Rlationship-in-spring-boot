package com.hibarnaterationship.hibarnaterelationship.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(value = AccessLevel.PRIVATE)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    private String name;
    private String head;
}
