
public class Ficha1 {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.out.println("==========================================================");
		
		// alinea 7 - perimetro retangulo
		System.out.println("Perímetro do Retângulo: " + retPerimetro(2,4));
		
		System.out.println("==========================================================");
		
		// alinea 8 - volume paralelepípedo
		System.out.println("Volume do Paralelepípedo: " + paraVolume(50,20,15));
		
		System.out.println("==========================================================");
		
		// alinea 9 - fahrenheit para graus centígrados
		System.out.println("Fahrenheit para Celsius: " + fahrenToCelsius(60));
		
		System.out.println("==========================================================");
		
		// alinea 10 - segundos em hora, minuto e segundo
		time(2, 30, 0);
		
		System.out.println("==========================================================");
		
		// alinea 11 - max, min e media
		int[] array = {33, 24, 9, 10, 12};
		
		// max
		System.out.println("Máximo: " + maxii(array));
		
		// min
		System.out.println("Mínimo: " + minii(array));
		
		// media
		System.out.println("Média: " + media(array));
	}
	
	public static float retPerimetro(float base, float altura) {
		
		float perimetro = (base*2) + (altura*2);
		
		return perimetro;
	}
	
	public static float paraVolume(float comp, float altura, float largura) {
		
		float volume = comp * largura * altura;
		
		return volume;
	}
	
	public static float fahrenToCelsius(float fahrenheit) {
		
		float celsius = (fahrenheit - 32) * (5/9);
		
		return celsius;
	}
	
	public static void time(int hours, int minutes, int seconds) {
		
		//int seconds = (value * 60) * 60;
		
		int hour = hours * 3600;
		
		System.out.println("Segundos em Horas: " + hour);
		
		int minute = minutes * 60;
		
		System.out.println("Segundos em Minutos: " + minute);
		
		System.out.println("Segundos: " + seconds);
		
		System.out.println("Segundos total: " + (hour + minute + seconds));
	}
	
	public static int maxii(int[] numbers) {
		int maxi = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > maxi) {
				maxi = numbers[i];
			}
		}
		
		return maxi;
	}
	
	public static int minii(int[] numbers) {
		int mini = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < mini) {
				mini = numbers[i];
			}
		}
		
		return mini;
	}
	
	public static float media(int[] numbers) {
		float sum= 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		float mediaa = sum/numbers.length;
		
		return mediaa;
	}
}
