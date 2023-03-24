package bean;

public class AdminEmp extends EmployeeMain{
    public AdminEmp() {

    }
  private String branchName;

    public AdminEmp(int empId, String empName, String empEmail, double empSal, String branchName) {
        super(empId, empName, empEmail, empSal);
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
