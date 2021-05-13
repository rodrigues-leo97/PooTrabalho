package trabalhoCarroPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GerenciarVeiculos v1 = new GerenciarVeiculos();
		int resposta = 0;
		while(resposta < 7) {
		
		System.out.println();
		System.out.println("     ----- MENU DE OP��ES -----");
		System.out.println();
		System.out.println("Digite a seguir qual a��o deseja realizar:");
		System.out.println("Lembrando que � de suma import�ncia a correta digita��o");
		System.out.println("Digite o APENAS o n�mero da op��o desejada");
		System.out.println("1 - Deseja adicionar um ve�culo ?");
		System.out.println("2 - Deseja remover um ve�culo ?");
		System.out.println("3 - Deseja encontrar um ve�culo pela placa ?");
		System.out.println("4 - Deseja listar todos os ve�culos ?");
		System.out.println("5 - Deseja calcular o valor do imposto do ve�culo ?");
		System.out.println("6 - Deseja listar ve�culos pelo tipo de combust�vel ?");
		System.out.println("7 - Deseja sair da aplica��o ?");
		
		resposta = sc.nextInt();
		
		switch(resposta) {
			case 1: 
				//estou realizando as perguntas na ordem em que os atributos da classe Veiculo foram criados
				//nomes iguais aos da classe Veiculo
				System.out.println("Qual o modelo do ve�culo a ser cadastrado ?");
				String modelo = sc.next(); 
				
				System.out.println("Qual a marca do ve�culo ?");
				String marca = sc.next();
				
				System.out.println("Em qual ano o ve�culo foi fabricado ?");
				int anoFabricacao = sc.nextInt();
				
				System.out.println("Qual o valor de mercado do ve�culo ?");
				int valorMercado = sc.nextInt();
				
				System.out.println("Qual a placa do ve�culo ?");
				String placa = sc.next();
				
				System.out.println("Qual o tipo de combust�vel usado ?");
				String combustivel = sc.next();
				
				//instaciei um novo objeto chamado veiculo
				//para isso usei a fun��o adicionar que criei na classe GerenciarVeiculo
				//Os parametros passados dentro do new Veiculo foram definidos no construtor da classe Veiculo
				v1.adicionar(new Veiculo(modelo, marca, anoFabricacao, valorMercado, placa, combustivel));
				
				break;
				
			case 2: 
				System.out.println("Informe a placa do ve�culo que deseja remover de nossa lista ?");
				placa = sc.next();
				
				boolean remove = v1.remover(placa);
				System.out.println(remove);
				break;
				
			case 3:
				System.out.println("Qual a placa do ve�culo que deseja encontrar ?");
				placa = sc.next();
				Veiculo veiculo = v1.buscarPorPlaca(placa);
				if (!(veiculo == null)) {
					System.out.println(veiculo.imprimir()); //ir� trazer os dados do ve�culo atrav�s da fun��o imprimir da classe Ve�culo 
				}else {
				System.out.println("Ve�culo inexistente no banco de dados");
				}
				break;
				
			case 4:
				System.out.println(v1.listarVeiculos());
				break;
				
			case 5:
				System.out.println("Qual a placa do ve�culo que deseja calcular o imposto ?");
				placa = sc.next();
				
				System.out.println("Calculo de imposto: " + v1.obterValorImposto(placa));
				break;
				
			case 6:
				System.out.println("Por qual tipo de combust�vel deseja listar os ve�culos ?");
				combustivel = sc.next();
				
				System.out.println(v1.listarVeiculoPorCombustivel(combustivel));
				break;
				
			case 7:
				System.out.println("Obrigado pela visita, volte sempre!! Se beber n�o dirija.");
				break;
				
			default:
				System.out.println("Digite n�meros entre 1 � 7, tente novamente!!");
				break;
		}
		
		}
	}

}
