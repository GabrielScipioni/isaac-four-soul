package Gabri.Dev.com.entities;

import Gabri.Dev.com.models.EstadoJugador;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "jugador")
public class JugadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int monedas;

    @Column(nullable = false)
    @Min(1)
    @Max(4)
    private int ordenJugador; //del 1 al 4

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoJugador estadoJugador;

    @ManyToOne
    @JoinColumn(name = "fk_id_usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "fk_id_juego")
    private JuegoEntity juego;

    @ManyToOne
    @JoinColumn(name = "fk_id_personaje")
    private PersonajeEntity personaje;

    @Column(nullable = false)
    private boolean gano;
}