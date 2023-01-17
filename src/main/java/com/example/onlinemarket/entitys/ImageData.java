package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "images")
@EqualsAndHashCode(callSuper = true)
public class ImageData extends AbsEntity {

    private String photoName;

}
