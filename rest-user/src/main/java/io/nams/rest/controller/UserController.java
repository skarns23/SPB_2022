package io.nams.rest.controller;

import io.nams.rest.entity.User;
import io.nams.rest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    @PostMapping("/users")
    public String register(@RequestBody User newUser)
    {
        return userService.register(newUser);
    }
    @GetMapping("/users/{id}")
    public User find(@PathVariable String id){
        return userService.find(id);
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return this.userService.findAll();
    }
    @PutMapping("/users")
    public void modify(@RequestBody User newUser){
        userService.modify(newUser);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id){
        this.userService.remove(id);
    }
}
