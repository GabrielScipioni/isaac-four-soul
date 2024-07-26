package Gabri.Dev.com.entities;

import Gabri.Dev.com.models.EstadoJuego;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "juego")
public class JuegoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Column(name = "fecha_terminado")
    @Temporal(TemporalType.DATE)
    private Date fechaTerminado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoJuego estadoJuego;

}
