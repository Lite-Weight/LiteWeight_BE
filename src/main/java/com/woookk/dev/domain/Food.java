package com.woookk.dev.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Food extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int calorie;

    @Column(nullable = false)
    private int carbohydrate;

    @Column(nullable = false)
    private int protein;

    @Column(nullable = false)
    private int fat;

    @Column(name = "satuated_fat", nullable = false)
    private int satuatedFat;

    @Column(name = "trans_fat",nullable = false)
    private int transFat;

    @Column(nullable = false)
    private int cholesterol;

    @Column(nullable = false)
    private int natrium;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "food", cascade = CascadeType.ALL)
    private FoodImage foodImage;
}
