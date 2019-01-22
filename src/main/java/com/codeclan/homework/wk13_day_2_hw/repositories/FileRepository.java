package com.codeclan.homework.wk13_day_2_hw.repositories;

import com.codeclan.homework.wk13_day_2_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
