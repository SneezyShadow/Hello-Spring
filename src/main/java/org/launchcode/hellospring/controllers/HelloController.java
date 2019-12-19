package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {


//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring";
//    }

    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring";
    }

    @PostMapping()
    public String helloQueryParam(@RequestParam String name, String language){
        if (language == "french"){
            return "Bonjour, " + name + "!";
        }
        if (language == "spanish"){
            return "Hola, " + name + "!";
        }
        if (language == "german"){
            return "Guten Tag, " + name + "!";
        }
        return "Hello, " + name + "!";
    }

    @GetMapping("{name}")
    public String helloPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello'>" +
                "<input type='text' name='name'>" +
                "<select name='language' id='language'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='german'>German</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
