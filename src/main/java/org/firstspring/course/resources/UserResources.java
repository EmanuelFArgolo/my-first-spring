package org.firstspring.course.resources;

import org.firstspring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "maria", "obc@gmail.com", "123456", "99999999");
        return ResponseEntity.ok().body(u);
    }

}
