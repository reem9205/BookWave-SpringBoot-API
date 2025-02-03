package com.csis231.api.repository;

import com.csis231.api.model.Author;
import com.csis231.api.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Notification entity, extending JpaRepository for CRUD operations.
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
