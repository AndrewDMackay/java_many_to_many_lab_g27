
package repositories;

package com.codeclan.example.employee_tracker.repositeries;
import com.codeclan.example.many_to_many_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
