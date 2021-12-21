package com.nttdata.circuitbreaker;

import com.nttdata.circuitbreaker.Services.Circuit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircuitbreakerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Circuit closed = new Circuit(0, 1, 0, 1, 1);
		Circuit halfOpen = new Circuit(1, 1, 10, 1, 5);
		Circuit open = new Circuit(1, 1, 1, 1, 1);

		System.out.println(closed.getState());
		System.out.println(halfOpen.getState());
		System.out.println(open.getState());
	}
}
