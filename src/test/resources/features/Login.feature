#language:pt

  Funcionalidade: Teste login affthehype
    Cenario: Login com sucesso
      Dado que esteja na pagina inicial: "https://affthehype.com/"
      Quando preencher e-mail: "jamily1402@gmail.com" e senha: "Teste@1234"
      E clicar em fazer login
      Entao valido direcionamento para a pagina minha conta
