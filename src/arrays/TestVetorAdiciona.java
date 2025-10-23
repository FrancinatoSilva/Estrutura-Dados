package arrays;

import java.util.Scanner;

public class TestVetorAdiciona {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores você deseja inserir? ");
        VetorAdiciona valores = new VetorAdiciona(input.nextInt());

        System.out.print("Informe o valor: ");
        valores.adicionarElemento(input.nextDouble());


        input.close();
    }
}
