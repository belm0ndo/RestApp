package pl.mkocur.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mkocur.Model.UserModel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mateusz on 12.12.2017.
 */
@RestController
@RequestMapping("/rest/user")
public class UserController {

    @GetMapping
    public List<UserModel> getUsers() {
        return Arrays.asList(
                new UserModel("Sam", 2000L),
                new UserModel("Peter", 1000L)
        );
    }

    @GetMapping("/{userName]")
    public UserModel getUser(@PathVariable("userName") final String userName){
        return new UserModel(userName, 1000L);
    }
}
