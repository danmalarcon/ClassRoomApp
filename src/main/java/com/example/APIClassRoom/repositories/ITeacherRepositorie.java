package com.example.APIClassRoom.repositories;

import com.example.APIClassRoom.modelos.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepositorie extends JpaRepository<Teacher, Integer> {
}
