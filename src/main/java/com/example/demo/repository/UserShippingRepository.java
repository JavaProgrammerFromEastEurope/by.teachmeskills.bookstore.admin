package com.example.demo.repository;


import com.example.demo.entity.UserShipping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserShippingRepository extends CrudRepository<UserShipping, Long> {

}
