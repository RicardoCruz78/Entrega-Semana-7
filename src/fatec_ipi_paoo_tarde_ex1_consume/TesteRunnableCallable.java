package fatec_ipi_paoo_tarde_ex1_consume;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TesteRunnableCallable {
	public static void main(String[] args) {
		
		// Ex 1
		new Thread (new Runnable() {
			@Override
			public void run() {
				System.out.println("Estou e uma nova thread: " + Thread.currentThread().getName());
			}
		}).start();
		System.out.println("Estou agora na thread principal: " + Thread.currentThread().getName());
		
		
		// Ex 2 faz a mesma coisa que exemplo 01
		new Thread (() -> {
			System.out.println("Agora estou em uma nova thread, usando lambda: " + Thread.currentThread().getName());
		}).start();
		
		// Ex 3
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		Callable <String> callableSemLambda = new Callable <String> () {

			@Override
			public String call() throws Exception {
				
				return "Callable, sem lambda";
			}
		}; 
		// pool executa para mim essa thread
		try {
			String futuro =  pool.submit(callableSemLambda).get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Ex 4 - Usando lambda
		try {
			// lambda
			System.out.println(pool.submit(() -> {return "Lambda gora";}).get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
