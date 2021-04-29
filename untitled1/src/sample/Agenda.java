package sample;

public class Agenda {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Contato contato;
        contato = new Contato();
        String nomenclatura[] = new String[14];
        int i;
        for (i = 0; i < 2; i++) {
            cont(nomenclatura);
        }
        if (i >= 2) {
            System.out.println("Deseja adicionar outro contato? S/N: ");
            char agenda = Keyboard.readChar();
            switch (agenda) {
                case 's':
                    cont(nomenclatura);
                    break;
                case 'n':
                    System.out.println();
                    break;
                default:
                    System.out.println("Voce digitou errado");
                    break;
            }// fim switch
        }// fim if
        System.out.println("O que voce deseja fazer: ");
        System.out.println("1 - Incluir Contato");
        System.out.println("2 - Pesquisar Contato");
        System.out.println("3 - Sair");
        System.out.printf("Opcao desejada: ");
        char opcao = Keyboard.readChar();
        switch (opcao) {
            case '1':
                cont(nomenclatura);
                break;
            case '2':
                System.out.println("Pesquisar por:");
                System.out.println("1 - Nome");
                System.out.println("2 - Sobrenome");
                System.out.println("3 - Cidade");
                System.out.println("4 - Telefone celular");
                System.out.println("5 - Telefone residencial");
                System.out.println("6 - Telefone de trabalho");
                System.out.printf("Opcao desejada: ");
                String pesq = Keyboard.readString();
                switch (pesq) {
                    case "1":
                        System.out.printf("Digite o nome: ");
                        String nome = Keyboard.readString();
                        if (nome.equals(nomenclatura[0])){
                            System.out.println(nome);
                        }
                        break;
                }// fim switch
                break;
            case '3':
                System.out.println("Voce encerrou o programa!");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        System.out.println(nomenclatura);

    }// fim main
}
