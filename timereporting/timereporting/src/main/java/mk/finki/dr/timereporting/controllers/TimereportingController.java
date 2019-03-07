package mk.finki.dr.timereporting.controllers;
import mk.finki.dr.timereporting.models.Timereport;
import mk.finki.dr.timereporting.services.TimereportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timereportings")
public class TimereportingController {
    @Autowired
    TimereportService service;
    @GetMapping
    public List<Timereport> getEmployee() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Timereport getEmployeeById(@PathVariable Integer id) {
        return service.findOne(id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteTimereport(id);
    }
    @PostMapping("/create")
    public void createEmployee(@RequestBody Timereport timereport) {
        service.save(timereport);
    }
}
