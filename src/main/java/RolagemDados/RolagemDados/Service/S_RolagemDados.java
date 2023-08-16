package RolagemDados.RolagemDados.Service;

import RolagemDados.RolagemDados.Model.M_RolagemDados;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class S_RolagemDados {

    public static M_RolagemDados rolagemDados(int qtdeFaces, int qtdeDados) {
        int[] resultadoDados = new int[qtdeDados];
        int somaRolagemDados = 0;
        int valorMaximoRolagensDados = 0;
        int auxiliar = 0;

        for (int i = 0; i < qtdeDados; i++) {
            Random gerador = new Random();
            auxiliar = gerador.nextInt(qtdeFaces) + 1;
            resultadoDados[i] = auxiliar;
            somaRolagemDados += auxiliar;

            if (valorMaximoRolagensDados <= auxiliar) {
                valorMaximoRolagensDados = auxiliar;
            }
        }

        M_RolagemDados m_rolagemDados = new M_RolagemDados(resultadoDados, somaRolagemDados, valorMaximoRolagensDados);
        return m_rolagemDados;

    }
}