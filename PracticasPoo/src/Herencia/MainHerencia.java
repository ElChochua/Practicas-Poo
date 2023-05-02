package Herencia;

public class MainHerencia {
    public static void main(String[] args) {
        AvionCargero avionC = new AvionCargero("Cargero", "B22", "Charger", 3, 200);
        AvionComercial avionComercial = new AvionComercial("Boeig 732", "Comercial", "B32C", 4, 100, 70);
        AvionCombate avionCombate = new AvionCombate("Caza", "Combate", "F-15", "Reconocimiento", 30000.0, 3, 660.0);
        Estudiante estudiante = new Estudiante("Negrete Arce", "Masculino", "Mexicano", 20, "Ing.Software", "Uas");
        Paciente paciente = new Paciente("Ernesto Amaral", "Masculino", "Mexicano", 20, "Dolor De panza", "Nuez");
        Proveedor proveedor = new Proveedor("Juan Perez", "Masculino", "Mexicano", 20, "Coca Cola", "Refrescos");
        Zorro zorro = new Zorro("Zorro", "Zorro Artico", "Pequeño", "Blanco", "Carnivoro");
        Perro perro = new Perro("Firulais", "Chihuahua", "Pequeño", 100);
        Lobo lobo = new Lobo("Lobo", "Lobo Artico", "Grande", 20, "Cazador");
        lobo.Aullar();
        lobo.Cazar();
        perro.Marcar();
        perro.Jugar();
        zorro.Excavar();
        zorro.Camuflarse();
        paciente.presentarse();
        proveedor.presentarse();
        estudiante.caminar();
        estudiante.detenerse();
        estudiante.presentarse();
        avionCombate.despegar();
        avionCombate.sobreVolar();
        avionCombate.aterrizar();
        avionComercial.transporta();
        avionComercial.despegar();
        avionComercial.aterrizar();
        avionC.despegar();
        avionC.aterrizar();
        avionC.carga();
    }
}
