public class App {
    
    }
    public class App {
    }
    public class Diccionario java {
    public static void main(String[] args) {
        // Arreglo de palabras en inglés y sus traducciones al español
        String[][] palabras = {
            {"computer", "ordenador"},
            {"student", "alumno/a"},
            {"cat", "gato"},
            {"penguin", "pingüino"},
            {"machine", "máquina"},
            {"nature", "naturaleza"},
            {"light", "luz"},
            {"green", "verde"},
            {"book", "libro"},
            {"pyramid", "pirámide"}
        };

        // Imprimir las palabras en dos columnas alineadas a la izquierda
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("%-10s %s%n", palabras[i][0], palabras[i][1]);
        }
    }
}
}
