package com.example.demopro.service;

import com.example.demopro.model.User;
import com.example.demopro.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public Object getList(){
       // List<User> users = userRepository.findAll();
        return userRepository.findAll();
    }
    public Object postCreate(Object payload){
        return null;
    }
    public Object putUpdate(Integer id, Object payload){
        return null;
    }
    public Object delItem(Integer id){
        return null;
    }
    public Object getDetail(Integer id){
        return null;
    }

}
