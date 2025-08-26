package com.desafiogem.criador_tarefas.infrastructure.repository;

import com.desafiogem.criador_tarefas.infrastructure.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository <Tarefa, Long> {
}
