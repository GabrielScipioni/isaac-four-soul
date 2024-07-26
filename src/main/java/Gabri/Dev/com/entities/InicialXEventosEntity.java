package Gabri.Dev.com.entities;

import Gabri.Dev.com.models.TipoEvento;
import jakarta.persistence.*;

@Entity
@Table(name = "inicialXEventos")
public class InicialXEventosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEvento tipoEvento;

    @ManyToOne
    @JoinColumn(name = "fk_id_inicial", nullable = false)
    private InicialEntity inicial;

}