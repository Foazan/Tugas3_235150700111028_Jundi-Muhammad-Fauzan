public class PegawaiHarian extends Employee {
    private double wage;
    private double hours;

    public PegawaiHarian(String name, String noKTP, double hourlyWage, double hoursWorked) {
        super(name, noKTP);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    public String toString() {
        return String.format("Pegawai Harian: " + super.toString() + "\nUpah/jam: " + getWage() + "\nTotal Jam Kerja: " + getHours());
    }
}
