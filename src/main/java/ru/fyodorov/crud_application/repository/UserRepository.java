package ru.fyodorov.crud_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fyodorov.crud_application.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
