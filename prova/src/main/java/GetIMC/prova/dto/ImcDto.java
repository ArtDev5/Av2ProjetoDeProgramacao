package GetIMC.prova.dto;

public class ImcDto {
	
	private double peso;
	private double altura;
	private String resultado;
	private double imc;
	
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public ImcDto(double peso, double altura) {
		this.imc = peso / (altura * altura);
		
	}

	public String getResultado() {
		if(imc < 18.5) {
			this.resultado = "Peso: "+imc+". Classificação: Abaixo do peso. Risco para sua Saúde: Elevado.";
		}else if(imc >= 18.50 && imc < 25.50) {
			this.resultado = "Peso: "+imc+". Classificação: Peso ideal. Risco para sua Saúde: Inexistente.";
		}else if(imc >= 25.00 && imc < 30.00) {
			this.resultado = "Peso: "+imc+". Classificação: Excesso de Peso. Risco para sua Saúde: Elevado.";
		}else if(imc >= 30.00 && imc < 35.00) {
			this.resultado = "Peso: "+imc+". Classificação: Obesidade Grau 1. Risco para sua Saúde: Muito Elevado.";
		}else if(imc >= 35.00 && imc < 40.00) {
			this.resultado = "Peso: "+imc+". Classificação: Obseidade Grau 2. Risco para sua Saúde: Muitíssimo Elevado.";
		}else if(imc >= 40) {
			this.resultado = "Peso: "+imc+". Classificação: Obesidade Grau 3. Risco para sua Saúde: Obesidade Mórbida.";
		}
		return resultado;
	}

	
}
