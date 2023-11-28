import java.util.Random;

public class NumeroAleatorioParImpar {
    public static void main(String[] args) {
        try {
            // Generar un número aleatorio entre 0 y 999
            Random random = new Random();
            int numero = random.nextInt(1000);
            
            // Determinar si el número es par o impar
            if (numero % 2 == 0) {
                // Lanzar una excepción con el mensaje "El número es par"
                throw new Exception("El número es par");
            } else {
                // Lanzar una excepción con el mensaje "El número es impar"
                throw new Exception("El número es impar");
            }
        } catch (Exception e) {
            // Mostrar el mensaje asociado a la excepción capturada
            System.out.println(e.getMessage());
        }
    }
}