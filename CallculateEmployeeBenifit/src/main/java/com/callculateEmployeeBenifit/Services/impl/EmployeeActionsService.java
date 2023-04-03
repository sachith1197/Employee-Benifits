package com.callculateEmployeeBenifit.Services.impl;


import com.callculateEmployeeBenifit.Services.IEmployeeActionsService;
import com.callculateEmployeeBenifit.model.Employee;
import com.callculateEmployeeBenifit.model.FamilyMember;
import com.callculateEmployeeBenifit.repository.EmployeeJPARepository;
import com.callculateEmployeeBenifit.repository.FamilyMemberJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeActionsService implements IEmployeeActionsService {

    @Autowired
    private EmployeeJPARepository EmployeeJPARepository;

    @Autowired
    private FamilyMemberJPARepository FamilyMemberJPARepository;

    @Override
    public Employee addEmployee(Employee employee){

        return EmployeeJPARepository.save(employee);
    }

    @Override
    public Employee getEmployee(int userID){
        return EmployeeJPARepository.getById(userID);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return EmployeeJPARepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee){

        return EmployeeJPARepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee){
        EmployeeJPARepository.delete(employee);
    }

    @Override
    public FamilyMember addDependent(FamilyMember dependent){

        return FamilyMemberJPARepository.save(dependent);
    }

    @Override
    public List<FamilyMember> getAllDependents(int userId){
        List<FamilyMember> dependents = FamilyMemberJPARepository.findAll().stream().filter(x->x.getUserId() == userId).collect(Collectors.toList());
        return dependents;
    }








}
