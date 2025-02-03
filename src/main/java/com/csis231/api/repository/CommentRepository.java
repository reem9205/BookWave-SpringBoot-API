package com.csis231.api.repository;

import com.csis231.api.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Comment entity, extending JpaRepository for CRUD operations.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
