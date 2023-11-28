package com.abhishek.demo2.controller;

import com.abhishek.demo2.entity.Question;
import com.abhishek.demo2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService)
    {
        this.questionService = questionService;
    }

    @GetMapping("/all")
    public List<Question> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Optional<Question> getQuestionById(@PathVariable int id)
    {
        return questionService.getQuestionById(id);
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category)
    {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/")
    public void addQuestion(@RequestBody Question question)
    {
        questionService.addQuestion(question);
    }
}
