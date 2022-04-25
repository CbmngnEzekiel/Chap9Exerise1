public class UEmployee {
    private String employeeName;
    private double salary;

    public UEmployee(String employeeName, double salary){
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public double getSalary(){
        return this.salary;
    }
}
