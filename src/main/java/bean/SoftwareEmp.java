package bean;

public class SoftwareEmp extends EmployeeMain {
    private String tool;

    public SoftwareEmp() {
    }

    public SoftwareEmp(int empId, String empName, String empEmail, double empSal, String tool) {
        super(empId, empName, empEmail, empSal);
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
}
