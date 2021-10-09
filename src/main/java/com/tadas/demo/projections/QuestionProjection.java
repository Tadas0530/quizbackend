package com.tadas.demo.projections;

import com.tadas.demo.entity.Answers;
import com.tadas.demo.entity.Question;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "inlineQuestion", types = { Question.class })
public interface QuestionProjection {

    Long getId();

    String getDescription();

    String getQuestionPicture();

    List<Answers> getAnswers();
}
