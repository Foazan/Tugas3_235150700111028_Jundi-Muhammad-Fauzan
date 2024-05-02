public class PegawaiTetap extends Employee {
    private double monthlySalary; 
    
    public PegawaiTetap(String name, String noKTP, double salary) {
        super(name, noKTP);
        setMonthlySalary(salary);
    }
    
    public void setMonthlySalary(double salary) {
        monthlySalary = salary;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    }
    
    public double earnings() {
        return getMonthlySalary();
    }
    
    public String toString() {
        return String.format("Pegawai Tetap: " + super.toString() + "\nUpah: " + getMonthlySalary());
    }
}
