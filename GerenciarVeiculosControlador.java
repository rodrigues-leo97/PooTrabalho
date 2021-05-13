package trabalhoCarroPOO;

public interface GerenciarVeiculosControlador {

	public void adicionar(Veiculo a);
	
	public boolean remover(String placa);
	
	public Veiculo buscarPorPlaca(String placa);
	
	public String listarVeiculos();
	
	public double obterValorImposto(String placa);
	
	public String listarVeiculoPorCombustivel(String combustivel);
	
}
