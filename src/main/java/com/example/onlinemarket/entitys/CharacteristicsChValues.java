package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsEntity;
import lombok.*;


import javax.persistence.*;

@Entity(name = "characteristics_ch_values")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class CharacteristicsChValues extends AbsEntity {



    @ManyToOne
    private CharacteristicValue characteristicValue;


}
