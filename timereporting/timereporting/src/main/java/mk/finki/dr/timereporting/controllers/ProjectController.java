package mk.finki.dr.timereporting.controllers;

import mk.finki.dr.timereporting.models.Project;
import mk.finki.dr.timereporting.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {
    @Autowired
    ProjectService service;
    @GetMapping
    public List<Project> getProjects() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Integer id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id) {
        service.deleteProject(id);
    }
    @PostMapping("/create")
    public void createProject(@RequestBody Project project) {
        service.save(project);
    }
}
