package Auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping(value = "login")
        public String login()
        {
            return "Login from piublic endpoint";
        }
    @PostMapping(value = "login")
    public String register()
    {
        return "Register from piublic endpoint";
    }

}