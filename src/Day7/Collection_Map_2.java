package Day7;

import java.util.Arrays;
import java.util.List;




class Employee
    {
        int empid;
        String empname;
        int salary; 
        
        Employee(int empid,String empname,int salary)
        {
            this.empid=empid;
            this.empname=empname;
            this.salary=salary;
        }
    }
    
public class Collection_Map_2 {

    
        public static void main(String[] args) {
        
            /*List<Employee> employeesList=new ArrayList<Employee>();
            employeesList.add(new Employee(101,"Alex",10000));
            employeesList.add(new Employee(101,"Alex",10000));
            employeesList.add(new Employee(101,"Alex",10000));
            employeesList.add(new Employee(101,"Alex",10000));*/
            
            List<Employee> employeesList=Arrays.asList(
                    new Employee(101,"Alex",10000),
                    new Employee(102, "Brian", 20000),
                    new Employee(103, "Charles", 30000),
                    new Employee(104, "David", 40000),
                    new Employee(105, "Edward", 50000)			
                    );
            
            //Combination of filter and map
            
            List<Integer> employeeSalList=employeesList.stream()
                    .filter(e->e.salary >20000)   // filtering
                    .map(e->e.salary)
                    .toList();
                    
            System.out.println(employeeSalList);
            
        }
}
