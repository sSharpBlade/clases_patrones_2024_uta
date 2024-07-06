package main.java.com.lopez.edwin.springboot.Controller;

import main.java.com.lopez.edwin.springboot.dto.MessageDto;

import java.util.Date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController()
public class PersonaController {

    @GetMapping("/helloWorld")
    public MessageDto helloWorld() {
        MessageDto message = new MessageDto();
        message.setMessage("Hola mundo");
        message.setMessageDate(new Date());
        return message;
    }
}
