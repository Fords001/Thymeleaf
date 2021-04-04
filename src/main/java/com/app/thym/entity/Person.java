package com.app.thym.entity;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
    @NotBlank(message = "Firstname should not be empty")
    @Size(min=2 ,max=30 , message="Firstname should be between 2 and 30 characters")
    String firstName;

    @Column(name="lastname")
    @NotBlank(message = "Lastname should not be empty")
    @Size(min=2 ,max=30 , message="Lastname should be between 2 and 30 characters")
    String lastName;

    @Column(name="email")
    @NotBlank(message = "Email should not be empty")
    @Size(min=2 ,max=30 , message="Email should be between 2 and 30 characters")
    String email;
}
