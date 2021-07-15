package projeto.desafio.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class guiamedico1 {

	static WebDriver driver;

	@Dado("que estou no site da Unimed e consulte o Guia Médico")
	public void que_estou_no_site_da_Unimed_e_consulte_o_Guia_Médico() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.unimed.coop.br/site/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Consulte agora")).click();
	}

	@Quando("eu escrevo a cidade Rio de Janeiro")
	public void eu_escrevo_a_cidade_Rio_de_Janeiro() {

		driver.findElement(By.id("react-select-2-input")).sendKeys("Rio de Janeiro");

		// div/div/input[@id='react-select-2-input'] - xpath
	}

	@E("clico em pesquisar")
	public void clico_em_pesquisar() {

		driver.findElement(By.cssSelector("button.Button")).click();

	}

	@E("vou em Ir para busca detalhada")
	public void vou_em_Ir_para_busca_detalhada() {

		driver.findElement(By.className("GoToDetailedSearch--link")).click();

	}

	@E("escrevo a especialidade Angiologia")
	public void escrevo_a_especialidade_Angiologia() {

		driver.findElement(By.id("react-select-4-input")).sendKeys("Angiologia");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);

	}

	@E("escrevo o estado Rio de Janeiro")
	public void escrevo_o_estado_Rio_de_Janeiro() {

		driver.findElement(By.id("react-select-5-input")).sendKeys("Rio de Janeiro");
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);

	}

	@E("clico em Pesquisar")
	public void clico_em_Pesquisar() {

		driver.findElement(By.cssSelector("button.Button")).click();

	}

	@Entao("eu tenho todos os medicos da especialidade Angiologia do Rio de Janeiro")
	public void eu_tenho_todos_os_medicos_da_especialidade_Angiologia_do_Rio_de_Janeiro() {

		System.out.println("Informa todos os médicos de Angiologia no Rio de Janeiro");

	}

	@Entao("não terei resultados dos médicos que contenha a cidade São Paulo")
	public void não_terei_resultados_dos_médicos_que_contenha_a_cidade_São_Paulo() {

		System.out.println("Resultado sem a cidade de São Paulo");

	}

}
