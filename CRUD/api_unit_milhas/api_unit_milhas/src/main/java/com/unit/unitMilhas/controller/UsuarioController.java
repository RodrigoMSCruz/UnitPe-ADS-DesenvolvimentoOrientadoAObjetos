package com.unit.unitMilhas.controller;

import com.unit.unitMilhas.model.Usuario;
import com.unit.unitMilhas.repository.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UsuarioController {
    
    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public List<Usuario> findAll(){
        return userRepo.findAll();
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario novoUsuario){
        return userRepo.save(novoUsuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuarioAtualizar){
        return userRepo.save(usuarioAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Usuario usuarioDeletar){
        userRepo.delete(usuarioDeletar);
        return "Usuário deletado co sucesso!";
    }
    
}
