package mk.finki.dr.timereporting.serviceImpl;

import mk.finki.dr.timereporting.dto.User;
import mk.finki.dr.timereporting.repositories.EmployeeRepository;
import mk.finki.dr.timereporting.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    EmployeeRepository repo;
    @Override
    public String login(User user) {
        String result="";
        if(repo.findByUsernameAndPassword(user.getUsername(),user.getPassword())==null){
            result = "Incorrect login";
        }
        else{
            result = "Correct login";
        }
        return result;
    }
}
