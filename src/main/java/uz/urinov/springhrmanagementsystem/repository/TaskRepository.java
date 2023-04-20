package uz.urinov.springhrmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springhrmanagementsystem.entity.Task;
import uz.urinov.springhrmanagementsystem.entity.enums.TaskStatus;

import java.util.List;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    boolean existsByOwner_EmailAndId(String owner_email, UUID id);

    List<Task> findAllByStatusAndCompletedTime(TaskStatus status, boolean completedTime);
}
