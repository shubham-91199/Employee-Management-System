import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
public class EmployeeManager {
    public ArrayList<Employee> EmployeeList;
    public HashMap<String, Employee> db = new HashMap<String, Employee>();;
    String path = "EMPLOYEE DB 2.csv";

    public EmployeeManager()
    {
        this.EmployeeList= new ArrayList<Employee>();

    }


     public boolean readdata()  {
        String line = "";
        BufferedReader br = null;

        int c = 0;
        boolean con = true;
         try {
             br = new BufferedReader(new FileReader(path));

             while ((line = br.readLine()) != null) {
                 EmployeeList.add(new Employee());
                 String temp[] = line.split(",");
                 EmployeeList.get(c).getId(temp[0]);
                 db.put(temp[0], EmployeeList.get(c));
                 EmployeeList.get(c).getPassword(temp[1]);
                 EmployeeList.get(c).getName(temp[2]);
                 EmployeeList.get(c).getAge(temp[3]);
                 EmployeeList.get(c).getSex(temp[4]);
                 EmployeeList.get(c).getAddress(temp[5]);
                 EmployeeList.get(c).getPhone(temp[6]);
                 EmployeeList.get(c).getAllowance(temp[7]);
                 EmployeeList.get(c).getBonus(temp[8]);
                 EmployeeList.get(c).getPresent(temp[9]);
                 c++;
             }
        } catch (FileNotFoundException e) {
            con = false;
        }
        catch (IOException e) {
            con = false;
            e.printStackTrace();
        }
        return con;
    }

    public String getEmployeeDetails(String id) {
        var s = " Name - " + db.get(id).printName() +
                "\n Employee Id - " + db.get(id).printid() +
                "\n Sex - " + db.get(id).printSex() +
                "\n Contact no - " + db.get(id).printPhone() +
                "\n Bonus - $" + db.get(id).printBonous() +
                "\n Attendence Precentage -- " + ((Double.parseDouble(db.get(id).printPresent()) / 240) * 100) + "%";
        return s;
    }

    public boolean updateEmployeeDetails(String input){

        boolean con = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(input);
            pw.flush();
            pw.close();
            System.out.println("NEW EMPLOYEE ADDED");
        } catch (FileNotFoundException e) {
            con = false;
        } catch (IOException e) {
            con =  false;
        }
            return con;
    }
    public int getVal()
    {
        readdata();
        System.out.println(Integer.parseInt(EmployeeList.get(1).printAge()));
        return Integer.parseInt(EmployeeList.get(1).printAge());

    }
    public static void main(String [] args)
    {
        EmployeeManager emp = new EmployeeManager();
        //emp.readdata();
        //int age =emp.getVal();

        //String newEmployee = "6868,123456,Subham Daniels,100,F,Siliguri,9474588932,2056099,85713,139";
        //emp.updateEmployeeDetails(newEmployee);
        //String age[] = newEmployee.split(",");
        //String ages = age[3];
        //Employee temp = emp.db.get("6969A");
        assert (100<60) : "Time For Retirement";
        //assert (Integer.parseInt(temp.printAge())<60):"Time for Retirement";
    }

}
