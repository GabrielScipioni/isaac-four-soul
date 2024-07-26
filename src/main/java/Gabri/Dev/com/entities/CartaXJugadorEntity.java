package Gabri.Dev.com.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "carta_x_jugador")
public class CartaXJugadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_carta")
    private CartaEntity carta;

    @ManyToOne
    @JoinColumn(name = "fk_id_jugador")
    private JugadorEntity jugador;

}