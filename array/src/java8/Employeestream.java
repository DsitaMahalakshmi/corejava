package java8;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employeestream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        System.out.println(employeeList);
        System.out.println("**********");
		Map<String, Long> noOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				         
				System.out.println(noOfMaleAndFemaleEmployees);
		System.out.println("print different designation");		
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);	
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
				         
				System.out.println(avgAgeOfMaleAndFemaleEmployees);
				
				Optional<Employee> highestPaidEmployeeWrapper=
						employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
						         
						Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
						         
						System.out.println("Details Of Highest Paid Employee : ");
						         
						System.out.println("==================================");
						         
						System.out.println("ID : "+highestPaidEmployee.getId());
						         
						System.out.println("Name : "+highestPaidEmployee.getName());
						         
						System.out.println("Age : "+highestPaidEmployee.getAge());
						         
						System.out.println("Gender : "+highestPaidEmployee.getGender());
						         
						System.out.println("Department : "+highestPaidEmployee.getDepartment());
						         
						System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
						         
						System.out.println("Salary : "+highestPaidEmployee.getSalary());
						System.out.println("Employee name after joining 2015");
						
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
		Optional<Employee> seniorMostEmployeeWrapper=
				employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
				         
				Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
				         
				System.out.println("Senior Most Employee Details :");
				         
				System.out.println("----------------------------");
				         
				System.out.println("ID : "+seniorMostEmployee.getId());
				         
				System.out.println("Name : "+seniorMostEmployee.getName());
				         
				System.out.println("Age : "+seniorMostEmployee.getAge());
				         
				System.out.println("Gender : "+seniorMostEmployee.getGender());
				         
				System.out.println("Age : "+seniorMostEmployee.getDepartment());
				         
				System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());
				         
				System.out.println("Salary : "+seniorMostEmployee.getSalary());
				System.out.println("no.of males and female employees in the organisation as per the department ");
				
				Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
						employeeList.stream()
						            .filter(e -> e.getDepartment()=="Sales And Marketing")
						            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
						 
						System.out.println(countMaleFemaleEmployeesInSalesMarketing);
						
						
			DoubleSummaryStatistics employeeSalaryStatistics=
		   employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
								         
		 System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
								         
	     System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
	     System.out.println(" oldest employee in the organisation as per the age");
	     
	     Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
         
	     Employee oldestEmployee = oldestEmployeeWrapper.get();
	              
	     System.out.println("Name : "+oldestEmployee.getName());
	              
	     System.out.println("Age : "+oldestEmployee.getAge());
	              
	     System.out.println("Department : "+oldestEmployee.getDepartment());
	}

}
