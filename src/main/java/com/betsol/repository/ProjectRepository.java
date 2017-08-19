package com.betsol.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betsol.model.Project;

@Repository("projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
}
