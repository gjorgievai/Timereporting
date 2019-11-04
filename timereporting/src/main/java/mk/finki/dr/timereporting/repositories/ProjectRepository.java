package mk.finki.dr.timereporting.repositories;

import mk.finki.dr.timereporting.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
