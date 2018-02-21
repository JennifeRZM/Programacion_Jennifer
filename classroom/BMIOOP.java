/*************
BMIOOP.java
Jennifer Ruiz Montalvo

This class calculates the Body Mass Index
*************/

public class BMIOOP{
  //properties - atributes
  private String name;
  private int age;
  private double weight;
  private double height;

  //methods - actions
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setName(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  public double getWeight(){
    return weight;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public double getHeight(){
    return height;
  }
  public double getBMI(){
  double bmi = this.weight * KILOGRAMS_PER_POUND / ((this.height * METERS_PER_INCH) * (this.height * METERS_PER_INCH));
  return Math.round(bmi * 100) /100;
  }
}
