public class ConsoleBasedFizzBuzz implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++){
            System.out.println(obtenerFizzBuzzString(i));
        }
    }

    private String obtenerFizzBuzzString(int valor) {
        if (esDivisor(valor, 3) && esDivisor(valor, 5)){
            return "FizzBuzz";
        } else if (esDivisor(valor, 3)){
            return "Fizz";
        } else if (esDivisor(valor, 5)){
            return "Buzz";
        } 
        return String.valueOf(valor);
    }

    private boolean esDivisor(int valor, int divisor) {
        return (valor % divisor == 0);
    }
}


