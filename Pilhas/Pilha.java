import java.util.Stack;
import javax.swing.JOptionPane;

public class Pilha {

    public static void main(String[] args) {

        String ex1 = "UM CIENTISTA DA COMPUTACAO E UM TECNOLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String ex2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        String return1 = inverterPalavras(ex1);
        String return2 = inverterPalavras(ex2);

        JOptionPane.showMessageDialog(null, "Exemplo 1: " + ex1 + "\n R: " + return1 );
        JOptionPane.showMessageDialog(null, "Exemplo 2: " + ex2  + "\n R: " + return2 );
    }

    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();

            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            resultado.append(" ");
        }

        return resultado.toString().trim();
    }
}
