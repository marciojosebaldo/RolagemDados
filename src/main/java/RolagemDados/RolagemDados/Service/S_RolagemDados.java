package RolagemDados.RolagemDados.Service;

import RolagemDados.RolagemDados.Model.M_RolagemDados;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class S_RolagemDados {

    public static M_RolagemDados(int qtdeFaces, int qtdeDados) {
        int resultadoDados = 0;
        int qtdeDados = 0;
        int
    }


    int somaDados = 0;
    int maiorResultado = 0;

    Random gerador = new Random();

    public void calculaValorDados(int qtdeFaces, int qtdeDados) {
        this.qtdeFaces = qtdeFaces;
        this.qtdeDados = qtdeDados;

        for (int i = 0; i <= qtdeDados; i++) {
            int resultado = gerador.nextInt(qtdeFaces);
            listaSorteioDados.add(resultado);
        }
    }

    public int somaDadosLista() {
        for (Integer n : listaSorteioDados) {
            somaDados += n;
        }
        return somaDados;
    }

    public int maiorResultadoLista() {
        maiorResultado = listaSorteioDados.stream().mapToInt(Integer::intValue).max().orElse(0);
        return maiorResultado;
    }
}