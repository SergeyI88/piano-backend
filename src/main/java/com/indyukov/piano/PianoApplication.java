package com.indyukov.piano;

import com.indyukov.piano.http.requests.GetPageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PianoApplication implements CommandLineRunner {
	@Autowired
	GetPageImpl getPage;

	public static void main(String[] args) {
		SpringApplication.run(PianoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getPage.get("spring", 1);
	}
}
