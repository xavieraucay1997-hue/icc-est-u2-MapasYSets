import java.util.ArrayList;
import java.util.List;

import controller.PersonaController;
import model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan Perez", 20));
        personas.add(new Persona("Ana López", 40));
        personas.add( new Persona("Pedro Morales", 65));
        personas.add(new Persona("juan pérez", 25));
        personas.add(new Persona("Ana Torres", 35));

        PersonaController pc = new PersonaController();
        System.out.println("filtrar y ordenar");
        System.out.println(pc.filtrarYOrdenar(personas, 25));
        System.out.println();

        System.out.println("agrupar");
        System.out.println(pc.agruparPorRangoEdad(personas));


    }
}
