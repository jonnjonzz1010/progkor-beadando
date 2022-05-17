package hu.nye.progkor.employeeCatalog.service;

import hu.nye.progkor.employeeCatalog.model.Employee;

import java.util.List;

public interface EmployeeCatalogService {


  List<Employee> getAllEmployees();

  Employee getEmployee(Long id);

  Employee createEmployee(Employee employee);

  Employee updateEmployee(Long id, Employee employeeChange);

  void deleteEmployee(Long id);


}
