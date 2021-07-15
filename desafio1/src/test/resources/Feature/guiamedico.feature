#language: pt
Funcionalidade: Pesquisar Guia Médico no site da Unimed

  @cidadeRJ
  Cenario: Pesquisar médicos no Rio de Janeiro com especialidade Angiologia e cidade Rio de Janeiro
    Dado que estou no site da Unimed e consulte o Guia Médico
    Quando eu escrevo a cidade Rio de Janeiro
    E clico em pesquisar
    E vou em Ir para busca detalhada
    E escrevo a especialidade Angiologia
    E escrevo o estado Rio de Janeiro
    E clico em Pesquisar
    Entao eu tenho todos os medicos da especialidade Angiologia do Rio de Janeiro

  @semcidadeSP
  Cenario: Pesquisar médicos do Rio de Janeiro e que não contenha a cidade de São Paulo
    Dado que estou no site da Unimed e consulte o Guia Médico
    Quando eu escrevo a cidade Rio de Janeiro
    E clico em Pesquisar
    Entao não terei resultados dos médicos que contenha a cidade São Paulo
