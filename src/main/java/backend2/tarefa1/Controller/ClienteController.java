package backend2.tarefa1.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backend2.tarefa1.model.Cliente;
import backend2.tarefa1.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {
    
    private final ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    @GetMapping("/buscar/{nome}")
    public ResponseEntity<Cliente> findByNome(@PathVariable String nome) {
        return clienteRepository.findByNome(nome)}

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);}

    @DeleteMapping("/delete/{nome}")
    public ResponseEntity<Void> delete(@PathVariable String nome, @RequestBody Cliente cliente) {
        return clienteRepository.deleteByNome(nome);
    }

            
}
