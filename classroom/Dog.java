/**********************
Dog.java

Jennifer Ruiz Montalvo
This class sets the dog's properties and methods
**********************/
public class Dog{


      private String color;
      private String eyecolor;
      private Double height;
      private Double length;
      private Double weight;

    /*  Metodo GET = obtener
      Metodo SET = establecer*/

      public void setColor(String dogcolor){
        color=dogcolor;
      }
      //gets the dog's color
       public String getColor(){
         return color;
      }
         //set
      public void setEyeColor(String dogeyecolor){
        eyecolor=dogeyecolor;
      }
      //gets
      public String getEyeColor(){
        return eyecolor;
      }
       //sets
       public void setHeight(Double dogheight){
         height=dogheight;
       }
        //gets
        public Double getHeight(){
          return height;
        }
         //sets
         public void setLength(Double doglength){
           length=doglength;
         }
         //ge
         public Double getLength(){
           return length;
         }
         //set
         public void setWeight(Double dogweight){
           weight=dogweight;
         }
         //get
         public Double getWeight(){
           return weight;
         }





      //Dog's Methods - actions

      //Sit method
      public void sit(){
        JOptionPane.showMessageDialog(null, "The dog is sat");
        }

      //Bark Method
      public void bark(){
        JOptionPane.showMessageDialog(null, "The dog is barking");
      }
      //Lay Down Method
      public void layDown(){
        OptionPane.showMessageDialog(null, "The dog is down");
      }

      public void eat(){
        OptionPane.showMessageDialog(null, "The dog is eating");
      }

      public void sleep(){
        OptionPane.showMessageDialog(null, "The dog is sleeping");
      }
    }
