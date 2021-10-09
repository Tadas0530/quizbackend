package com.tadas.demo.common;

import com.tadas.demo.entity.Question;

import java.util.List;

public class Quiz {

    private List<Question> questions;

    public Quiz() {
    }

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
