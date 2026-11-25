package clearmid.paquetes;

public class CuentaTest {

	public static void main(String[] args) {
		

		   

		       
		        Cuenta cuenta1 = new Cuenta("03476");
		        cuenta1.setSaldo(675);

		        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		        Cuenta cuenta3 = new Cuenta("03476");
		        cuenta3.setTipo("C");

		       
		        System.out.println("--------- Valores Iniciales ---------");
		        cuenta1.imprimir();
		        cuenta2.imprimir();
		        cuenta3.imprimir();

		       
		        Cuenta cuenta4 = new Cuenta("12345", "A", 1500);
		        Cuenta cuenta5 = new Cuenta("67890", "B", 250);
		        Cuenta cuenta6 = new Cuenta("11111");

		        System.out.println("--------- Cuentas adicionales ---------");
		        cuenta4.imprimirConMiEstilo();
		        cuenta5.imprimirConMiEstilo();
		        cuenta6.imprimirConMiEstilo();
		    }
		


	}


