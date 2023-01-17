package com.example.onlinemarket.entitys;


import com.example.onlinemarket.entitys.template.AbsNameEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity(name = "categories")
@EqualsAndHashCode(callSuper = true)
public class Category extends AbsNameEntity {
    @ManyToOne
    private  Category parent;
}
