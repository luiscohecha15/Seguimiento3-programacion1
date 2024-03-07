import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int selec;
        String isbnFinder;
        boolean flag = true;
        ArrayList<Books> library = new ArrayList<>();

        library.add(new Books("12345", "El principito", "Antoine de Saint-Exupér", "1943", "CarranzasEdit", "200", "Fantasia"));
        library.add(new Books("12346", "La metamorfosis", "Franz Kafka", "1915", "CarranzasEdit", "150", "Fantasia"));
        library.add(new Books("12347", "El gato negro", "Edgar Allan Poe", "1843", "CarranzasEdit", "300", "Fantasia"));

        do{
            selec = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la opcione deseada" +
                    "\n1. Registrar libro\n2. Busqueda de libro\n3. Prestamo de libros\n4. Devoluciones\n5. Consulta de libros prestados por usuario\n6. Salir"));

            switch (selec){
                case 1:

                    library.add(new Books(JOptionPane.showInputDialog(null, "Ingrese el ISBN"), JOptionPane.showInputDialog(null,"Nombre del Libro"),
                            JOptionPane.showInputDialog(null,"Nombre del Autor"),
                            JOptionPane.showInputDialog(null,"Fecha de publicacion"),
                            JOptionPane.showInputDialog(null,"Nombre de la editorial"),
                            JOptionPane.showInputDialog(null,"Numero de paginas"),
                            JOptionPane.showInputDialog(null,"Categoria del libro")));


                    JOptionPane.showMessageDialog(null, "Libro Añadido\nISBN: "+ library.getLast().getISBN() +"\nNombre del libro: "+ library.getLast().getTittle() +"\nNombre del Autor: "+ library.getLast().getAuthor() +
                            "\nFecha de publicacion: "+ library.getLast().getYear() + "\nNombre de la editorial: "+ library.getLast().getEdit() + "\nNumero de paginas: " +library.getLast().getPages()+
                            "\nCategoria del libro: "+ library.getLast().getCategory());
                    System.out.println(library.size());
                    break;
                case 2:
                    isbnFinder = JOptionPane.showInputDialog(null, "Ingrese el ISBN para encontrar en la base el libro");

                    for (Books libro : library){
                        if (libro.getISBN().equals(isbnFinder)){
                            JOptionPane.showMessageDialog(null,"LIBRO ENCONTRADO\n" +
                                    "ISBN: "+ libro.getISBN()+"\nAutor: "+ libro.getAuthor()+"\nFecha publicacion: "+
                                    libro.getYear()+"\nEditorial: "+ libro.getEdit()+"\nPaginas: "+ libro.getPages()+
                                    "\nCategoria: "+ libro.getCategory());
                            break;
                        }else {
                            JOptionPane.showMessageDialog(null,"No se encuentra el libro");
                        }
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    flag=false;
                    break;
            }

        }while (flag);




    }
}