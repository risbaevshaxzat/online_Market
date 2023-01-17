package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsNameEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity(name = "brands")
public class Brand extends AbsNameEntity {
    @NotBlank
    @Column(nullable = false)
    private String owner;
    @OneToOne
    private ImageData image;
    @NotBlank
    @Column(columnDefinition = "text",nullable = false)
    private String about;
}
