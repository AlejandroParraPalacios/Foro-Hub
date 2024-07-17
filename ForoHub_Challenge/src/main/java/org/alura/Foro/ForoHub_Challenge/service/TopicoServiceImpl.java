package org.alura.Foro.ForoHub_Challenge.service;

import lombok.RequiredArgsConstructor;
import org.alura.Foro.ForoHub_Challenge.model.topicos;
import org.alura.Foro.ForoHub_Challenge.repository.ITopicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicoServiceImpl implements CRUD {
    private final ITopicoRepository repositorio;

    @Override
    public List<topicos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public topicos findByID(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public topicos save(topicos topicos) {
        return repositorio.save(topicos);
    }

    @Override
    public topicos update(Integer id, topicos topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
        repositorio.deleteById(id);
    }
}