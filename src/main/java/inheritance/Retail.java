package inheritance;

public class Retail extends Company {

    @Override
    public void GetEmployees(){
        System.out.println("Retail: Total Employees 1000");
    }
    public void GetClothes() {
        System.out.println("Retail: Clothes");
    }
    public void GetCompanyName(){
        System.out.println("Retail: CompanyName");
    }

}