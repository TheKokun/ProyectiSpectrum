package com.proyectoGohan.proyectoGohan.Repository;

import com.proyectoGohan.proyectoGohan.Entity.Questionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionarioRepository extends JpaRepository<Questionario, Integer> {
}
