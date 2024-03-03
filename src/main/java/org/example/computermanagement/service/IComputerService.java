package org.example.computermanagement.service;

import org.example.computermanagement.model.Computer;

import java.util.List;

public interface IComputerService {
    List<Computer> findAll();
    void save(Computer computer);
    Computer findById(int id);
    void remove(int id);

}
