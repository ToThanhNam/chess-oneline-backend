package com.chessgame.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;
    
    private String description;
    
    @Column(nullable = false)
    private String resource;
    
    @Column(nullable = false)
    private String action;

    @Column(columnDefinition = "jsonb", nullable = false) // Annotation to define the column type as JSONB
    private String conditions;

    @CreationTimestamp // Annotation to automatically set the creation timestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp // Annotation to automatically set the update timestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
} 