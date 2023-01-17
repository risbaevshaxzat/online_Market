package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name = "ch_values")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CharacteristicValue extends AbsEntity {

    @NotBlank
    @Column(unique = true)
    private String value;


}
