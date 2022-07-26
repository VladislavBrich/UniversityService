package com.example.elinext.repositories;


import com.example.elinext.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepo extends JpaRepository<Student, Long> {

    List<Student> findAllByGroupId(Long groupId);

    List <Student> findAllBySurname(String surname);

    Student findBySurname(String surname);

    Boolean existsBySurname(String surname);

}
