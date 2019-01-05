package com.tugcankoparan.example;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>,
        QuerydslPredicateExecutor<Employee> {
}