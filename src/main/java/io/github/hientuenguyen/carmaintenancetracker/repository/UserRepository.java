package io.github.hientuenguyen.carmaintenancetracker.repository;

import io.github.hientuenguyen.carmaintenancetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
