package trabalhoCarroPOO;

import java.util.ArrayList;
import java.util.List;

public class GerenciarVeiculos implements GerenciarVeiculosControlador{
	
	private List<Veiculo> automotores = new ArrayList<>();

	@Override
	public void adicionar(Veiculo a) {
		automotores.add(a);
	}

	@Override
	public boolean remover(String placa) {
		for(Veiculo v : automotores) {
			if(v.getPlaca().equalsIgnoreCase(placa)) {
				automotores.remove(v);
				return true;
			}
		}
		return false;
	}

	@Override
	public Veiculo buscarPorPlaca(String placa) {
		for(Veiculo v : automotores) {
			if(v.getPlaca().equalsIgnoreCase(placa)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public String listarVeiculos() {
		String listar = "";
		for(Veiculo v : automotores) {
			listar = listar + v.imprimir().toString();
		}
		return listar;
	}

	@Override
	public double obterValorImposto(String placa) {
		for(Veiculo v : automotores) {
			if(v.getPlaca().equalsIgnoreCase(placa)) {
				double imposto = v.calcularImposto();
				return imposto;
			}
		}
		return -1;
	}

	@Override
	public String listarVeiculoPorCombustivel(String combustivel) {
		String x = "";
		for (Veiculo v : automotores) {
			if (v.getCombustivel().equalsIgnoreCase(combustivel)) {
				x += v.imprimir().toString();
			}
		}
		if (x == "")
			return "Veículo não encontrado.";
		else
			return x;
	
	}

}
