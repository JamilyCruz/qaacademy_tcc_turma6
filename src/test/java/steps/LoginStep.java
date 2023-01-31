package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial(String url) {
    }

    @Quando("preencher e-mail: {string} e senha: {string}")
    public void preencherEMailESenha(String email, String senha) {
    }

    @E("clicar em fazer login")
    public void clicarEmFazerLogin() {
    }

    @Entao("valido direcionamento para a pagina minha conta")
    public void validoDirecionamentoParaAPaginaMinhaConta() {
    }
}
