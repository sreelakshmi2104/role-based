package com.example.login.Service;


import com.example.login.Entity.Employee;
import com.example.login.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }


    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeById(String id) {
        return employeeRepository.findByEmpId(id);
    }


    public Employee updateEmployeeById(String id, Employee emp) {
        return employeeRepository.save(emp);
    }


//    public Employee findByKeyFirstName(String id, String firstName) {
//        return employeeRepository.findByEmpIdAndFirstName(id, firstName);
//    }
}
