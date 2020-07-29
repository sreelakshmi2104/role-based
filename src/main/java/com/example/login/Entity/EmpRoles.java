package com.example.login.Entity;

import com.example.login.Key.EmpRolesKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("emp_roles")
public class EmpRoles implements Serializable {
    @PrimaryKeyColumn(name = "emp_id", ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    public String empId;
    @PrimaryKeyColumn(name = "role_name", ordinal = 0, type = PrimaryKeyType.CLUSTERED)
    public String roleName;
}
