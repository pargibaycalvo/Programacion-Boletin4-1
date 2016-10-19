package boletin4_3;

public class Circulo {
     private double radio;
      private final double PI = 3.14;
      //Constructores
      public Circulo(){
      }
      public Circulo(double ra){
          radio=ra;
      }
      //Metodos de acceso
      
      public void setRadio(double ra){
          radio=ra;
      }
      public double getRadio(){
          return radio;
      }
      // Metodos
      public double calcularArea(){
      return PI*Math.pow(radio,2f);
      }
      //Estaba aqui
      public double calcularLonxitude(){
          return 2*PI*radio;
      }
      
    
}
