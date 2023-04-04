import java.util.Stack;

public class Pilha {
    public static String inverte(String s) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                pilha.push(c);
            } else {
                while (!pilha.empty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(c);
            }
        }
        while (!pilha.empty()) {
            resultado.append(pilha.pop());
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String s1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String s2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";

        System.out.println(inverte(s1));
        System.out.println(inverte(s2));
    }
}
