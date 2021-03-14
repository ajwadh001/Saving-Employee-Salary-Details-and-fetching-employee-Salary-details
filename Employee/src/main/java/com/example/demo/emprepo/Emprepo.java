package com.example.demo.emprepo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.emp.Emp;

public interface Emprepo extends CrudRepository<Emp, Integer> {

}
