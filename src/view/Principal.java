package view;
import java.util.Random;
import controller.ThreadVetor;
public class Principal {

	public static void main(String[] args){
		Random random = new Random();
		
		int n=2, length;
		int vetor[] = new int[100000000];
		length = vetor.length;

		for (int i=0;i<length;i++){
			vetor[i] = random.nextInt(100);
		}
		Thread thread = new ThreadVetor(n, vetor);	
		thread.start();
		
	}
}
