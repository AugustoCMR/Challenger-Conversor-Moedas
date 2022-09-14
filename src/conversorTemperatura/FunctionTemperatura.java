package conversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
	public void converteTemperatura(double ValorRecebido) {
		
		ConversorTemperatura temperatura = new ConversorTemperatura();
		
		String opcoes = JOptionPane.showInputDialog(null, "Escolha a temperatura que você deseja converter: ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celsius para Fahrenheit", "De Celsius para Kelvin", "De Fahrenheit para Celsius", "De Fahrenheit para Kelvin", "De Kelvin para Celsius", "De Kelvin para Fahrenheit"}, "Escolha").toString();
		
		switch (opcoes) {
		case "De Celsius para Fahrenheit":
			temperatura.ConverteCelsiusParaFahrenheit(ValorRecebido);
			break;

		case "De Celsius para Kelvin":
			temperatura.ConverteCelsiusParaKelvin(ValorRecebido);
			break;
		
		case "De Fahrenheit para Celsius":
			temperatura.ConverteFahrenheitParaCelsius(ValorRecebido);
			break;
			
		case "De Fahrenheit para Kelvin":
			temperatura.ConverteFahrenheitParaKelvin(ValorRecebido);
			break;
			
		case "De Kelvin para Celsius":
			temperatura.ConverteKelvinParaCelsius(ValorRecebido);
			break;
			
		case "De Kelvin para Fahrenheit":
			temperatura.ConverteKelvinParaFahrenheit(ValorRecebido);
			break;
		}
		
			
	}
}
