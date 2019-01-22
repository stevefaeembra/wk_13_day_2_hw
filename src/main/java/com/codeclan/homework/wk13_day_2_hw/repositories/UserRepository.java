package com.codeclan.homework.wk13_day_2_hw.repositories;

import com.codeclan.homework.wk13_day_2_hw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
