import com.sun.source.tree.IfTree;

public class EmployeeTest {
    public static void main(String args[]){
        employee employee1 = new employee();
        employee1.PrintInfo();

        employee[] employeeArray = new employee[5];
        employeeArray[0] = new employee("1 1 1", "Стажер", "email", 1111, 50, 35);
        employeeArray[1] = new employee("2 2 2 ", "Стажер", "email", 1111, 50, 40);
        employeeArray[2] = new employee("3 3 3 ", "Стажер", "email", 1111, 50, 45);
        employeeArray[3] = new employee("4 4 4 ", "Стажер", "email", 1111, 50, 50);
        employeeArray[4] = new employee("5 5 5 ", "Стажер", "email", 1111, 50, 55);

        for (int i=0; i < employeeArray.length; i++){
            if(employeeArray[i].Age > 40){
                employeeArray[i].PrintInfo();;
            }

            //System.out.println(EmployeeArray[i].PrintInfo();FIO);


        }
    }
}


