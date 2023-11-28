package com.abhishek.demo2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="quiz_questions")
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
}
