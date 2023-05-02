package Herencia;

public class Persona {
    String nombre, genero, nacionalidad;
    int edad;
    public Persona(String nombre,String genero,String nacionalidad,int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    public void caminar(){
        System.out.println(this.nombre + " Esta caminando");
    }
    public void detenerse(){
        System.out.println(this.nombre + " se ha detenido");
    }
    public void presentarse(){
        System.out.println("Hola me llamo " + this.nombre + " y tengo " + this.edad + " años");
    }
}
