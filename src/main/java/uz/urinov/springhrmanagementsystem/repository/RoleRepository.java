package uz.urinov.springhrmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springhrmanagementsystem.entity.Role;
import uz.urinov.springhrmanagementsystem.entity.enums.RoleList;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findRoleByRole(RoleList role);

    boolean existsByIdAndRole(Integer id, RoleList role);
}
