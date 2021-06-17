package one.digitalinnovation.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.userapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
