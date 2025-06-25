package com.example.repository;
import com.example.entity.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolRepository extends JpaRepository<Arbol, Integer> {
}