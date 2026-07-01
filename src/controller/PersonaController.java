package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import model.Persona;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edad){
        Set<Persona> personaFiltradas = new  TreeSet<>((p1, p2) ->{
            int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());
            if(compEdad != 0) {
                return compEdad;
            } 
            return p1.getNombre().compareToIgnoreCase(p2.getNombre()); 
        });

        for (Persona persona : personas){
            if(persona.getEdad()>= edad){
                personaFiltradas.add(persona);
            }
        }
        return personaFiltradas;

 
    }
    
    public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas) {
        Map<String, Set<String>> personasAgrupadas = new TreeMap<>();

        personasAgrupadas.put("ADULTO", new LinkedHashSet<>());
        personasAgrupadas.put("JOVEN", new LinkedHashSet<>());
        personasAgrupadas.put("MAYOR", new LinkedHashSet<>());

        for (Persona persona : personas) {

            String primerNombre = persona.getNombre().split(" ")[0];

            if (persona.getEdad() < 30) {
                personasAgrupadas.get("JOVEN").add(primerNombre);
            } else if (persona.getEdad() < 60) {
                personasAgrupadas.get("ADULTO").add(primerNombre);
            } else {
                personasAgrupadas.get("MAYOR").add(primerNombre);
            }
        }

        return personasAgrupadas;
    }
}