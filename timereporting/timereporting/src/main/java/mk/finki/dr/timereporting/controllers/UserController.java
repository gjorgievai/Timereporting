package mk.finki.dr.timereporting.controllers;

import mk.finki.dr.timereporting.dto.User;
import mk.finki.dr.timereporting.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/loginUser")
    public String login(@RequestBody User user){
        return userService.login(user);
    }
}
