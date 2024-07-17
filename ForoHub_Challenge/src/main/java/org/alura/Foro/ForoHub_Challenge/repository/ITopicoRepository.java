package org.alura.Foro.ForoHub_Challenge.repository;

import org.alura.Foro.ForoHub_Challenge.model.topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepository extends JpaRepository<topicos, Integer> {
}
