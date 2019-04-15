package mk.finki.dr.timereporting.controllers;
import mk.finki.dr.timereporting.models.Timereport;
import mk.finki.dr.timereporting.services.TimereportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timereports")
@CrossOrigin(origins = "http://localhost:4200")
public class TimereportingController {
    @Autowired
    TimereportService service;
    @GetMapping
    public List<Timereport> getTimereports() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Timereport getTimereportById(@PathVariable Integer id) {
        return service.findOne(id);
    }
    @DeleteMapping("/{id}")
    public void deleteTimereport(@PathVariable Integer id) {
        service.deleteTimereport(id);
    }
    @PostMapping("/create")
    public void createTimereport(@RequestBody Timereport timereport) {
        service.save(timereport);
    }
}
