public class Employeer {

    final String name = "Vasil";
    final String surname = "Koval";
    final String fathersName = "Petrovitch";

    public String posada;
    public String email;
    public String telephone;
    public int age;
    public int salary;


    public Employeer() {
    }

    public Employeer(String posada, String email, String telephone, int age, int salary) {
        this.posada = posada;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;
    }

    public Employeer(String posada, int salary) {
        this.posada = posada;
        this.salary = salary;

        //для буха треба ще прізвище, але не виходить, бо я так розумію тому що це поле Фінал
    }


}
