package Polymorphism;

public class Company {
    public void companyRequirement() {
        System.out.println("experience");
    }
}

class amazon extends Company {
    public void companyRequirement() {
        System.out.println("One year");
    }
}

class Royalmail extends Company {
    public void companyRequirement() {
        System.out.println("Two year");
    }
}

class main {
    public static void main(String[] args) {

        Company myCompany = new Company();
        Company myamazon = new amazon();
        Company myRoyalmail = new Royalmail();

        myCompany.companyRequirement();
        myamazon.companyRequirement();
        myRoyalmail.companyRequirement();
    }
}












