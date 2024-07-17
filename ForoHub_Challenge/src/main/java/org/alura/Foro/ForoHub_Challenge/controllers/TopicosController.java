package org.alura.Foro.ForoHub_Challenge.controllers;

import lombok.RequiredArgsConstructor;
import org.alura.Foro.ForoHub_Challenge.model.topicos;
import org.alura.Foro.ForoHub_Challenge.service.TopicoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
@RequiredArgsConstructor
public class TopicosController {
    private final TopicoServiceImpl service;

    @GetMapping
    public ResponseEntity<List<topicos>> findAll() {
        List<topicos> respuestaHttp = service.findAll();
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<topicos> findById(@PathVariable Integer id) {
        topicos respuestaHttp = service.findByID(id);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<topicos> save(@RequestBody topicos topicos) {
        topicos respuestaHttp = service.save(topicos);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<topicos> update(@PathVariable Integer id, @RequestBody topicos topicos) {
        topicos respuestaHttp = service.update(id, topicos);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}