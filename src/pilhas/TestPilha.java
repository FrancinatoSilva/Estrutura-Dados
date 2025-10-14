package pilhas;

import java.util.Stack;

public class TestPilha {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("Pagina 1");
        stack.push("Pagina 2");
        stack.push("Pagina 3");
        System.out.println(stack.pop());

    }
}
