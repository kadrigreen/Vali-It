package ee.bcs.valiit.controller;

import ee.bcs.valiit.codewars.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    //    http://localhost:8080/employee   //tagastame employee andmed veebi
//    @GetMapping("employee")
//    public Employee employee() {
//        Employee employee = new Employee();
//        employee.setName("Mari");
//        employee.setAddress("Puiestee 2");
//        return employee;
//    }


    //    http://localhost:8080/dtoEmployee   //tagastame mitme employee andmed veebi
//    @GetMapping("dtoEmployee")
//    public List<Employee> dtoEmployee() {   // siia tuleb list
//        Employee employee = new Employee();
//        employee.setName("Mari");
//        employee.setAddress("Puiestee 2");
//
//        Employee employee1 = new Employee();  // määrame employee1
//        employee1.setName("Jüri");
//        employee1.setAddress("Puiestee 34");
//
//        List<Employee> employeeList= new ArrayList<Employee>(); // loome employee listi
//        employeeList.add(employee);
//        employeeList.add(employee1);
//        return employeeList;       // tagastame employee listi
//
//    }
    static List<Employee> employeeList = new ArrayList<Employee>();


    //employee (POST) must take data from request body and store it to static variable.
//    http://localhost:8080/employee
    @PostMapping("employee")
    public void addEmployee(@RequestBody Employee employeeInfo) {
        employeeList.add(employeeInfo);
    }

    //         /employee (GET) must return all employees from static variable
//    http://localhost:8081/employee
    @GetMapping("employee")
    public List<Employee> getEmployees() {
        return employeeList;
    }

//           /employee/{id} (GET) must return one employee (with that id)
//    http://localhost:8080/employee
    @GetMapping("employee/{id}")
    public Employee getEmployeeId (@PathVariable ("id")int index){
        return employeeList.get(index);

    }
//            /employee/{id} (PUT)  must replace current employee with data from request body
    @PutMapping ("employee/{id}")
    public void replaceEmployeeId (@PathVariable("id") int index, @RequestBody Employee employeeInfo){
        employeeList.set(index, employeeInfo);

    }

//           /employee/{id} (DELETE must remove the employee with that id
    @DeleteMapping ("employee/{id}")
    public void deleteEmployee (@PathVariable ("id") int index){
        employeeList.remove(index);
    }


}
