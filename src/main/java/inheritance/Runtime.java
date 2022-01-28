package inheritance;

public class Runtime {
    public static void main(String[] args){

         Retail retail = new Retail();
         retail.GetEmployees();
         retail.GetClothes();
         retail.GetCompanyName();

         Technology technology = new Technology();
         technology.GetEmployees();
         technology.GetSoftwares();
         technology.GetCompanyName();

         Microsoft microsoft = new Microsoft();
         microsoft.GetEmployees();
         microsoft.GetSoftwares();
         microsoft.GetMicrosoftOfficeSoftware();
         microsoft.GetCompanyName();


    }

}
