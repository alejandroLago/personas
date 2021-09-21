package persona;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    public int edad;


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        if(edad>=18){
            System.out.println("maquina");
        }
        this.edad = edad;
    }
}
