package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    //  http://localhost:8080/greeting
    //  http://localhost:8080/greeting?name=Jeremy
     
    @RequestMapping("/greeting")
    public GreetThing greeting(@RequestParam(value="name", 
                                         required=false) String name, 
                           Model model)
    {
        
        model.addAttribute("name", name);
        return new GreetThing(name, "X.");
    }    
}