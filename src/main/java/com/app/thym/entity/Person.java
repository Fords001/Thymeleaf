package com.app.thym.entity;


import com.sun.istack.NotNull;
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
    @NotNull
    int id;

    @NotNull
    @Column(name="firstname")
    String firstName;

    @NotNull
    @Column(name="lastname")
    String lastName;

    @NotNull
    @Column(name="email")
    String email;
}
