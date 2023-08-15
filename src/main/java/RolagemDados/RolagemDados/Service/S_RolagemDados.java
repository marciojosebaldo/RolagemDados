package RolagemDados.RolagemDados.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class S_RolagemDados {

    private int qtdeFaces;
    private int qtdeDados;
    int somaDados = 0;
    int maiorResultado = 0;

    ArrayList<Integer> listaSorteioDados = new ArrayList();

    Random gerador = new Random();

    public void calculaValorDados(int qtdeFaces, int qtdeDados) {
        this.qtdeFaces = qtdeFaces;
        this.qtdeDados = qtdeDados;

        for (int i = 0; i <= qtdeDados; i++) {
            int resultado = gerador.nextInt(qtdeFaces);
            listaSorteioDados.add(resultado);
        }
    }

    public List<Integer> gerarListaSorteioDados() {
        return listaSorteioDados;
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