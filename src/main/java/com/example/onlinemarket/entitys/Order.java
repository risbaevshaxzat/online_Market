package com.example.onlinemarket.entitys;


import com.example.onlinemarket.entitys.template.AbsEntity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "orders")
@EqualsAndHashCode(callSuper = true)
public class Order extends AbsEntity {
    @OneToMany(mappedBy = " ", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems = new java.util.ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private BigDecimal totalPrice;



    private Timestamp deliveredAt;




}
