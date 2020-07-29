package com.example.login.Entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tinkerpop.shaded.kryo.NotNull;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("employee")
public class Employee implements Serializable {
    @PrimaryKeyColumn(name = "emp_id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    public String empId;
    @PrimaryKeyColumn(ordinal = 1,type = PrimaryKeyType.CLUSTERED, ordering = Ordering.ASCENDING )
    public String first_name;
    @NotNull
    @Column("emp_email")
    private String emp_email;
    @Column("last_name")
    private String last_name;
    @Column("provider_name")
    private String provider_name;
    @Column("image_url")
    private String image_url;
    @Column("team_id")
    private List<Integer> team_id;
}