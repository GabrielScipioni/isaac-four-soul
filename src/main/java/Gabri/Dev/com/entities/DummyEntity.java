package Gabri.Dev.com.entities;

import jakarta.persistence.*;

@Entity
public class DummyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String dummy;

}
