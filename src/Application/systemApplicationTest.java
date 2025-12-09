package Application;

import Domain.funcoesSistemaDomain;
import Domain.produtosInfosDomain;
import Domain.userInfosDomain;

import java.util.Scanner;

public class systemApplicationTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        userInfosDomain userInfos = new userInfosDomain();
        funcoesSistemaDomain funcoesSistema = new funcoesSistemaDomain(userInfos);
        System.out.println("Digite seu nome: ");
        userInfos.setNomeUser(entrada.nextLine());
        System.out.println("Digite o nome do estabelecimento: ");
        userInfos.setNomeEstabelecimento(entrada.nextLine());
        funcoesSistema.menuOpcoes();
    }
}
