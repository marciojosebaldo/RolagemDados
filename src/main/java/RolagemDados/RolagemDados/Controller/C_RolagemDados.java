package RolagemDados.RolagemDados.Controller;

import RolagemDados.RolagemDados.Service.S_RolagemDados;
import org.springframework.stereotype.Controller;

@Controller
public class C_RolagemDados {

    private final S_RolagemDados s_rolagem;

    public C_RolagemDados (S_RolagemDados s_rolagem) {
        this.s_rolagem = s_rolagem;
    }



}
