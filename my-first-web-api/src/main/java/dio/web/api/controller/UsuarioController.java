package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.listAll();
    }

    @GetMapping("/{nome}")
    public Usuario getUsuarioByNome(@PathVariable String nome) {
        List<Usuario> usuarios = usuarioRepository.listAll();
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null; // ou uma resposta adequada, como HttpStatus.NOT_FOUND
    }
}
