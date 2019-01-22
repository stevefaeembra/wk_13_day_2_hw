package com.codeclan.homework.wk13_day_2_hw.repositories;

import com.codeclan.homework.wk13_day_2_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
