package com.example.supercoding2stsohee.repository.product;

import com.example.supercoding2stsohee.repository.users.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private Integer productPrice;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "product_status", nullable = false)
    private String productStatus;

    @Column(name = "rating", nullable = false)
    private Float rating;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "finish_at")
    private LocalDateTime finishedAt;


}
