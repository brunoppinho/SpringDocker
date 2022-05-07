package br.com.letscode.springdocker.controller;

import br.com.letscode.springdocker.model.Pessoa;
import br.com.letscode.springdocker.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PessoaController {

    private final PessoaService service;

    @GetMapping("pessoa")
    public List<Pessoa> lista() {
        return service.lista();
    }

    @GetMapping("pessoa/{id}")
    public Pessoa lista(@PathVariable Long id) {
        return service.obtem(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("pessoa")
    public Pessoa adiciona(@RequestBody Pessoa pessoa) {
        return service.adiciona(pessoa);
    }

}
