/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_diego_lara;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Lab3P1_Diego_Lara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta = 1;
        
        while(respuesta < 4) {
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. ¡OK Boomber!");
            System.out.println("Ingrese una opcion: ");
            int opcion  = leer.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de puntos: ");
                    int puntos = leer.nextInt();
                    while(puntos <= 0) {
                        System.out.println("Error. Ingresar numeros positivos");
                                puntos = leer.nextInt();
                    }
                    double raiz = 0;
                    for(int i = 1; i <= puntos; i++) {
                        System.out.println("X: ");
                        double x = leer.nextInt();
                        System.out.println("Y: ");
                        double y = leer.nextInt();
                        
                        double formula = (x - y);
                        double serie = Math.pow(formula,2);
                        raiz += serie;
                    }
                        System.out.println("La distancia euclidiana es: " + Math.sqrt(raiz));                    
                    break;
                    
                case 2:
                    System.out.println("Ingrese el tamaño: ");
                    int limite  = leer.nextInt();
                    while(limite <= 0) {
                        System.out.println("Error. Tiene que ser un valor mayor a 0.");
                        limite = leer.nextInt();
                    }
                    for (int i = 0; i <= limite - 1; i++) {
                        for (int j = 0; j <= limite; j++) {
                            if (i < 2 || i == limite - 2) {
                                System.out.print("*");
                            } else if (i == 2 && (j < 4 || (j >= 5 && j < 10))) {
                                System.out.print("*");
                            } else if (i == 2 && (j >= 4 && j < 9)) {
                                System.out.print("#");
                            } else if (i == 3 && (j == 0 || j == limite - 1 || (j >= 1 && j < 4) || (j > 8 && j < 12))) {
                                System.out.print("*");
                            } else if (i == 3 && (j >= 4 && j < 9)) {
                                System.out.print(" ");
                            } else if (i == 4 && (j == 0 || j == limite - 1 || (j > 0 && j < 4) || (j > 8 && j < 12))) {
                                System.out.print(" ");
                            } else if (i == 4 && (j >= 4 && j < 9)) {
                                System.out.print("#");
                            } else if (i == 5 && (j == 0 || j == limite - 1)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("*");
                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese su año de nacimiento: ");
                    int nacimiento = leer.nextInt();
                    while(nacimiento <1946 || nacimiento > 2025) {
                        System.out.println("Fecha de nacimiento no valida");
                        nacimiento = leer.nextInt();
                    }
                        if(nacimiento >= 1946 && nacimiento <= 1964) {
                            System.out.println("¡Felicidades usted es de la Baby Boomer Gen!");
                        } else if(nacimiento >=1960 && nacimiento <=1979) {
                            System.out.println("¡Felicidades usted es de la Generation X!");
                        } else if(nacimiento >=1975 && nacimiento <= 1985) {
                            System.out.println("¡Felicidades usted es de la generacion de Xennials!");
                        } else if(nacimiento >= 1980 && nacimiento <= 1994) {
                            System.out.println("¡Felicidades usted es de la generacion de Millenials!");
                        } else if(nacimiento >= 1990 && nacimiento <= 2012) {
                            System.out.println("¡Felicidades usted es de la Gen Z!");
                        } else if (nacimiento >= 2013 && nacimiento <=2025) {
                            System.out.println("¡Felicidades usted es de la Gen Alpha");
                        }
                    
                    break;
                    
                default:
                    if(opcion != 3) {
                        System.out.println("Error, opcion no valida");
                    }
                    break;
            }
            System.out.println("Para regresar al menu precion [1/2/3] sino, precione 4");
            respuesta = leer.nextInt();
        }
    }
    
}
