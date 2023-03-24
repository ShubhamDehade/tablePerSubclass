package bean;

public class HardwareEmp extends EmployeeMain{
   private int hrs;

    public HardwareEmp(int hrs) {
        this.hrs = hrs;
    }

    public HardwareEmp() {
    }

    public HardwareEmp(int empId, String empName, String empEmail, double empSal, int hrs) {
        super(empId, empName, empEmail, empSal);
        this.hrs = hrs;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
}
