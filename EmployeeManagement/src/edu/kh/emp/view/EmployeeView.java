package edu.kh.emp.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.emp.model.vo.Employee;
import edu.kh.emp.service.EmployeeService;

public class EmployeeView {
	private EmployeeService service = new EmployeeService();
	private  Scanner sc = new Scanner(System.in);
	public void displayMenu() {
		int input = 0;
		do {
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");

			try {
				System.out.print("메뉴 선택 >>");
				input = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch(input) {
				case 1 : addEmp(); break;
				case 2 : printAll(); break;
				case 3 : selectEmp1(); break;
				case 4 : updateEmp(); break;
				case 5 : removeEmp(); break;
				case 6 : selectDep(); break;
				case 7 : salaryUp(); break;
				case 8 : depSum(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("잘못 입력하셨습니다.");
				}
				System.out.println();
			}catch(InputMismatchException e) {
				System.out.println("[error] 입력 형식이 유효하지 않습니다.\n");
				input = -1;
				sc.nextLine();
			}
		} while(input != 0);
	}
	
	public void addEmp() {
		System.out.println("[사원 정보 추가]");
		
		System.out.print("사번 : ");
		int empId=sc.nextInt();
		System.out.print("사원 이름 : ");
		String empName=sc.next();
		System.out.print("주민등록번호 : ");
		String empNo=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc.nextLine();
		System.out.print("부서명 : ");
		String departmentTitle=sc.next();
		System.out.print("직급명 : ");
		String jobName=sc.next();
		System.out.print("급여 : ");
		int salary =sc.nextInt();
		
		if(service.addEmp(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("[추가완료]");
		}else {
			System.out.println("사원 정보 추가 실패");
		}
	}
	
	public void printAll() {
		System.out.println("[전체 사원 정보 조회]");
		
		List<Employee> empList = service.getEmpList();
		for(Employee e : empList) {
			System.out.println(e);
		}
	}
		
	public void selectEmp1() {
		System.out.println("[사원 정보 조회]");
		
		System.out.print("사번 입력 : ");
		int idx = sc.nextInt();
		List<Employee> resultList = service.selectEmp1(idx);
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Employee e : resultList) {
				System.out.println(e);
			}
		}
	}
	
	public void updateEmp() {
		System.out.println("[사원 정보 수정]");
		
		System.out.print("사번 입력 : ");
		int idx = sc.nextInt();
		
		System.out.print("수정할 부서명 : ");
		String departmentTitle = sc.next();
		System.out.print("수정할 직급명 : ");
		String jobName = sc.next();
		System.out.print("수정할 급여 : ");
		int salary = sc.nextInt();
		
		if(service.updateEmp(idx, departmentTitle, jobName, salary)) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패(사원번호 불일치)");
		}
		
	}
	
	public void removeEmp() {
		System.out.println("[사원 정보 삭제]");
		
		System.out.print("사번 입력 : ");
		int idx = sc.nextInt();
		
		Employee e = service.removeEmp(idx);
		if(e==null) {
			System.out.println("실패(사번 번호 불일치");
		}else {
			System.out.println(e.getEmpId()+"사원의 정보가 삭제되었습니다.");
		}
	}
	public void selectDep() {
		System.out.println("[같은 부서 사원 검색]");
		
		System.out.print("부서 입력 : ");
		String departmentTitle = sc.next();
		
		List<Employee> resuList = service.selectDep(departmentTitle);
		
		if(resuList == null) {
			System.out.println(departmentTitle + "부서에 사원이 없습니다.");
		}else {
			for(Employee e : resuList)
			System.out.println(e);
		}
	}
	
	public void salaryUp() {
		System.out.println("[입력한 급여 이상을 받는 사원]");
		System.out.print("급여 입력 : ");
		int salary = sc.nextInt();
		
		List<Employee> resuList = service.salaryUp(salary);
		if(resuList.isEmpty()) {
			System.out.println(salary + "이상 급여를 받는 사원이 없습니다.");
		}else {
			for(Employee e : resuList) {
				System.out.println(e);
			}
		}
	}
	
	public void depSum() {
		System.out.println("[부서별 급여 합 전체 조회]");
		
	}
				
}
