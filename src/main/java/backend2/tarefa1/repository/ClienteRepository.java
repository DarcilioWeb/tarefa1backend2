package backend2.tarefa1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import backend2.tarefa1.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    
    List<Cliente> findByNome(String nome);
}
