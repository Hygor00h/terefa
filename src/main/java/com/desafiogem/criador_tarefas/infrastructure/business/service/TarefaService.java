package com.desafiogem.criador_tarefas.infrastructure.business.service;

import com.desafiogem.criador_tarefas.infrastructure.entity.Tarefa;
import com.desafiogem.criador_tarefas.infrastructure.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    private final TarefasRepository tarefasRepository;

    @Autowired
    public TarefaService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    public Tarefa salvaTarefa(Tarefa tarefa){
        return tarefasRepository.save(tarefa);
    }
}
