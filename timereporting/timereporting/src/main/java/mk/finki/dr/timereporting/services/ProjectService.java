package mk.finki.dr.timereporting.services;

import mk.finki.dr.timereporting.models.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    List<Project> findAll();
    Project findOne(Integer id);
    void deleteProject(Integer id);
    Project save(Project project);
}
