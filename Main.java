public class Main {
    public static void main(String[] args) {
        PegawaiTetap PegawaiTetap1 = new PegawaiTetap("Rimuru", "111111111", 999);
        PegawaiTetap PegawaiTetap2 = new PegawaiTetap("Giorno", "222222222", 666);
        PegawaiTetap PegawaiTetap3 = new PegawaiTetap("Kira", "333333333", 888);
        PegawaiHarian PegawaiHarian1 = new PegawaiHarian("Asuka", "11111111", 15, 70);
        PegawaiHarian PegawaiHarian2 = new PegawaiHarian("Furina", "22222222", 16, 30);
        PegawaiHarian PegawaiHarian3 = new PegawaiHarian("Megumi", "33333333", 18, 40);
        Sales Sales1 = new Sales("Topaz", "1111111", 20000, .06);
        Sales Sales2 = new Sales("Emu", "2222222", 17000, .06);
        Sales Sales3 = new Sales("Cirno", "3333333", 10000, .06);
        
        Employee[] employees = new Employee[9];
        employees[0] = PegawaiTetap1;
        employees[1] = PegawaiTetap2;
        employees[2] = PegawaiTetap3;
        employees[3] = PegawaiHarian1;
        employees[4] = PegawaiHarian2;
        employees[5] = PegawaiHarian3;
        employees[6] = Sales1;
        employees[7] = Sales2;
        employees[8] = Sales3;
        
    for (Employee currentEmployee : employees) {
            System.out.println("Informasi Karyawan:");
            System.out.println(currentEmployee);
            System.out.printf("Pendapatan total: $%,.2f\n\n", currentEmployee.earnings());
        }
    
    }
}
