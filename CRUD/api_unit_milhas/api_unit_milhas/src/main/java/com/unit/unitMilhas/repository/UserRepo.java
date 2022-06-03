package com.unit.unitMilhas.repository;

import com.unit.unitMilhas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Usuario, Long>{
    
}
