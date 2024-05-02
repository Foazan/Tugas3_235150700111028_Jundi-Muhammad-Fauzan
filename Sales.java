public class Sales extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public Sales(String name, String noKTP, double sales, double rate) {
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    
    public void setGrossSales(double sales) {
        grossSales = sales;
    }
    
    public double getGrossSales() {
        return grossSales;
    }
    
    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }
    
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }
    
    public String toString() {
        return String.format("Sales: " + super.toString() + "\nTotal Penjualan: " + getGrossSales() + "\nBesar Komisi: " + getCommissionRate());
    }
}
