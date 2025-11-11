package com.project.bankmanagement.notification.repo;



import com.project.bankmanagement.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
