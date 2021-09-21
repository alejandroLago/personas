
import persona.Persona;
import java.util.Scanner;
public class main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();

        System.out.println("Escribe nombre:");
        p.setNombre(sc.nextLine());
         System.out.println("Escribe apellido:");
         p.setApellido(sc.nextLine());
         System.out.println("Escribe dni sin letra:");
         p.setDni(Integer.parseInt( sc.nextLine()));

         System.out.println("Nombre: " + p.getNombre()+", Apellido: "+ p.getApellido() + ", DNI sin letra: "+ String.valueOf(p.getDni()));
    }
}
