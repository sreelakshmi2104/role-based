package com.example.login.Repository;


import com.example.login.Entity.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;


import java.util.List;

@EnableCassandraRepositories
public interface EmployeeRepository extends CassandraRepository<Employee, String> {
    List<Employee> findByEmpId(String id);
    Employee save(Employee employee);
//    Employee findByEmpIdAndFirstName(String id, String firstName);
}
