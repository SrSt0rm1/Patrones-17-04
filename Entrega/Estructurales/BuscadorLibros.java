import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BuscadorLibros {
    
    private ArrayList<Libro> libros;
    

    public BuscadorLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * 
     * @param titulo Titulo o fragmento del titulo del cual se quiere buscar, libros que tengan este titulo
     * @return Un ArrayList de libros que coinciden completa o parcialmente con este titulo
     */
    public ArrayList<Libro> buscarLibroPorNombre(String titulo){
        Predicate<Libro> condicion = libro -> libro.getTitulo().contains(titulo);
        return libros.stream()
                 .filter(condicion)
                 .collect(Collectors.toCollection(ArrayList::new));
   }

   /**
    * 
    * @param autor Autor del cual se quiere buscar los libros
    * @return Un ArrayList de libros que coinciden con tener a este autor
    */
    public ArrayList<Libro> buscarLibroPorAutor(String autor) {
        Predicate<Libro> condicion = libro -> libro.getAutor().equals(autor);
        return libros.stream()
                 .filter(condicion)
                 .collect(Collectors.toCollection(ArrayList::new));
    }
   
    /**
     * 
     * @param categoria Categoria en la cual se quiere buscar libros que sean de esta misma
     * @return Un ArrayList de libros que coinciden con tener esta categoria
     */
    public ArrayList<Libro> buscarLibroPorCategoria(String categoria){
        Predicate<Libro> condicion = libro -> libro.getCategoria().equals(categoria);
        return libros.stream()
                 .filter(condicion)
                 .collect(Collectors.toCollection(ArrayList::new));
    }
}
