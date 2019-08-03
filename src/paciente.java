
public class paciente {
	
	
	//Atributos da classe paciente (caracteristicas)
	double peso;
	double altura;
	double IMC;
	
	
	//construtor da classe paciente
	public paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	
	//Metodos (acoes)
	public double calcularImc() {
		
		return  peso/(altura*altura);
	}
	
	public String diagnostico() {
		
		double valorImc;
		valorImc = this.calcularImc();
		
		System.out.println("IMC = " + String.format("%.2f", valorImc));
		
		if(valorImc < 16) {
			return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}
		else if (valorImc < 17){
			return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}
		else if (valorImc < 18.50) {
			return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}
		else if (valorImc < 25.00) {
			return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}
		else if (valorImc < 30.00) {
			return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}
		else if (valorImc < 35.00) {
			return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}
		else if (valorImc < 40.00) {
			return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}
		else {
			return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		
	}
	
	public double getPeso() {
		return peso;
	}


	public double getAltura() {
		return altura;
	}


	public double getIMC() {
		return IMC;
	}


}
