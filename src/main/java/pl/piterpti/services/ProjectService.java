package pl.piterpti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.piterpti.domain.Project;
import pl.piterpti.exception.ProjectIdException;
import pl.piterpti.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exist");
		}
	}

}
