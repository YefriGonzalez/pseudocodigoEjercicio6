import java.util.*;
public class Ejercicio6{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int edad;
		int numeroDePersonasMayoresDe25=0;
		int numeroDePersonasMenoresDe25=0;
		int totalEdadesMenoresDe25=0;
		int totalEdadesMayoresDe25=0;
		int promedioEdadesMayoresDe25;
		int promedioEdadesMenoresDe25;
		for(int i=0;i<100;i++){
			System.out.print("Ingrese la edad: ");
			edad=scanner.nextInt();
			if (edad>=25) {
				numeroDePersonasMayoresDe25=numeroDePersonasMayoresDe25+1;
				totalEdadesMayoresDe25=totalEdadesMayoresDe25+edad;
			} else if(edad<25){
				numeroDePersonasMenoresDe25=numeroDePersonasMenoresDe25+1;
				totalEdadesMenoresDe25=totalEdadesMenoresDe25+edad;
			}
		}
		promedioEdadesMayoresDe25=totalEdadesMayoresDe25/numeroDePersonasMayoresDe25;
		promedioEdadesMenoresDe25=totalEdadesMenoresDe25/numeroDePersonasMenoresDe25;
		System.out.println("El promedio de edad de personas menores de 25 años es: "+promedioEdadesMenoresDe25);
		System.out.println("El promedio de edad de personas mayores o igual a 25 es: "+promedioEdadesMayoresDe25);
	}

}