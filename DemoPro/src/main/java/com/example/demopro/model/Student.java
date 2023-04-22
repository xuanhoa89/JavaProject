package com.example.demopro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity                 //khai báo xác dịnh đây là bảng
@Data                  //thay the get và set
@SuperBuilder          // sử dụng khởi tạo đối tượng
@AllArgsConstructor    //khai bao constructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
}

