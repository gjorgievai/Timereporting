package mk.finki.dr.timereporting.services;

import mk.finki.dr.timereporting.models.HourlyPaid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HourlyPaidService {
    List<HourlyPaid> findAll();
    HourlyPaid findOne(Integer id);
    void deleteHourlyPaid(Integer id);
    HourlyPaid save(HourlyPaid hourlyPaid);
}
