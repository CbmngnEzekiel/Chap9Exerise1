public class Staff extends UEmployee{
    private String jobTitle;

    public Staff(String employeeName, double salary, String jobTitle) {
        super(employeeName, salary);
        this.jobTitle = jobTitle;
    }
    
    public String getJobTitle(){
        return this.jobTitle;
    }
}
