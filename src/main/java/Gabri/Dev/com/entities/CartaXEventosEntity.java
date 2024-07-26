package Gabri.Dev.com.entities;


import Gabri.Dev.com.models.TipoEvento;
import jakarta.persistence.*;

@Entity
@Table(name = "carta_x_eventos")
public class CartaXEventosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEvento tipoEvento;

    @ManyToOne
    @JoinColumn(name = "fk_id_carta")
    private CartaEntity carta;

}