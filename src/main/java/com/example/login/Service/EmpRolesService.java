package com.example.login.Service;

import com.example.login.Entity.EmpRoles;
import com.example.login.Repository.EmpRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmpRolesService {
    @Autowired
    EmpRolesRepository empRolesRepository;

    public EmpRolesService(EmpRolesRepository empRolesRepository) {
        this.empRolesRepository = empRolesRepository;
    }

    public EmpRoles createEmpRoles(EmpRoles emp) {
        return empRolesRepository.save(emp);
    }

    public List<EmpRoles> getAllEmpRoles() {
        return empRolesRepository.findAll();
    }

    public List<EmpRoles> getEmpRolesById(String id) {
        return empRolesRepository.findByEmpId(id);
    }

    public EmpRoles updateEmpRolesById(String id, EmpRoles emproles) {
        return empRolesRepository.save(emproles);
    }

}
