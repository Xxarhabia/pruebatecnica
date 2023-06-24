package com.wposs.pueba.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "apellido_usuario")
    private String apellidoUsuario;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "numero_cuenta")
    private String numeroCuenta;
}
