package com.example.login.Controller;

import com.example.login.Entity.EmpRoles;
import com.example.login.Service.EmpRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@RequestMapping
@RestController
public class EmpRolesController {

    @Autowired
    EmpRolesService empRolesService;

    public EmpRolesController(EmpRolesService empRolesService) {
        this.empRolesService = empRolesService;
    }

    @GetMapping("/emproles")
    public List<EmpRoles> getAllEmpRoles() {
        return (List<EmpRoles>) empRolesService.getAllEmpRoles();
    }

    @GetMapping(value = "/emproles/{id}")
    public List<EmpRoles> getEmpRolesById(@PathVariable("id") String id) {
        return empRolesService.getEmpRolesById(id);
    }

    @PostMapping("/emproles")
    public EmpRoles createEmpRoles(@RequestBody EmpRoles emp) {
        return empRolesService.createEmpRoles(emp);
    }

    @PutMapping(value = "/emproles/{id}")
    public EmpRoles UpdateEmpRolesById(@PathVariable("id") String id, @RequestBody EmpRoles empRoles) {
        return empRolesService.updateEmpRolesById(id,empRoles);
    }
}
