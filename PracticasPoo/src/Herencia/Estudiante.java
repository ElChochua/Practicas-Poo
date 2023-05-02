package Herencia;

public class Estudiante extends Persona{
    private String carrera, escuela;
    public Estudiante(String nombre,String genero,String nacionalidad,int edad, String carrera,String escuela){
        super(nombre,genero,nacionalidad,edad);
        this.carrera = carrera;
        this.escuela = escuela;
    }
    @Override
    public void presentarse(){
        System.out.println("Hola me llamo " + this.nombre + " y tengo " + this.edad + " años" + " estudio " + this.carrera + " en la " + this.escuela);
    }
}
