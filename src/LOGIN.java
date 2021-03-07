import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*public class LOGIN {

    public static void main(String[] args) throws IOException {

        EmployeeManager emp = new EmployeeManager();

        emp.readdata();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("#######################--WELCOME--#######################");
        System.out.println("Enter Employee Id");
        String id = br.readLine();
        System.out.println("Enter Password");
        String password = br.readLine();

        assert (id.length() > 0 && password.length() > 0) : "Fields Cannot be Empty";
        System.out.println(emp.db.get(id).printName());
        assert(emp.db.containsKey(id) && emp.db.get(id).printPassword().equals(password)) : "Enter Valid Username or Password";
            if (id.charAt(4) == 'A') {
                Admin ad = new Admin(id);}
            else{
                emp.getEmployeeDetails(id);
                System.out.println("Address - "+emp.db.get(id).printAddress());
                System.out.println("Age - "+emp.db.get(id).printAge());
                System.out.println("Current Salary - $" + emp.db.get(id).printAllowance());
            }
        }
    }
*/