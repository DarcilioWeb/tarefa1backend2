package backend2.tarefa1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idCliente;

    @Column(length = 200, nullable = false)
    private String nome;
}