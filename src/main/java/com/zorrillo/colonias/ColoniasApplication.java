package com.zorrillo.colonias;

import com.zorrillo.colonias.interfaces.InterfaceUser;
import com.zorrillo.colonias.interfaces.InterfaceFragance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class ColoniasApplication implements CommandLineRunner {
	@Autowired
    private InterfaceFragance interfaceFragance;
	@Autowired
    private InterfaceUser interfaceUser;


	public static void main(String[] args) {
		SpringApplication.run(ColoniasApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        interfaceFragance.deleteAll();
        interfaceUser.deleteAll();
    }

}
