package bean;

public class EmployeeMain {
    private int empId;
    private String empName;
    private String empEmail;
    private double empSal;

    public EmployeeMain() {
    }

    public EmployeeMain(int empId, String empName, String empEmail, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
}
