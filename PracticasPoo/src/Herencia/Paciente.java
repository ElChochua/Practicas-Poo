package Herencia;

public class Paciente extends Persona{
    private String enfermedad,alergias;
    public Paciente(String nombre,String genero,String nacionalidad,int edad, String enfermedad,String alergias){
        super(nombre, genero, nacionalidad, edad);
        this.enfermedad = enfermedad;
        this.alergias = alergias;
    }
    @Override
    public void presentarse(){
        System.out.println("Hola me llamo " + this.nombre + " y tengo " + this.edad + " años, presento sintomas de " + this.enfermedad + " y soy alergito a: " + this.alergias);
    }
}
