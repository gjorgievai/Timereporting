package mk.finki.dr.timereporting.controllers;
import mk.finki.dr.timereporting.models.Timereport;
import mk.finki.dr.timereporting.services.TimereportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
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
    @PostMapping
    public Timereport createTimereport(@RequestBody Timereport timereport) {
       return service.save(timereport);
    }
    @PutMapping
    public Timereport updateTimereport(@RequestBody Timereport newtimereport){
        return service.save(newtimereport);
    }
    @GetMapping("/filterByDate")
    public List<Timereport> getTimereportByDate(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate , @RequestParam Integer employeeId){
        return service.findByDate(startDate,endDate,employeeId);
    }

}
