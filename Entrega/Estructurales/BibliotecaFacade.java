import java.util.ArrayList;

public class BibliotecaFacade {
    private BuscadorLibros buscador;

    public BibliotecaFacade(ArrayList<Libro> libros) {
        buscador =  new BuscadorLibros(libros);
    }

    /**
     * 
     * @param titulo Titulo o fragmento del titulo del cual se quiere buscar, libros que tengan este titulo
     * @return Un ArrayList de libros que coinciden completa o parcialmente con este titulo
     */
    public ArrayList<Libro> buscarLibroPorNombre(String titulo){
        return buscador.buscarLibroPorNombre(titulo);
    }

    /**
    * 
    * @param autor Autor del cual se quiere buscar los libros
    * @return Un ArrayList de libros que coinciden con tener a este autor
    */
    public ArrayList<Libro> buscarLibroPorAutor(String autor){
        return buscador.buscarLibroPorAutor(autor);
    }

    /**
     * 
     * @param categoria Categoria en la cual se quiere buscar libros que sean de esta misma
     * @return Un ArrayList de libros que coinciden con tener esta categoria
     */
    public ArrayList<Libro> buscarLibroPorCategoria(String categoria){
        return buscador.buscarLibroPorCategoria(categoria);
    }

    
}
