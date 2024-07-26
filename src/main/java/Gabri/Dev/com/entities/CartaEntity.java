package Gabri.Dev.com.entities;


import Gabri.Dev.com.models.TipoCarta;
import jakarta.persistence.*;

@Entity
@Table(name = "cartas")
public class CartaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 1000)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoCarta tipoCarta;

    @Column(nullable = true)
    private int amount;

    // Getters and Setters
}
