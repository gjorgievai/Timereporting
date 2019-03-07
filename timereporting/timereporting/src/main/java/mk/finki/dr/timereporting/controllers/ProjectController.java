package mk.finki.dr.timereporting.controllers;

import mk.finki.dr.timereporting.models.Project;
import mk.finki.dr.timereporting.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    ProjectService service;
    @GetMapping
    public List<Project> getEmployee() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Project getEmployeeById(@PathVariable Integer id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteProject(id);
    }
    @PostMapping("/create")
    public void createEmployee(@RequestBody Project project) {
        service.save(project);
    }
}
