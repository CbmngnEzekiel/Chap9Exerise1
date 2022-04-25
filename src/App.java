public class App {
    public static void main(String[] args) throws Exception {
        Faculty person1 = new Faculty("John", 15000, "Math");

        System.out.println("Employee name: " + person1.getEmployeeName());
        System.out.println("Salary: " + person1.getSalary());
        System.out.println("Department: " + person1.getDepartmentName());

        Staff person2 = new Staff("Mike", 15000.15, "Good day manager!");

        System.out.println("\nEmployee name: " + person2.getEmployeeName());
        System.out.println("Salary: " + person2.getSalary());
        System.out.println("Job Title: " + person2.getJobTitle());        
    }
}
