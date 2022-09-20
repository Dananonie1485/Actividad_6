import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones{

    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Obtención de nombre

        System.out.println("Introduce tu nombre completo: ");
        String nombresalumnos = br.readLine();

        //Obtención de calificaciones

        System.out.println("Introduzca las calificaciones a capturar (5): ");
        String cali1 = br.readLine();
        String cali2 = br.readLine();
        String cali3 = br.readLine();
        String cali4 = br.readLine();
        String cali5 = br.readLine();

        //Lectura de calificaciones

        int num1 = Integer.parseInt(cali1);
        int num2 = Integer.parseInt(cali2);
        int num3 = Integer.parseInt(cali3);
        int num4 = Integer.parseInt(cali4);
        int num5 = Integer.parseInt(cali5);

        //Operación para obtención de promedio

        int califinal = (num1+num2+num3+num4+num5)/5;

        //impresion de datos

        System.out.println("Boleta de calificaciones");
        System.out.println("Nombre alumno/a:  " + nombresalumnos);
        System.out.println("Calificación 1: " + num1);
        System.out.println("Calificación 2: " + num2);
        System.out.println("Calificación 3: " + num3);
        System.out.println("Calificación 4: " + num4);
        System.out.println("Calificación 5: " + num5);
        System.out.println("Calificación Final: " + califinal);

        //Rango con letras

        if (califinal>90 && califinal<=100  ){

            System.out.println("Rango: A");
        }
        else if(califinal>80 && califinal<=90  ){

            System.out.println("Rango: B");
        }
        else if(califinal>70 && califinal<=80  ){

            System.out.println("Rango: C");
        }
        else if(califinal>60 && califinal<=70  ){

            System.out.println("Rango: D");
        }
        else if(califinal<60 ){

            System.out.println("Rango: F");
        }

    }

}