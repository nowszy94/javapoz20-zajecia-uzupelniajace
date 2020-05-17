package com.sda.layers.repository;

import com.sda.layers.model.Student;

import java.util.ArrayList;
import java.util.List;

class StudentInMemoryRepository implements StudentRepository {
    private List<Student> students;

    public StudentInMemoryRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(this.students);
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }
}
