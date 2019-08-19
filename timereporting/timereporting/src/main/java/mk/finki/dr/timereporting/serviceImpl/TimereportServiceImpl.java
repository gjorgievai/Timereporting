package mk.finki.dr.timereporting.serviceImpl;

import mk.finki.dr.timereporting.models.Timereport;
import mk.finki.dr.timereporting.repositories.TimereportRepository;
import mk.finki.dr.timereporting.services.TimereportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class TimereportServiceImpl implements TimereportService {
    @Autowired
    TimereportRepository repo;
    @Override
    public List<Timereport> findAll() {
        return repo.findAll();
    }

    @Override
    public Timereport findOne(Integer id) {
        return repo.getOne(id);
    }

    @Override
    public void deleteTimereport(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Timereport save(Timereport timereport) {
        return repo.save(timereport);
    }

    @Override
    public List<Timereport> findByDate(Date startDate, Date endDate,Integer id) {
        return repo.findTimereportsByDate(startDate,endDate,id);
    }

}
