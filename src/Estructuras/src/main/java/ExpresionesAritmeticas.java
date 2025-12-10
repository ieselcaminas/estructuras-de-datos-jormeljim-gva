import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calcular("5 1 2 + 4 * + 3 -"));
    }

    public static int calcular(String expresionAritmetica){
        String[] valores = expresionAritmetica.split(" ");
        Stack<Integer> pila = new Stack<>();
        int num1;
        int num2;
        int res;
        for (int i = 0; i < valores.length; i++) {
            String valActual = valores[i];

            switch (valActual){
                case "+":
                    num1 = pila.pop();
                    num2 = pila.pop();
                    res = num2 + num1;
                    pila.push(res);
                    break;
                case "-":
                    num1 = pila.pop();
                    num2 = pila.pop();
                    res = num2 - num1;
                    pila.push(res);
                    break;
                case "/":
                    num1 = pila.pop();
                    num2 = pila.pop();
                    res = num2 / num1;
                    pila.push(res);
                    break;
                case "*":
                    num1 = pila.pop();
                    num2 = pila.pop();
                    res = num2 * num1;
                    pila.push(res);
                    break;
                default:
                    pila.push(Integer.parseInt(valActual));
            }
        }
        return pila.pop();
    }
}
