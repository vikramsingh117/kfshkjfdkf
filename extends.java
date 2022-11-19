class CommissionEmployee{
    private String Name;
    private double grossSales;
    private double commRate;
    public CommissionEmployee(String x, double y, double z){
        this.Name=x;
        this.grossSales=y;
        this.commRate=z;
    }
    public void setName(String a){
        this.Name=Name;
    }
    public void setgrossSales(double b){
        this.grossSales=grossSales;
    }
    public void setcommRate(double c){
        this.commRate=commRate;
    }
    public String getName(){
        return this.Name;
    }
    public double getgrossSales(){
        return this.grossSales;
    }
    public double getcommRate(){
        return this.commRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String Name, double grossSales, double commRate, double baseSalary){
        super(Name,grossSales,commRate);
        this.baseSalary=baseSalary;
    }
    public double earnings(){
        return this.baseSalary+(this.getgrossSales()*this.getcommRate());
    }
    public double getbaseSalary(){
        return this.baseSalary;
    }
}
class test{
    public static void main(String[] args){
        CommissionEmployee ce = new CommissionEmployee("Rama",5000,5);
        System.out.println(ce.getName());
        System.out.println(ce.getgrossSales());
        System.out.println(ce.getcommRate());

        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Raja",10000,7,7000);
        System.out.println(bpce.getName());
        System.out.println((bpce.getgrossSales()));
        System.out.println(bpce.getcommRate());
        System.out.println(bpce.getbaseSalary());
        System.out.println(bpce.earnings());
        ce=bpce;

        System.out.println(ce.getName());
        System.out.println(ce.getgrossSales());
        System.out.println(ce.getcommRate());
    }
}
