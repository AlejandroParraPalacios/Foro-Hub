package org.alura.Foro.ForoHub_Challenge.service;

import org.alura.Foro.ForoHub_Challenge.model.topicos;
import java.util.List;
public interface CRUD {
    // Metodo GET
    List<topicos> findAll();
    topicos findByID(Integer id);

    // Metodo POST
    topicos save(topicos topicos);

    //Metodo PUT
    topicos update(Integer id, topicos topicos);

    //Metodo DELETE
    void deleteById(Integer id);
}