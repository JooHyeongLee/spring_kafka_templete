package com.example.spring_kafka_templete.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Comment;

@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "User")
public class User extends BaseEntity {

    @Column(length = 300)
    @Comment("이름")
    private String name;
}
