package com.tadas.demo.dao;

import com.tadas.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "category", path = "categories")
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
