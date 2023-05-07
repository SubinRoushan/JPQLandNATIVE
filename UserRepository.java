package com.jpql.JPQLandNative.repos;

import com.jpql.JPQLandNative.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    @Query("select u FROM User u")
    public List<User> getAllUser();

    @Query("select u FROM User u WHERE u.name =:n")
    public List<User> getUserByName(@Param("n") String name);
}
