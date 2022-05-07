package br.com.letscode.springdocker.service;

import br.com.letscode.springdocker.model.Pessoa;
import br.com.letscode.springdocker.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PessoaService {

    private final PessoaRepository repository;

    public List<Pessoa> lista() {
        log.info("Listando pessoas");
        return repository.findAll();
    }

    public Optional<Pessoa> obtem(Long id) {
        log.info("Listando pessoa cujo id é {}", id);
        return repository.findById(id);
    }

    public Pessoa adiciona(Pessoa pessoa) {
        log.info("Adicionando {}", pessoa);
        return repository.save(pessoa);
    }

}
