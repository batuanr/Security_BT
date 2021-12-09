package com.repository;

import com.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User, Long> {
    User findUserByName(String name);

}
