#language : pt


@tag
  Funcionalidade: testar funcionalidade do login

  @tag1
  Cenário: logar com sucesso no site advantage
    Dado que esteja no site "https://www.advantageonlineshopping.com/#/"
   	Quando eu clicar no icone de logar
    E preeencher usuario e senha validos
    E clicar no botao logar
    Entao devo logar com sucesso
    