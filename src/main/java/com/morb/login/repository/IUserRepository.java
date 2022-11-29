package com.morb.login.repository;

import com.morb.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    /*@Query("SELECT U FROM USER U WHERE U.USERNAME= ?1 & U.PASSWORD= ?2")
    Boolean existsByPassword(User username, User password);*/

}
