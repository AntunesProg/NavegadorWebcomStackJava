  Descrição do Projeto
Este projeto implementa a funcionalidade de navegação de um navegador da web, permitindo ao usuário visitar páginas, voltar para páginas anteriores e avançar para páginas seguintes.
   Estrutura do Código
Link para repositório do código: 
 Classe Nó (Nó da Lista Encadeada)
Cada nó representa uma página visitada.
String url → Armazena o endereço da página.
No anterior → Referência para a página anterior.
No proximo → Referência para a próxima página.
Classe NavegadorLista (Gerencia a Navegação)
Gerencia a navegação entre as páginas.
 Atributo
 No paginaAtual → Mantém a referência da página em que o usuário está no momento.


 Métodos
 public void visitarPagina(String url)
Adiciona uma nova página ao histórico de navegação.
Se o usuário voltou para uma página anterior e acessa uma nova página, o histórico de avanço é apagado.
 public void voltar( )
Retorna à página anterior, se existir.
Se paginaAtual.anterior for null, exibe uma mensagem de erro.
 public void avancar()
Avança para a próxima página, se houver uma no histórico.
Se paginaAtual.proximo for null, exibe uma mensagem de erro.
 private void exibirEstado()
Exibe a página atual e o histórico de páginas para trás e para frente.
