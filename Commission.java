public class Commission extends Hourly {
    public double totalSales; // wait why isn't this an int
    public double commisionRate;

    // sorry for the ugly indentation
    public Commission(
            String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commisionRate) {

        super(eName, eAddress, ePhone, socSecNumber, rate);

        this.commisionRate = commisionRate;
    }

    public void addSales(double sales) {
        totalSales += sales;

    }

    @Override
    public double pay() {
        double pay = super.pay() + totalSales * (1+commisionRate);
        totalSales = 0;

        return pay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
