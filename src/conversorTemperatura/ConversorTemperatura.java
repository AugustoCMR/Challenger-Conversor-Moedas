package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConverteCelsiusParaFahrenheit(double valorRecebido) {
		double celsiusParaFahrenheit = valorRecebido * 1.8 + 32;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é de " + celsiusParaFahrenheit + " Graus Fahrenheit");
	}
	
	public void ConverteCelsiusParaKelvin(double valorRecebido) {
		double celsiusParaFahrenheit = valorRecebido + 273.15;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é de " + celsiusParaFahrenheit + " Graus Kelvin");
	}
	
	public void ConverteFahrenheitParaCelsius(double valorRecebido) {
		double celsiusParaFahrenheit = (valorRecebido - 32) / 1.8;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é de " + celsiusParaFahrenheit + " Graus Celsius");
	}
	
	public void ConverteFahrenheitParaKelvin(double valorRecebido) {
		double celsiusParaFahrenheit = (valorRecebido - 32) * 5 / 9 + 273.15;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é de " + celsiusParaFahrenheit + " Graus Kelvin");
	}
	
	public void ConverteKelvinParaFahrenheit(double valorRecebido) {
		double celsiusParaFahrenheit = (valorRecebido - 273.15) * 9 / 5 + 32;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é de " + celsiusParaFahrenheit + " Graus Fahrenheit");
	}
	
	public void ConverteKelvinParaCelsius(double valorRecebido) {
		double celsiusParaFahrenheit = valorRecebido - 273.15;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é de " + celsiusParaFahrenheit + " Graus Celsius");
	}
	
	
}
