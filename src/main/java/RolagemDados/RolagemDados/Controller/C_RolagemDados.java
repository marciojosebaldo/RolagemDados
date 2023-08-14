package RolagemDados.RolagemDados.Controller;

import RolagemDados.RolagemDados.Service.S_RolagemDados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_RolagemDados {

    private final S_RolagemDados s_rolagem;

    public C_RolagemDados (S_RolagemDados s_rolagem) {
        this.s_rolagem = s_rolagem;
    }

    @GetMapping("/")
    public String pagInicial(){
        return "Home/home";
    }

    @PostMapping("/")
    public String calculoDados(@RequestParam("qtdeFaces") int qtdeFaces,
                               @RequestParam("qtdeDados") int qtdeDados,
                               Model model) {



        return "Home/home";
    }
}
