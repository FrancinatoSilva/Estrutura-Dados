package arrays;

public class VetorAdiciona {
    private double[] elementos;
    private int tamanho;

    public VetorAdiciona(int capacidade) {
        elementos = new double[capacidade];
        tamanho = 0;
    }

    public boolean adicionarElemento(double elemento) {
        if(tamanho == elementos.length) {
            return false;
        }
        elementos[tamanho] = elemento;
        tamanho++;
        return true;
    }

}
