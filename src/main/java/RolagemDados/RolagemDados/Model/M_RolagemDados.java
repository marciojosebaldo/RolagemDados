package RolagemDados.RolagemDados.Model;

public class M_RolagemDados {
    private int[] resultadoDados;
    private int somaRolagemDados;
    private int valorMaximoRolagemDados;

    public M_RolagemDados(int[] resultadoDados, int somaRolagemDados, int valorMaximoRolagemDados) {
        this.resultadoDados = resultadoDados;
        this.somaRolagemDados = somaRolagemDados;
        this.valorMaximoRolagemDados = valorMaximoRolagemDados;
    }

    public int[] getResultadoDados() {
        return resultadoDados;
    }

    public int getSomaRolagemDados() {
        return somaRolagemDados;
    }

    public int getValorMaximoRolagemDados() {
        return valorMaximoRolagemDados;
    }
}