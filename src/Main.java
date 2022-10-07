public class Main {
    private static Employee[] compound = new Employee[5];

    public static void main(String[] args) {

        compound[0] = new Employee("Муравей Павел Сергеевич ", 1, 20000);
        compound[1] = new Employee("Богомолов Иван Петрович", 2, 30000);
        compound[2] = new Employee("Леопардова Людмила Алексеевна", 3, 40000);
        compound[3] = new Employee("Носорогов Александр Петрович", 4, 50000);
        compound[4] = new Employee("Соловей Анна Павловна", 5, 60000);

        massiv();
        expenses();
        maxsalary();
        minsalary();
        mean();
        employees();


    }

    private static void massiv() {

        for (Employee a : compound) {
            System.out.println(a);
        }
    }

    private static void expenses() {
        int summm = 0;
        for (int i = 0; i < compound.length; i++) {
            summm = summm + compound[i].getsalary();
        }
        System.out.println("Сумма затрат на зарплаты составляет: " + summm);
    }

    private static void maxsalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < compound.length; i++) {
            if (max < compound[i].getsalary()) {
                max = compound[i].getsalary();
            }
        }
        System.out.println("Максимальная зарплату у: " + compound[4].getfIO() + " " + max + " рублей");
    }

    private static void minsalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < compound.length; i++) {
            if (min > compound[i].getsalary()) {
                min = compound[i].getsalary();

            }
        }
        System.out.println("Минимальная зарплату у: " + compound[0].getfIO() + " " + min + " рублей");
    }


    private static void mean() {
        float summm = 0;
        for (int i = 0; i < compound.length; i++) {
            summm = summm + compound[i].getsalary();
        }
        float srSumm = summm / compound.length;
        System.out.println("Средняя ЗП составляет: " + srSumm);
    }

    private static void employees() {
        for (int i = 0; i < compound.length; i++) {
            System.out.println(compound[i].getfIO());
        }
    }


}