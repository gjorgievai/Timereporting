package mk.finki.dr.timereporting.repositories;

import mk.finki.dr.timereporting.models.HourlyPaid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HourlyPaidRepository extends JpaRepository<HourlyPaid,Integer> {
}
