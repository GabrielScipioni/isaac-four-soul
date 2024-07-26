package Gabri.Dev.com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "inicial")
public class InicialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200, nullable = false)
    private String detalle;

    @Column(length = 1000, nullable = false)
    private String imgUrl;

}