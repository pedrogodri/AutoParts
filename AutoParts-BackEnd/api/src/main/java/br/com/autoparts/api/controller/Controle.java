package br.com.autoparts.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.autoparts.api.model.Funcionario;
import br.com.autoparts.api.model.Pessoa;
import br.com.autoparts.api.service.Servico;

@CrossOrigin(origins = "*")
@RestController
public class Controle {

    @Autowired
    private Servico servico;
    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/loginClient")
    public ResponseEntity<?> login(@RequestBody Pessoa p){
        return servico.verificarUser(p);
    }
    @PostMapping("/loginFuncionario")
    public ResponseEntity<?> login(@RequestBody Funcionario f){
        return servico.verificarFuncionario(f);
    }
    
}
