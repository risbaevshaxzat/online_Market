package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsEntity;
import lombok.*;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "permissions")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Permission extends AbsEntity {

    @Enumerated(EnumType.STRING)
    private Permission name;
}
