package com.abhishek.demo2.dao;

import com.abhishek.demo2.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer>
{
    List<Question> findByCategory(String category);
}
