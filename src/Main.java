import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Event> eventos = Arrays.
                asList(new Event(1, "Ciro", new Location(1, "palco", new City(1, "Tandil"))),
                        new Event(8, "Rolling Stone", new Location(8, "campo", new City(8, "CABA"))),
                        new Event(4, "AC DC", new Location(4, "platea", new City(8, "Cordoba"))),
                        new Event(3, "Indio Solari", new Location(3, "vip", new City(3, "La Plata"))),
                        new Event(9, "Taylor Swift", new Location(9, "Campo vip", new City(9, "Olavarria"))),
                        new Event(14, "Celine Dion", new Location(14, "Escenario", new City(14, "Azul"))),
                        new Event(11, "Imagine Dragons", new Location(11, "Gradas", new City(11, "Neuquen"))),
                        new Event(7, "La Renga", new Location(7, "platea vip", new City(7, "Salta"))));



        //Vamos a buscar evento por id
        Event e = buscarPorId(eventos, 8);
        System.out.println(e.toString());
        String ciudad = getNombreCiudadPorIdEvento(eventos, 4);
        System.out.println(ciudad);

        //ok, ahora vamos a ordenar los eventos por ID
        List<Event> ordenaditos = getInOrderId(eventos);
        Iterator iter = ordenaditos.iterator();
        while(iter.hasNext()){
            e = (Event) iter.next();
            System.out.println(e.toString());
        }
        //muy bien, ahora vamos a mostrar los 5 primeros!
        List<Event> primeros = getTopFantasticFive(eventos);
        System.out.println("Los 5 primeros eventos de mi lista son : ");
        Iterator ite = primeros.iterator();
        while(ite.hasNext()){
            e = (Event) ite.next();
            System.out.println(e.toString());
        }






    }
    private static Event buscarPorId(List<Event> eventos, Integer id){
        return eventos.stream()
                .filter(o -> id.equals(o.getId()))
                .findFirst()
                .get();

    }
    private static String getNombreCiudadPorIdEvento(List eventos, Integer id){
        return Optional.ofNullable(buscarPorId(eventos,id))
                .map(Event::getLocation)
                .map(Location::getCity)
                .map(City::getName)
                .orElse("No hay eventos en esa ciudad");
    }

    private static List<Event> getInOrderId(List<Event> eventos){
        eventos.sort(Comparator.comparingInt(Event::getId));
        return eventos;
    }
    private static List<Event> getTopFantasticFive(List<Event> eventos){
        List<Event> topFive = eventos.stream().limit(5).collect(Collectors.toList());
        return topFive;

    }

}
