class No {
    String url;
    No anterior;
    No proximo;

    public No(String url) {
        this.url = url;
        this.anterior = null;
        this.proximo = null;
    }
}

public class NavegadorLista {
    private No paginaAtual;

    public NavegadorLista() {
        this.paginaAtual = null;
    }

    // Visita uma nova página
    public void visitarPagina(String url) {
        No novaPagina = new No(url);

        if (paginaAtual != null) {
            paginaAtual.proximo = novaPagina;
            novaPagina.anterior = paginaAtual;
        }
        paginaAtual = novaPagina; // Atualiza a página atual
        exibirEstado();
    }

    // Voltar para a página anterior
    public void voltar() {
        if (paginaAtual != null && paginaAtual.anterior != null) {
            paginaAtual = paginaAtual.anterior;
        } else {
            System.out.println("Não há páginas para voltar.");
        }
        exibirEstado();
    }

    // Avançar para a próxima página
    public void avancar() {
        if (paginaAtual != null && paginaAtual.proximo != null) {
            paginaAtual = paginaAtual.proximo;
        } else {
            System.out.println("Não há páginas para avançar.");
        }
        exibirEstado();
    }

    // Exibir estado atual
    private void exibirEstado() {
        System.out.println("\nPágina atual: " + (paginaAtual != null ? paginaAtual.url : "Nenhuma"));

        // Exibir histórico anterior
        No temp = paginaAtual;
        System.out.print("Histórico para trás: ");
        while (temp != null && temp.anterior != null) {
            temp = temp.anterior;
            System.out.print(temp.url + " <- ");
        }
        System.out.println();

        // Exibir histórico pra frente
        temp = paginaAtual;
        System.out.print("Histórico para frente: ");
        while (temp != null && temp.proximo != null) {
            temp = temp.proximo;
            System.out.print("-> " + temp.url + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NavegadorLista navegador = new NavegadorLista();

        // Simulação de navegação
        navegador.visitarPagina("https://www.google.com");
        navegador.visitarPagina("https://www.mozilla.org");
        navegador.visitarPagina("https://www.github.com");

        navegador.voltar(); // Deve voltar para Mozilla
        navegador.voltar(); // Deve voltar para Google
        navegador.avancar(); // Deve avançar para Mozilla
        navegador.visitarPagina("https://www.stackoverflow.com"); // Deve limpar o histórico para frente
        navegador.voltar(); // Deve voltar para Mozilla
    }
}
