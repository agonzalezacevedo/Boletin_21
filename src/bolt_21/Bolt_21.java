package bolt_21;

import Metodos.Libro;
import Metodos.Metodos;
import java.io.File;
import java.util.*;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt_21 {

    public static void main(String[] args) {
        ArrayList<Libro> libro = new ArrayList();
        Metodos obx = new Metodos();
        File ficheiro = new File("libros.txt");
        int resposta;

        do {
            System.out.println("\n------Menu------"
                            + "\n 1.-Engadir"
                            + "\n 2.-Consultar"
                            + "\n 3.-Visualizar"
                            + "\n 4.-Borrar"
                            + "\n 5.-Modificar"
                            + "\n 0.-Saír.");
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    obx.engadirLibro("libros.txt");
                    break;
                case 2:
                    obx.consultar(ficheiro);
                    break;
                case 3:
                    obx.visualizar(ficheiro);
                    break;
                case 4:
                    obx.borrar(libro, ficheiro);
                    obx.actualizar("libros.txt", libro);
                    break;
                case 5:
                    obx.cambioPrezo(libro);
                    obx.actualizar("libros.txt", libro);
            }
        } while (resposta != 0);

    }
}
