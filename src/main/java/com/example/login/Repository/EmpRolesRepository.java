package com.example.login.Repository;

import com.example.login.Entity.EmpRoles;
import com.example.login.Key.EmpRolesKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;


import java.util.List;

@EnableCassandraRepositories
public interface EmpRolesRepository extends CassandraRepository<EmpRoles, EmpRolesKey> {
    List<EmpRoles> findByEmpId(String id);
    EmpRoles save(EmpRoles empRoles);
}
