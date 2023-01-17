package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsNameEntity;
import lombok.*;


import javax.persistence.*;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity(name = "products")
public class Product extends AbsNameEntity {

    private Double price;

    private Integer amount;

    @OneToOne(cascade = CascadeType.REMOVE)
    private ImageData mainImage;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ImageData> image;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Brand brand;

    @ManyToMany
    private List<CharacteristicsChValues> characteristicsChValues;

}
