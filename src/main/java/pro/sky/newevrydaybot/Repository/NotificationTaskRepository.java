package pro.sky.newevrydaybot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pro.sky.newevrydaybot.Model.NotificationTask;

import java.time.LocalDateTime;

@Repository

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {
    @Query(value = "SELECT notifications FROM notification_task WHERE notification_task.date = ?1", nativeQuery=true)
    String findByFirstnameContaining(LocalDateTime timeNow);

}
