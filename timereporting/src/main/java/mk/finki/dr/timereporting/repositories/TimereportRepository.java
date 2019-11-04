package mk.finki.dr.timereporting.repositories;

import mk.finki.dr.timereporting.models.Employee;
import mk.finki.dr.timereporting.models.Timereport;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Repository
public interface TimereportRepository extends JpaRepository<Timereport,Integer> {
    @Query("select t from Timereport  t where t.date >= :startDate AND t.date<= :endDate AND t.employee.id= :id")
    List<Timereport> findTimereportsByDate(Date startDate, Date endDate ,Integer id);
    @Query("select t from Timereport t where t.employee.id = :employee")
    List<Timereport> findTimereportsByEmployee(Integer employee);
}
