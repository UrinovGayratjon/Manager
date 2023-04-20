package uz.urinov.springhrmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springhrmanagementsystem.entity.Month;

@Repository
public interface MonthRepository extends JpaRepository<Month, Integer> {
}
