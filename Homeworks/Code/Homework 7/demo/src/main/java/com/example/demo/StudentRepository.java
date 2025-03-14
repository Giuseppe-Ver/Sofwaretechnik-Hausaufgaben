package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Methode zum Finden von Studenten nach Matrikelnummer
    Student findByMatNr(String matNr);
    
    // Methode zum Finden von Studenten nach Namen
    List<Student> findByName(String name);
}