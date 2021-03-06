package com.cos.security1.repository;

import com.cos.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 가지고 있음
// @Reposiroty라는 어노테이션이 없어도 Ioc가 가능 -> JpaRepository를 상속했기 때문
public interface UserRepository extends JpaRepository<User, Integer> {

    // findBy 규칙 -> Username문법
    // select * from user where username = 1?;
    public User findByUsername(String username); // Jpa Query methods

}
