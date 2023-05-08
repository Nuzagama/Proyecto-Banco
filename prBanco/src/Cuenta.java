
public class Cuenta {
	
	int iban;
	double saldo;
	String estado;

	public void BancoDos (int iban, double saldo, String estado) {
		this.iban = iban;
		this.saldo = saldo;
		this.estado = estado;
		}
	
	public void setIban (int iban) {
		this.iban = iban;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public int getIban (int iban) {
		return iban;
	}
	
	public double getSaldo (double saldo) {
		return saldo;
	}
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	
	public String getEstado (String estado) {
		return estado;
	}
	
	public String toString() {
		return "Número de cuenta: " + iban + "Su saldo es: " + saldo + "El estado de la cuenta es: " + estado;
	}
	
}
