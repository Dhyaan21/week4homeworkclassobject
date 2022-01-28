package inheritance;

public class Microsoft extends Technology {

    @Override
    public void GetEmployees() {
        System.out.println("Microsoft: Total Employees 100000");
    }

    @Override
    public void GetSoftwares() {
        System.out.println("Microsoft: Softwares");
    }

    public void GetMicrosoftOfficeSoftware() {
        System.out.println("Microsoft: Microsoft Office Softwares");
    }

    public void GetCompanyName() {
        System.out.println("Microsoft: Company Name is Microsoft");
    }
}
