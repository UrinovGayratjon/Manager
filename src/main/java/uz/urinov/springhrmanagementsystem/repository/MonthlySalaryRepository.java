package uz.urinov.springhrmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springhrmanagementsystem.entity.MonthSalary;

import java.util.List;
import java.util.UUID;

@Repository
public interface MonthlySalaryRepository extends JpaRepository<MonthSalary, UUID> {
    List<MonthSalary> findAllByOwner_Id(UUID owner_id);
}
