package com.gestionusuarios.usuarios.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "password")
    private String password;
}
