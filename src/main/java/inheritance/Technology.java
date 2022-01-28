package inheritance;

public class Technology extends Company {

    @Override
    public void GetEmployees() {
        System.out.println("Technology: Total Employees 10000");
    }

    public void GetSoftwares() {
        System.out.println("Technology: Softwares");
    }

    public void GetCompanyName() {
        System.out.println("Technology: Company Name");
    }
}
