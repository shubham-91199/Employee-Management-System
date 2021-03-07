public class Employee {
   private String id;
   private String password;
   private String Name;
   private String age;
   private String Sex;
   private String Address;
   private String phone;
   private String allowance;
   private String bonus;
   private String present;

 //  public Employee()

    public void getId(String id) {this.id=id;}
    public void getPassword(String password) {this.password=password;}
    public void getName(String Name) {this.Name = Name;}
    public void getAge(String age){this.age = age;}
    public void getSex(String Sex){this.Sex=Sex;}
    public void getAddress(String Address){this.Address=Address;}
    public void getPhone(String phone){this.phone=phone;}
    public void getAllowance(String allowance){this.allowance=allowance;}
    public void getBonus(String bonus){this.bonus=bonus;}
    public void getPresent(String present){this.present=present;}

   public String printid(){return id;}
   public String printPassword(){return password;}
   public String printName(){return Name;}
   public String printAge(){  return age;}
   public String printSex(){return Sex;}
   public String printAddress(){return Address;}
   public String printPhone(){return phone;}
   public String printAllowance(){return allowance;}
   public String printBonous(){return bonus;}
   public String printPresent(){return present;}
}
