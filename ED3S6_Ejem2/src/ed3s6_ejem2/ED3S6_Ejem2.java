/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_ejem2;

/**
 *
 * @author adria
 */
public class ED3S6_Ejem2 {
int a;
public void suma(){
    int a = 3;
    int b = 7;
    int c = a+b;
    System.out.println("La suma de a + b es " + c);
    mensaje();
}
private void mensaje(){
    System.out.println("Bienvenidos a estructura de datos");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ED3S6_Ejem2 obj = new ED3S6_Ejem2();
        obj.suma();
        obj.mensaje();
    }
    
}
