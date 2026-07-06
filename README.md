# Explicacion Metodo A 
## Estudiante : Xavier Aucay 
En esta practica se creo una carpeta Models donde creé una clase persona, esta tiene atributos nombre y edad, tambien hice un contructor para inicializar los atributos, get y set para acceder y modificar los datos, y el metodo ToString para mostrar la informacion. 
En la clase App creé una List<Persona> donde se guardan varias personas en una lista para mantener el orden. 
Se creo la Clase PersonaController que tiene el metodo filtrarYOrdenar(), este metodo recibe un alista de personas y una edad minima, Primero creo el TreeSet, un tipo de Set que mantiene los elementos ordenados automaticamente. 
Se utiliza un comparador para ordenar las personas primero por edad de mayor a menor y si dos personas tienen la misma edad, se ordenan alfabeticamente por nombre, ademas se ignora mayusculas y minusculas. Despues se recorre la lista y solo se agregan al TreeSet las personas que la edad sea mayor o igual a la edad que se necesita. 
Sigue el metodo arguparPorRangoEdad(), este agrupa las personas segun su edad utilizando un TreeMap. 
El mapa contiene 3 categorias, joven, adulto, mayor, cada categoria almacena un LinkedHashSet con los primeros nombres. Para obtener el primer nombre utilize split(" ")[0] que divide el nombre completo por espacios y toma la primera palabra. Se usa un LinkedHashSet porque no permite nombres repetidos y además conserva el orden en que fueron agregados.
