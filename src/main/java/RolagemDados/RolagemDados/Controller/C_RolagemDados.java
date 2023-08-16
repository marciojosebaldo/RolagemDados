package RolagemDados.RolagemDados.Controller;

import RolagemDados.RolagemDados.Model.M_RolagemDados;
import RolagemDados.RolagemDados.Service.S_RolagemDados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_RolagemDados {

    @GetMapping("/")
    public String pagInicial(){
        return "Home/home";
    }

    @PostMapping("/")
    public String calculoDados(@RequestParam("qtdeFaces") int qtdeFaces,
                               @RequestParam("qtdeDados") int qtdeDados,
                               Model model) {

        M_RolagemDados m_rolagemDados = S_RolagemDados.rolagemDados(qtdeFaces, qtdeDados);

        model.addAttribute("qtdeFaces", qtdeFaces);
        model.addAttribute("qtdeDados", qtdeDados);

        model.addAttribute("resultadoDados", m_rolagemDados.getResultadoDados());
        model.addAttribute("somaRolagemDados", m_rolagemDados.getSomaRolagemDados());
        model.addAttribute("valorMaximoRolagemDados", m_rolagemDados.getValorMaximoRolagemDados());

        return "Home/home";
    }
}