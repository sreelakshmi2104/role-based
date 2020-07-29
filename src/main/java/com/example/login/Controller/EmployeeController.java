package com.example.login.Controller;



import com.example.login.Entity.Employee;
import com.example.login.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin("*")
@RequestMapping
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String helloController() {
        return "Hey the Application is running on port 8081";
    }


    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeService.getAllEmployee();
    }


    @GetMapping(value = "/employee/{id}")
    public List<Employee> getEmployeeById(@PathVariable("id") String id) {
        return employeeService.getEmployeeById(id);
    }

//    @GetMapping (value="/employee/{id}/{firstName}")
//
//    public Employee findByKeyFirstName(@PathVariable("id") String id, @PathVariable("firstName") String firstName){
//        return employeeService.findByKeyFirstName(id, firstName);
//    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee emp) {
        return employeeService.createEmployee(emp);
    }


    @PutMapping(value = "/employee/{id}")
    public Employee UpdateEmployeeById(@PathVariable("id") String id, @RequestBody Employee emp) {
        return employeeService.updateEmployeeById(id,emp);
    }
}
