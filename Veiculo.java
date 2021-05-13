package trabalhoCarroPOO;

public class Veiculo implements VeiculoControlador{
	
	private String modelo;
	private String marca;
	private int anoFabricacao;
	private double valorMercado;
	private String placa;
	private String combustivel;
	
	//constructor
	public Veiculo(String modelo, String marca, int anoFabricacao, double valorMercado, String placa,
			String combustivel) {
		this.modelo = modelo;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.valorMercado = valorMercado;
		this.placa = placa;
		this.combustivel = combustivel;
	}

	//Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCombustivel() {
		return combustivel;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		if (2021 - (this.getAnoFabricacao()) < 20 && this.getCombustivel().equalsIgnoreCase("gasolina")) {
			imposto = this.getValorMercado() * 0.04;
			return imposto;
		} else if((2021 - this.getAnoFabricacao()) < 20 && this.getCombustivel().equalsIgnoreCase("diesel")) {
			imposto = this.getValorMercado() * 0.04;
			return imposto;
		} else if(2021 - (this.getAnoFabricacao()) < 20 && this.getCombustivel().equalsIgnoreCase("flex")) {
			imposto = this.getValorMercado() * 0.04;
			return imposto;
		} else if(2021 - (this.getAnoFabricacao()) < 20 && this.getCombustivel().equalsIgnoreCase("gnv")){
			imposto = this.getValorMercado() * 0.03;
			return imposto;
		}else if(2021 - (this.getAnoFabricacao()) < 20 && this.getCombustivel().equalsIgnoreCase("alcool")) {
			imposto = this.getValorMercado() * 0.03;
			return imposto;
		}else {
			return 0;
		}
	}

	@Override
	public String imprimir() {
		return "Veiculo [modelo=" + modelo + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", valorMercado="
				+ valorMercado + ", placa=" + placa + ", combustivel=" + combustivel + "]";
	}
	
}
