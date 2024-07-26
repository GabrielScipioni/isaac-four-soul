package Gabri.Dev.com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "personaje")
public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String detalle;

    @Column(nullable = false)
    private int vida;

    @Column(nullable = false)
    private int ataque;

    @ManyToOne
    @JoinColumn(name = "fk_id_inicial", nullable = false)
    private InicialEntity inicial;

    @Column(nullable = false, length = 1000)
    private String imgUrl;

    @Column
    private boolean fueUsada;

}