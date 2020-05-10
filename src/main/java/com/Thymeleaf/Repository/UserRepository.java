package com.Thymeleaf.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Thymeleaf.Entity.*;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {}