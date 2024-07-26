package Gabri.Dev.com.entities;

import Gabri.Dev.com.models.TipoEvento;
import jakarta.persistence.*;

@Entity
@Table(name = "personaje_x_eventos")
public class PersonajeXEventosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    @ManyToOne
    @JoinColumn(name = "fk_id_personaje")
    private PersonajeEntity personaje;

}
