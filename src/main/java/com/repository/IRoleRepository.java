package com.repository;

import com.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleRepository extends PagingAndSortingRepository<Role, Long> {
}
