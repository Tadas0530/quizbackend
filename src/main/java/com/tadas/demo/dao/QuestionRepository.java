package com.tadas.demo.dao;

import com.tadas.demo.entity.Question;
import com.tadas.demo.projections.QuestionProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "question", path = "questions", excerptProjection = QuestionProjection.class)
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("FROM Question q WHERE q.category.id = ?1")
    List<Question> findQuestionsByCategoryId(Long categoryId);
}
