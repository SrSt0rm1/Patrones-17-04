import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Libro libro = new Libro("50 Sombras de Gray", "Gray", "Accion");
        Libro libro2 = new Libro("Maya y la piedra filosofal", "Esteban", "Ficcion");
        Libro libro3 = new Libro("50 Sombras de Gray, la venganza", "Gray", "Accion");
        Libro libro4= new Libro("50 Sombras de Gray, el regreso", "Gray", "Drama");
        Libro libro5= new Libro("Los limites no aflojan", "Helen", "Suspenso");

        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(libro);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);

        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade(lista);
        
        System.out.println("Por autor:");
        System.out.println(bibliotecaFacade.buscarLibroPorAutor("Gray"));
        System.out.println("Por titulo: ");
        System.out.println(bibliotecaFacade.buscarLibroPorNombre("50"));
        System.out.println("Por categoria: ");
        System.out.println(bibliotecaFacade.buscarLibroPorCategoria("Suspenso"));

    }
}
