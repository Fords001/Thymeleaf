package com.app.thym.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="`person_table`")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="firstname")
    String firstName;

    @Column(name="lastname")
    String lastName;

    @Column(name="email")
    String email;
}
