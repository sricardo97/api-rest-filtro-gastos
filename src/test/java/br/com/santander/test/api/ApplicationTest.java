package br.com.santander.test.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.santander.api.Application;
import br.com.santander.api.services.GastoService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
	@Autowired
	private GastoService gastoService;

	@Test
	public void listagemGasto() {
		System.out.println(this.gastoService.findByData("20/04/2017"));
	}
}