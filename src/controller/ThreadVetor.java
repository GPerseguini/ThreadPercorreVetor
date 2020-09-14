package controller;

public class ThreadVetor extends Thread {
	int n;
	int vetor[];
	double tempoInicial, tempoFinal, tempo;
	public ThreadVetor(int n, int[] vetor) {
		this.n = n;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		super.run();
		walk();
	}
	
	private void walk(){
		switch(n){
		case 1:
			double tempoInicial = System.nanoTime();
			for(int i=0;i<vetor.length;i++){
				
			}
			double tempoFinal = System.nanoTime();
			double tempo = tempoFinal - tempoInicial;
			tempo = tempo / Math.pow(10, 9);
			System.out.println("TID #"+getId() + " levou " + tempo + " segundos para chegar ao final.");
			break;
		case 2:
			tempoInicial = System.nanoTime();
			for (int numero : vetor){
			}
			
			tempoFinal = System.nanoTime();
			tempo = tempoFinal - tempoInicial;
			tempo = tempo / Math.pow(10, 9);
			System.out.println("TID #"+getId() + " levou " + tempo + " segundos para chegar ao final.");
			break;
		}
	}
	
}
