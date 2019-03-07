package mk.finki.dr.timereporting.controllers;


import mk.finki.dr.timereporting.models.HourlyPaid;
import mk.finki.dr.timereporting.services.HourlyPaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hourlypaids")
public class HourlyPaidController {
    @Autowired
    HourlyPaidService service;
    @GetMapping
    public List<HourlyPaid> getEmployee() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public HourlyPaid getEmployeeById(@PathVariable Integer id) {
        return service.findOne(id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteHourlyPaid(id);
    }
    @PostMapping("/create")
    public void createEmployee(@RequestBody HourlyPaid hourlyPaid) {
        service.save(hourlyPaid);
    }
}
