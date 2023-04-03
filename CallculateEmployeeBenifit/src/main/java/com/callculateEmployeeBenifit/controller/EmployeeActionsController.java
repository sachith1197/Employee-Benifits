package com.callculateEmployeeBenifit.controller;

import com.callculateEmployeeBenifit.Services.IEmployeeActionsService;
import com.callculateEmployeeBenifit.model.Employee;
import com.callculateEmployeeBenifit.model.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
@RequestMapping(path="/ChooseBenifits")
public class EmployeeActionsController {

    @Autowired
    private IEmployeeActionsService EmployeeActions;

    @PostMapping(path = "/addEmployee")
    public @ResponseBody String addEmployee(@RequestBody Employee Employee){
        EmployeeActions.addEmployee(Employee);
        return  "A New Employee account has been created with role" + Employee.getRole() + "and the Employee Id is :" + Employee.getId();
    }

    @GetMapping(path="/getAllEmployees")
    public @ResponseBody List<Employee> getAllEmployees(){
        return EmployeeActions.getAllEmployees();
    }

    @GetMapping(path="/getEmployee")
    public @ResponseBody Employee getEmployee(@RequestParam int EmployeeID){
        return EmployeeActions.getEmployee(EmployeeID);
    }

    @PutMapping(path = "/updateEmployee")
    public @ResponseBody String updateEmployee(@RequestBody Employee Employee){
        EmployeeActions.updateEmployee(Employee);
        return  "A New Employee record has been updated successfully";
    }

    @DeleteMapping
    public @ResponseBody String deleteEmployee(@RequestBody Employee Employee) {
        EmployeeActions.deleteEmployee(Employee);
        return "Employee record has been deleted successfully for ID" + Employee.getId();
    }

    @PostMapping(path = "/addDependent")
    public @ResponseBody String addDependent(@RequestBody FamilyMember Dependent){
        EmployeeActions.addDependent(Dependent);
        return  "A New Dependent account has been created with role" + Dependent.getType() + " for Employee Id :" + Dependent.getUserId();
    }






}
