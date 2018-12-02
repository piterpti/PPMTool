package pl.piterpti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.piterpti.domain.Project;
import pl.piterpti.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		// Logic
		
		return projectRepository.save(project);
	}

}
