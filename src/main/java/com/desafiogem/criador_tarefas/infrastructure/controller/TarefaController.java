package com.desafiogem.criador_tarefas.infrastructure.controller;

import com.desafiogem.criador_tarefas.infrastructure.entity.Tarefa;
import com.desafiogem.criador_tarefas.infrastructure.repository.TarefasRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private final TarefasRepository tarefasRepository;

    public TarefaController(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    @PostMapping
    public ResponseEntity<Tarefa>salvaTarefa(@RequestBody Tarefa tarefa){
        return ResponseEntity.ok(tarefasRepository)
    }
}
