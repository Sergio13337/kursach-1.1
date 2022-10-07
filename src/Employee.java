public class Employee {
    private String fIO;
    private int departament;
    private int salary;
    private static int number = 1;
    private int id;



    public Employee(String fIO, int departament, int salary) {
        this.fIO = fIO;
        this.departament = departament;
        this.salary = salary;
        this.id = number++;
    }

    public String getfIO() {
        return this.fIO;
    }
    public int getDepartament(){
        return this.departament;
    }
    public int getsalary(){
        return this.salary;
    }

    public void setDepartament(int departament){
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return ("Порядковый номер " + id + " ФИО " + fIO + " Зарплата " + salary + " Департамент " + departament);
    }



}