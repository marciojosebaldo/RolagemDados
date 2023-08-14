package RolagemDados.RolagemDados.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class S_RolagemDados {

    private int qtdeFaces;
    private int qtdeDados;

    List listaSorteioDados = new ArrayList<>(qtdeDados);

    Random gerador = new Random();

    public int calculaValorDados(int qtdeFaces, int qtdeDados) {
        for (int i = 0; i  <= qtdeDados; i++) {

        }
        return 0;
    }
}