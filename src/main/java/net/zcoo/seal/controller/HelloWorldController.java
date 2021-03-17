package net.zcoo.seal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.zcoo.seal.model.DAOUser;
import net.zcoo.seal.repository.UserRepository;

@RestController
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping({"/hello"})
    public String firstPage(){
        return "Hello World";
    }

    @GetMapping(path="/all") //>>get mapping>>spring get mapping>>maping path>>specify get path>>specify getmapping path
    public @ResponseBody Iterable<DAOUser> getAllUsers() { //>>spring response json data>>spring boot response json data>>spring return json data
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}
