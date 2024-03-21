#language: pt
@tag
Funcionalidade: cadastro e exclusao de conta no site advantage
  @tag1
  Cenario: cadastro e exclusao de conta
    Dado que esteja no site "https://www.advantageonlineshopping.com/#/"
    Quando eu clicar no icone de logar
    E clica para criar nova conta
    E preencer dados obrigatorios
    E clichar no check box de politicas
    E criar conta
    E clicar para acessar minha conta
    E clicar para deletar a conta
    Entao a conta sera deletada com sucesso

 