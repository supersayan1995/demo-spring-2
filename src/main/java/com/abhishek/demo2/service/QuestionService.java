package com.abhishek.demo2.service;

import com.abhishek.demo2.dao.QuestionDAO;
import com.abhishek.demo2.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService
{
    QuestionDAO questionDAO;

    @Autowired
    public QuestionService(QuestionDAO questionDAO)
    {
        this.questionDAO = questionDAO;
    }

    public List<Question> getAllQuestions()
    {
        return questionDAO.findAll();
    }

    public Optional<Question> getQuestionById(int id)
    {
        return questionDAO.findById(id);
    }

    public List<Question> getQuestionsByCategory(String category)
    {
        return questionDAO.findByCategory(category);
    }

    public void addQuestion(Question question)
    {
        questionDAO.save(question);
    }
}
