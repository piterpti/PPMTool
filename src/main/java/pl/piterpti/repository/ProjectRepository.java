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

	@Override
	Iterable<Project> findAllById(Iterable<Long> arg0);
	
}
