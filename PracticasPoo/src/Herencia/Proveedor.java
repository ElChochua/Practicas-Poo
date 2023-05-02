package Herencia;

public class Proveedor extends Persona{
    private String compania,productos;
    public Proveedor(String nombre,String genero,String nacionalidad,int edad,String compania,String productos){
    super(nombre, genero, nacionalidad, edad);
    this.compania = compania;
    this.productos = productos;
    }
    public void entregar(){
        System.out.println("El proveedor " + this.nombre + " esta entregando " + this.productos);
    }
    public void cobrar(){
        System.out.println("El proveedor " + this.nombre + " esta cobrando");
    }
}
