package Domain;

import java.util.*;

public class funcoesSistemaDomain {
    Scanner entrada = new Scanner(System.in);
    produtosInfosDomain produtosInfos = new produtosInfosDomain();
    Set<produtosInfosDomain> produtosCadastrados = new TreeSet<>();
    Map<Integer, produtosInfosDomain> produtosCadastradosPorId = new HashMap<>();
    private static userInfosDomain userInfosFuncoes;
    String respUserContinuarouNao;

    public funcoesSistemaDomain(userInfosDomain userInfos) {
        userInfosFuncoes = userInfos;
    }

    public void limpaTela() {
        for (int i = 0; i < 70; i++) {
            System.out.println();
        }
    }

    public void menuOpcoes() {

        System.out.println("-------------------------------");
        System.out.println(userInfosFuncoes.getNomeEstabelecimento().toUpperCase());
        System.out.println("Usuario logado: " + userInfosFuncoes.getNomeUser());
        System.out.println("-------------------------------");
        System.out.println("1. Cadastrar produtos: ");
        System.out.println("2. Excluir produtos: ");
        System.out.println("3. Modificar estoque: ");
        System.out.println("4. Listar produtos: ");
        System.out.println("5. Sair.");
        userInfosFuncoes.setRespUserMenu(entrada.nextInt());
        entrada.nextLine();
        switchOpcoes();
    }

    public void cadastrarProdutos() {
        System.out.println("Digite o nome do produto que deseja cadastrar: ");
        produtosInfos.setNome(entrada.nextLine());
        produtosInfos.setId(produtosCadastrados.size());
        System.out.println("Digite o preço do produto: ");
        produtosInfos.setPreco(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Quantidade em estoque: ");
        produtosInfos.setQuantidade(entrada.nextInt());
        entrada.nextLine();
        produtosInfosDomain cadastroProduto = new produtosInfosDomain(produtosInfos.getNome(), produtosInfos.getId(), produtosInfos.getPreco(), produtosInfos.getQuantidade());
        produtosCadastradosPorId.put(produtosInfos.getId(), cadastroProduto);
        produtosCadastrados.add(cadastroProduto);
    }

    public void excluirProdutos() {
        if (produtosCadastrados.isEmpty()) {
            System.out.println("A lista ainda não tem nenhum produto.");
            return;
        }
        for (produtosInfosDomain produto : produtosCadastrados) {
            System.out.println("Id: " + produto.getId() + " Nome: " + produto.getNome());
        }
        System.out.println("Digite o id do produto que deseja excluir: ");
        userInfosFuncoes.setRespUser(entrada.nextInt());
        entrada.nextLine();
        produtosInfosDomain produto = produtosCadastradosPorId.remove(userInfosFuncoes.getRespUser());
        boolean removed = produtosCadastrados.remove(produto);
        System.out.println("Produto excluido: " + removed);
    }

    public void modificarEstoque() {
        if (produtosCadastrados.isEmpty()) {
            System.out.println("Ainda não existe nenhum produto.");
            return;
        }
        for (produtosInfosDomain produto : produtosCadastrados) {
            System.out.println("Id: " + produto.getId() + " Nome: " + produto.getNome() + " Estoque: " + produto.getQuantidade());
        }
        System.out.println("Digite o id do produto que deseja modificar: ");
        userInfosFuncoes.setRespUser(entrada.nextInt());
        entrada.nextLine();
        System.out.println("1. aumentar:");
        System.out.println("2. diminuir:");
        Integer respUserInteger = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o valor: ");
        int valorModificacao = entrada.nextInt();
        entrada.nextLine();
        if (respUserInteger.equals(1) && valorModificacao < 0) {
            System.out.println("Valor inválido.");
            return;
        }
        if (respUserInteger.equals(2) && valorModificacao < 0) {
            valorModificacao = valorModificacao * -1;
            if (valorModificacao > produtosCadastradosPorId.get(userInfosFuncoes.getRespUser()).getQuantidade()) {
                return;
            }
        }
        int qtdProdutos = produtosCadastradosPorId.get(userInfosFuncoes.getRespUser()).getQuantidade();
        switch (respUserInteger) {
            case 1:
                produtosCadastradosPorId.get(userInfosFuncoes.getRespUser()).setQuantidade(qtdProdutos + valorModificacao);
                System.out.println("Estoque alterado!");
                break;

            case 2:
                produtosCadastradosPorId.get(userInfosFuncoes.getRespUser()).setQuantidade(qtdProdutos - valorModificacao);
                System.out.println("Estoque alterado!");
                break;

            default:
                System.out.println("Valor inválido!");
        }
    }

    public void listarProdutos() {
        if (produtosCadastrados.isEmpty()) {
            System.out.println("A lista ainda está vazia.");
            return;
        }
        for (produtosInfosDomain produto : produtosCadastrados) {
            System.out.println("Id: " + produto.getId() + " Nome: " + produto.getNome() + " Estoque: " + produto.getQuantidade() + " Preço: " + produto.getPreco());
        }
    }

    public void switchOpcoes() {
        switch (userInfosFuncoes.getRespUserMenu()) {
            case 1:
                do {
                    cadastrarProdutos();
                    System.out.println("Deseja continuar cadastrando? (S/N)");
                    respUserContinuarouNao = entrada.nextLine();
                    if (!tratamentoRespUserDomain.tratamentoSimOuNao(respUserContinuarouNao)) {
                        limpaTela();
                        break;
                    }
                } while (respUserContinuarouNao.equalsIgnoreCase("s"));
                break;

            case 2:
                do {
                    excluirProdutos();
                    System.out.println("Deseja continuar excluindo? (S/N)");
                    respUserContinuarouNao = entrada.nextLine();
                    if (!tratamentoRespUserDomain.tratamentoSimOuNao(respUserContinuarouNao)) {
                        limpaTela();
                        break;
                    }
                } while (respUserContinuarouNao.equalsIgnoreCase("s"));
                break;

            case 3:
                do {
                    modificarEstoque();
                    System.out.println("Deseja continuar modificando? (S/N)");
                    respUserContinuarouNao = entrada.nextLine();
                    if (!tratamentoRespUserDomain.tratamentoSimOuNao(respUserContinuarouNao)) {
                        limpaTela();
                        break;
                    }
                } while (respUserContinuarouNao.equalsIgnoreCase("s"));
                break;

            case 4:
                listarProdutos();
                break;

            case 5:
                System.out.println("Saindo...");
                return;

            default:
                System.out.println("Valor inválido!");
        }
        menuOpcoes();
    }
}
