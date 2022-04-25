public class Faculty extends UEmployee{
    private String departmentName;
    
    public Faculty(String employeeName, double salary, String departmentName) {
        super(employeeName, salary);
        this.departmentName = departmentName;
    }
    
    public String getDepartmentName(){
        return this.departmentName;
    }
}
