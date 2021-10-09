package com.tadas.demo.game;

import com.tadas.demo.common.Quiz;
import com.tadas.demo.dao.QuestionRepository;
import com.tadas.demo.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuizGenerator {

    @Autowired
    private QuestionRepository qr;

    private final Random random = new Random();

    @PostMapping(path = "/getGame/{id}")
    public Quiz getGame(@PathVariable("id") Long id) {
        return getRandomQuizGameOf10(id);
    }

    private Quiz getRandomQuizGameOf10(Long id) {

        // create new Question list to add random Questions

        List<Question> randomQuestions = new ArrayList<>();

        // retrieve all Questions by selected Category

        List<Question> allQuestionsByCategory = qr.findQuestionsByCategoryId(id);

        Question question;

        for(int i = 0; i < 10; i++) {
            question = allQuestionsByCategory.get(random.nextInt(allQuestionsByCategory.size()));
            if(!randomQuestions.contains(question)) {
                 randomQuestions.add(question);
            } else {
                i--;
            }
        }

        return new Quiz(randomQuestions);
    }


}
