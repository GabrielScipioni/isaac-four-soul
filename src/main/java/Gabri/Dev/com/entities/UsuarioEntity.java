package Gabri.Dev.com.entities;

import Gabri.Dev.com.models.EstadoUsuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.Date;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 100)
    private String username;

    @Column(nullable = true, length = 200)
    @Email
    private String email;

    @Column(nullable = true, length = 100)
    private String password;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Column(name = "ultima_sesion")
    @Temporal(TemporalType.DATE)
    private Date ultimaSesion;

    @Column(name = "fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    @Column(name = "fin_ban", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date finban;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoUsuario estadoUsuario;

}