package arrays;

public class Test001 {
    public static void main(String[] args) {

        try {
            Vetor nomes = new Vetor(5);
            nomes.adicionar("Yasmin");
            nomes.adicionar("Francis");
            nomes.adicionar("Leandro");

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }
}
