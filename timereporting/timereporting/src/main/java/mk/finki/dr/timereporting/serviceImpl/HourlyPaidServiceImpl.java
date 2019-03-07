package mk.finki.dr.timereporting.serviceImpl;

import mk.finki.dr.timereporting.models.HourlyPaid;
import mk.finki.dr.timereporting.repositories.HourlyPaidRepository;
import mk.finki.dr.timereporting.services.HourlyPaidService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HourlyPaidServiceImpl implements HourlyPaidService {
    @Autowired
    HourlyPaidRepository repo;
    @Override
    public List<HourlyPaid> findAll() {
        return repo.findAll();
    }

    @Override
    public HourlyPaid findOne(Integer id) {
        return repo.getOne(id);
    }

    @Override
    public void deleteHourlyPaid(Integer id) {
            repo.deleteById(id);
    }

    @Override
    public HourlyPaid save(HourlyPaid hourlyPaid) {
        return repo.save(hourlyPaid);
    }
}
