package com.example.demopro.api;

import com.example.demopro.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserApi {
    public final UserService userService;
    @GetMapping("")
    public ResponseEntity getList(){
        try {
            return ResponseEntity.ok(userService.getList());
        }catch (Exception ex){
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity getDetail(@PathVariable Integer id){return ResponseEntity.ok("hello");}
    @PostMapping("")
    public ResponseEntity postCreate(@RequestBody Object payload){
        return ResponseEntity.ok("hello");
    }
    @PutMapping("/{id}")
    public ResponseEntity putUpdate(@PathVariable Integer id){return ResponseEntity.ok("hello");}
    @DeleteMapping("/{id}")
    public ResponseEntity delItem(@PathVariable Integer id){
        return ResponseEntity.ok("hello");
    }
}
