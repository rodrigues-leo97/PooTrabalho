package trabalhoCarroPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GerenciarVeiculos v1 = new GerenciarVeiculos();
		int resposta = 0;
		while(resposta < 7) {
		
		System.out.println();
		System.out.println("     ----- MENU DE OPÇÕES -----");
		System.out.println();
		System.out.println("Digite a seguir qual ação deseja realizar:");
		System.out.println("Lembrando que é de suma importância a correta digitação");
		System.out.println("Digite o APENAS o número da opção desejada");
		System.out.println("1 - Deseja adicionar um veículo ?");
		System.out.println("2 - Deseja remover um veículo ?");
		System.out.println("3 - Deseja encontrar um veículo pela placa ?");
		System.out.println("4 - Deseja listar todos os veículos ?");
		System.out.println("5 - Deseja calcular o valor do imposto do veículo ?");
		System.out.println("6 - Deseja listar veículos pelo tipo de combustível ?");
		System.out.println("7 - Deseja sair da aplicação ?");
		
		resposta = sc.nextInt();
		
		switch(resposta) {
			case 1: 
				//estou realizando as perguntas na ordem em que os atributos da classe Veiculo foram criados
				//nomes iguais aos da classe Veiculo
				System.out.println("Qual o modelo do veículo a ser cadastrado ?");
				String modelo = sc.next(); 
				
				System.out.println("Qual a marca do veículo ?");
				String marca = sc.next();
				
				System.out.println("Em qual ano o veículo foi fabricado ?");
				int anoFabricacao = sc.nextInt();
				
				System.out.println("Qual o valor de mercado do veículo ?");
				int valorMercado = sc.nextInt();
				
				System.out.println("Qual a placa do veículo ?");
				String placa = sc.next();
				
				System.out.println("Qual o tipo de combustível usado ?");
				String combustivel = sc.next();
				
				//instaciei um novo objeto chamado veiculo
				//para isso usei a função adicionar que criei na classe GerenciarVeiculo
				//Os parametros passados dentro do new Veiculo foram definidos no construtor da classe Veiculo
				v1.adicionar(new Veiculo(modelo, marca, anoFabricacao, valorMercado, placa, combustivel));
				
				break;
				
			case 2: 
				System.out.println("Informe a placa do veículo que deseja remover de nossa lista ?");
				placa = sc.next();
				
				boolean remove = v1.remover(placa);
				System.out.println(remove);
				break;
				
			case 3:
				System.out.println("Qual a placa do veículo que deseja encontrar ?");
				placa = sc.next();
				Veiculo veiculo = v1.buscarPorPlaca(placa);
				if (!(veiculo == null)) {
					System.out.println(veiculo.imprimir()); //irá trazer os dados do veículo através da função imprimir da classe Veículo 
				}else {
				System.out.println("Veículo inexistente no banco de dados");
				}
				break;
				
			case 4:
				System.out.println(v1.listarVeiculos());
				break;
				
			case 5:
				System.out.println("Qual a placa do veículo que deseja calcular o imposto ?");
				placa = sc.next();
				
				System.out.println("Calculo de imposto: " + v1.obterValorImposto(placa));
				break;
				
			case 6:
				System.out.println("Por qual tipo de combustível deseja listar os veículos ?");
				combustivel = sc.next();
				
				System.out.println(v1.listarVeiculoPorCombustivel(combustivel));
				break;
				
			case 7:
				System.out.println("Obrigado pela visita, volte sempre!! Se beber não dirija.");
				break;
				
			default:
				System.out.println("Digite números entre 1 á 7, tente novamente!!");
				break;
		}
		
		}
	}

}
