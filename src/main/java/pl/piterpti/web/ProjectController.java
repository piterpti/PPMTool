package pl.piterpti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.piterpti.domain.Project;
import pl.piterpti.services.ProjectService;

/**
 * Rest controller for project operations
 * 
 * @author plukasik
 *
 */
@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
		
		project = projectService.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(project, HttpStatus.OK);
	}
	
}
