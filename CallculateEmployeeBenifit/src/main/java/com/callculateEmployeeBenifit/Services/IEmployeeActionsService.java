package com.callculateEmployeeBenifit.Services;

import com.callculateEmployeeBenifit.model.Employee;
import com.callculateEmployeeBenifit.model.FamilyMember;

import java.util.List;

public interface IEmployeeActionsService {

    public Employee addEmployee(Employee employee);
    public Employee getEmployee(int userID);
    public List<Employee> getAllEmployees();
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public FamilyMember addDependent(FamilyMember dependent);
    public List<FamilyMember> getAllDependents(int userId);
}
