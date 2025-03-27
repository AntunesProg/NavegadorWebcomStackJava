A Mozilla Foundation precisa de uma implementação para os botões de "Voltar" e "Avançar" do navegador. Esses botões permitem que o usuário navegue entre páginas já visitadas, seguindo o comportamento clássico dos navegadores da web.

        Visão Geral do Programa
O programa implementa esse comportamento utilizando pilhas (Stack) para armazenar o histórico de navegação:

pilhaVoltar: Armazena as páginas visitadas para permitir a navegação para trás.

pilhaAvancar: Armazena as páginas "perdidas" ao voltar, possibilitando a navegação para frente.

paginaAtual: Representa a página em que o usuário está no momento.

     Principais funcionalidades do programa:
 visitarPagina(String url)

Adiciona a página atual à pilha de voltar (se existir).

Define a nova página como atual.

Limpa a pilha de avançar, pois um novo caminho está sendo criado.

 voltar()

Move a página atual para a pilha de avançar.

Retorna a última página armazenada na pilha de voltar.

Se não houver mais páginas para voltar, desativa essa funcionalidade.

 avancar()

Move a página atual para a pilha de voltar.

Retorna a última página armazenada na pilha de avançar.

Se não houver páginas para avançar, desativa essa funcionalidade.

 exibirEstado()

Exibe a página atual e o conteúdo das pilhas de navegação.


Dessa forma através da simulação percebe-se que o sistema de navegação funciona e tem suas funcionalidades em atividade, dessa forma o controle da navegação fica melhor.

