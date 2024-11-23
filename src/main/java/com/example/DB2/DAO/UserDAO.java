package com.example.DB2.DAO;

import com.example.DB2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


//CrudReopsitory - part of JPA, which provides CRUD operations
// if one wants to do crud operations, just create a interface and extend the crud repository
@Component
public interface UserDAO extends CrudRepository<User, Integer> {

}
