package com.brokemon;

import com.brokemon.pokemon.Pokemon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrokeMonApplication {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("pikachu",13 , 120, 0);
		System.out.println(pikachu.name);
		System.out.println(pikachu.age);
		System.out.println(pikachu.iq);
		pikachu.hunger++;
		System.out.println(pikachu.hunger);
	//	SpringApplication.run(BrokeMonApplication.class, args);
	}

}
