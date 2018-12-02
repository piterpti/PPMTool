package pl.piterpti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.piterpti.domain.Project;

/**
 * Repository for project entity
 * 
 * @author plukasik
 *
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	/**
	 * Get project by project identifier
	 * @param projectId project identifier
	 * @return project or null
	 */
	Project findByProjectIdentifier(String projectId);

	
}
