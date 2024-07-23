package one.digitalinnovation.gof.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null); // ou lançar uma exceção se preferir
    }

    public void inserir(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            cliente.setId(id); // Certifique-se de que o ID está sendo atualizado
            clienteRepository.save(cliente);
        } else {
            // lançar uma exceção se o cliente não for encontrado
        }
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
