package com.example.onlinemarket.entitys;

import com.example.onlinemarket.entitys.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "order_items")
public class OrderItem extends AbsEntity {
    @ManyToOne
    private Product product;

    private Integer qty;
    @ManyToOne
    private Order order;

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", qty=" + qty +
                '}';
    }
}