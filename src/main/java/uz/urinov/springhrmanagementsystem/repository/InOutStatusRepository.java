package uz.urinov.springhrmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springhrmanagementsystem.entity.InOutStatus;

@Repository
public interface InOutStatusRepository extends JpaRepository<InOutStatus, Integer> {
}
