package Gabri.Dev.com.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "enemigos")
public class EnemigosEntity {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String detalle;

    @Column(nullable = true)
    private int vida;

    @Column(nullable = true)
    private int ataque;
  
    @Column(nullable = true)
    private int dado_num;

    @Column(nullable = false, length = 1000)
    private String imgUrl;


}
