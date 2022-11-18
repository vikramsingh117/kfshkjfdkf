import java.util.*;

abstract class Employ
{
  private String name;
  private long aadhaarNumber;
  abstract double earnings();
  //public static void main (String[] args) {
    //Employ
  //}
  public void setName(String name){
    this.name=name;
  }
  public void setAadhaar(long aadhaarNumber){
    this.aadhaarNumber=aadhaarNumber;
  }
  Employ(String n, long adn){
    this.setName(n);
    this.setAadhaar(adn);
  }
  public String getName(){
    return this.name;
  }
  public double getAadhaar(){
    return this.aadhaarNumber;
  }
}

class commissionEmployee extends Employ
{
  private double grossSale;
  private double cr;
  public void setcommissionRate(double cr){
    this.cr=cr;
  }
  public void setgrossSale(double grossSale){
    this.grossSale=grossSale;
  }
  public double getcommissionRate(){
    return this.cr;
  }
  public double getgrossSale(){
    return this.grossSale;
  }
  commissionEmployee (String name, long adn, double grossSale, double cr ){
    super(name, adn);
    this.setcommissionRate(cr);
    this.setgrossSale(grossSale);
  }
  public double earnings(){
    return (this.grossSale * this.cr);
  }
}
class basePlusCommissionEmployee extends commissionEmployee
{
  private double bs;
  public basePlusCommissionEmployee(String name, long adn, double gs, double cr, double bs)
  {
    super(name, adn, gs, cr);
    this.setBaseSalary(bs);
  }
  public void setBaseSalary(double bs)
  {
    this.bs=bs;
  }
  public double getBaseSalary(){
    return this.bs;
  }
  public double earnings()
  {
    return (this.bs+((this.getgrossSale()*this.getcommissionRate())/100));
  }
}

class SalariedEmployee extends Employ
{
  private double weeklySalary;
  SalariedEmployee(double ws, String name, long adn){
    super(name, adn);
    this.setWeeklySalary(ws);
  }
  public void setWeeklySalary(double ws){
    this.weeklySalary=ws;
  }
  public double getWeeklySalary(){
    return this.weeklySalary;
  }
  public double earnings(){
    return (getWeeklySalary());
  }
}

class HourlyEmployee extends Employ
{
  private double wage;
  private double hours;
  HourlyEmployee(String name, long adn, double w, double h){
    super(name, adn);
    this.setWage(w);
    this.setHours(h);
  }
  public void setWage(double w){
    this.wage=w;
  }
  public void setHours(double h){
    this.hours=h;
  }
  public double getWage(){
    return this.wage;
  }
  public double getHours(){
    return this.hours;
  }
  public double earnings(){
    return (this.wage*this.hours);
  }
}

public class polymor
{
  public static void main (String[] args) {
    basePlusCommissionEmployee bpce=new basePlusCommissionEmployee("Ashish", 452365,12000,5,5500);
    SalariedEmployee se=new SalariedEmployee(45000, "Hello", 456321);
    HourlyEmployee he=new HourlyEmployee("World", 789654, 5000, 8);
    commissionEmployee ce = new commissionEmployee("Ferrari", 963258, 42000, 5);
    System.out.println(bpce.getName());
    System.out.println(bpce.getAadhaar());
    System.out.println(bpce.getBaseSalary());
    System.out.println(bpce.getgrossSale());
    System.out.println(bpce.getcommissionRate());
    System.out.println(bpce.earnings());
   
  }
}
