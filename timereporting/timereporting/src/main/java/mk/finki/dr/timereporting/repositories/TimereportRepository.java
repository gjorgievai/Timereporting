package mk.finki.dr.timereporting.repositories;

import mk.finki.dr.timereporting.models.Timereport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimereportRepository extends JpaRepository<Timereport,Integer> {
}
