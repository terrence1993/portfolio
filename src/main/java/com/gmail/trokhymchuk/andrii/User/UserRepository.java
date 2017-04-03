package com.gmail.trokhymchuk.andrii.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andrew on 3/20/17.
 */
public interface UserRepository extends JpaRepository<CustomUser, Long>{

    @Query("select u from CustomUser u where u.login =:login")
    CustomUser findByLogin(@Param("login")String login);

    @Query("select case when count(u) > 0 then true else false end from CustomUser u where u.login = :login")
    boolean existsByLogin(@Param("login") String login);

}
