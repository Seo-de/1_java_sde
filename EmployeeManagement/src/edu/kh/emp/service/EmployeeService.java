package edu.kh.emp.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {
	
	private List<Employee> empList = new ArrayList<Employee>();
	public EmployeeService() { }
	
	public boolean addEmp(int empId, String empName, String empNo, String email,
			String phone, String departmentTitle, String jobName, int salary) {
		Employee e = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		return empList.add(e);
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	
	public List<Employee> selectEmp1(int idx) {
		List<Employee> resultlList = new ArrayList<>();
		
		for(Employee e : empList) {
			if(idx == e.getEmpId()) {
				resultlList.add(e);
			}
		} return resultlList;
	}
	
	public boolean updateEmp(int idx, String departmentTitle, String jobName, int salary) {
		if(idx >= empList.size() || idx < 0) {
			return false;
			} else {
		
			empList.get(idx).setDepartmentTitle(departmentTitle);
			empList.get(idx).setJobName(jobName);
			empList.get(idx).setSalary(salary);
			return true;
		}
	}
	
	public Employee removeEmp(int idx) {
		if(idx >= empList.size() || idx < 0) {
			return null;
		}else {
			return empList.remove(idx);
		}
	}
	
	public List<Employee> selectDep(String departmentTitle) {
		List<Employee> resultList = new ArrayList<>();
		for(Employee e : empList) {
			if(e.getDepartmentTitle().equals(departmentTitle)) {
				resultList.add(e);
			}
		}
		return resultList;
	}

	public List<Employee> salaryUp(int salary) {
		List<Employee> resulList = new ArrayList<>();
		for(Employee e : empList) {
			if(salary >= e.getSalary()) {
				resulList.add(e);
			}
		}return resulList;
	}
}
