package com.snowflake.poc.snowflakeconnectivity.repository;


import com.snowflake.poc.snowflakeconnectivity.models.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.SUPPORTS)
public interface UserRepository extends PagingAndSortingRepository<Users, String> {
}

