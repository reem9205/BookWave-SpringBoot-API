package com.csis231.api.repository;

import com.csis231.api.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for Image entity, extending JpaRepository for CRUD operations.
 */
@Repository
public interface ImageRepository extends JpaRepository<Author, Long> {


}
