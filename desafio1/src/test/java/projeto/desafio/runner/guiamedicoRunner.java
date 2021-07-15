package projeto.desafio.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/guiamedico.feature", 
				 glue = {"projeto.desafio.steps" }, 
				 tags = "@cidadeRJ or @semcidadeSP",
				 monochrome = true)
public class guiamedicoRunner {

}
