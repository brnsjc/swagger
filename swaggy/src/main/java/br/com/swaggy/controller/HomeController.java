package br.com.swaggy.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class HomeController {

	org.slf4j.Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping(value = "/home")
	public String home() {
		logger.info("Home Bruno Control");
		
		final Flux<String> brands = Flux
				.just("Under Armour", "Asics", "Nike", "Adidas", "Mizuno");
		
		brands.sort().subscribe(System.out::println);
		
		return "Home";
	}
}
