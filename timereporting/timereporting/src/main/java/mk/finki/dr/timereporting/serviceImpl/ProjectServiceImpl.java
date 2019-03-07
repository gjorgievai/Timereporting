package mk.finki.dr.timereporting.serviceImpl;

import mk.finki.dr.timereporting.models.Project;
import mk.finki.dr.timereporting.repositories.ProjectRepository;
import mk.finki.dr.timereporting.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository repo;
    @Override
    public List<Project> findAll() {
        return repo.findAll();
    }

    @Override
    public Project findById(Integer id) {
        return repo.getOne(id);
    }


    @Override
    public void deleteProject(Integer id) {
            repo.deleteById(id);
    }

    @Override
    public Project save(Project project) {
        return repo.save(project);
    }
}
