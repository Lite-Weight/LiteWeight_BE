package com.woookk.dev.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@DynamicInsert
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(length = 45, nullable = false)
    private String email;

    @Column(length = 45)
    private String nickname;

    @Column(length = 45)
    private String birth;

    private String gender;

    private int height;
    private int weight;

    @ColumnDefault("2000")
    private int recommendedCalorie;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Food> foods = new ArrayList<>();
}
