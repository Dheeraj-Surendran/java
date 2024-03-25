import java.util.Scanner;
class Employee {
int eNo;
String eName;
double salary;
public Employee(int eNo, String eName, double salary) {
this.eNo = eNo;
this.eName = eName;
this.salary = salary;
}
public int geteNo() {
return eNo;
}
public String geteName() {
return eName;
}
public double getSalary() {
return salary;
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of employees: ");
int n = scanner.nextInt();
Employee[] employees = new Employee[n];

System.out.println("Enter employee information: ");
for (int i = 0; i < n; i++) {
System.out.print("Enter eNo: ");
int eNo = scanner.nextInt();
scanner.nextLine();
System.out.print("Enter eName: ");
String eName = scanner.nextLine();
System.out.print("Enter salary: ");
double salary = scanner.nextDouble();
employees[i] = new Employee(eNo, eName, salary);
}
System.out.println("Enter the eNo of the employee to search: ");
int eNoToSearch = scanner.nextInt();
Employee foundEmployee = null;
for (int i = 0; i < n; i++) {
if (employees[i].geteNo() == eNoToSearch) {
foundEmployee = employees[i];
break;
}
}
if (foundEmployee != null) {
System.out.println("Employee found: ");
System.out.println("eNo: " + foundEmployee.geteNo());
System.out.println("eName: " + foundEmployee.geteName());
System.out.println("Salary: " + foundEmployee.getSalary());
} else {
System.out.println("Employee not found.");
}
}
}
