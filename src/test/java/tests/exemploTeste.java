package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exemploTeste {
    @Test

    public void testAcessandoSite() {

        //abre o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        browser.get("https://www.correios.com.br/");

        //navbar page -- header
        browser.findElement(By.linkText("Enviar")).click();
        browser.findElement(By.linkText("Receber")).click();
        browser.findElement(By.linkText("Logística")).click();
        browser.findElement(By.linkText("Atendimento")).click();
        browser.findElement(By.linkText("Acesso à Informação")).click();

        //Botão "Busca"
        browser.findElement(By.className("busca-txt")).click();
        browser.findElement(By.id("searchGadget")).sendKeys("Encomendas");
        browser.findElement(By.className("searchButton")).click();

        //Scroll de Tela
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

        //Botão "Meu Correios"
        browser.findElement(By.linkText("Acesso à Informação")).click();
        browser.findElement(By.linkText("Meu Correios")).click();

        //Campos "Usuário" e "Senha" -- Apenas cliques
        browser.findElement(By.id("username")).click();
        browser.findElement(By.id("password")).click();

        //Botão "Esqueci minha senha"
        browser.findElement(By.xpath("//a[@href='https://meucorreios.correios.com.br/app/cadastro/esqueci-senha/index.php']")).click();
        browser.findElement(By.linkText("Pessoa física")).click();
        browser.findElement(By.className("voltar")).click();
        browser.findElement(By.linkText("Pessoa jurídica")).click();
        browser.findElement(By.className("voltar")).click();
        browser.findElement(By.id("b-voltar")).click();

        //Botão "Cadastrar"
        browser.findElement(By.xpath("//a[@href='https://meucorreios.correios.com.br/app/fazer-cadastro.php']")).click();

        //Bem-vindo ao Meu Correios!
        browser.findElement(By.xpath("//div[2]/div/label/input")).click();
        browser.findElement(By.xpath("//div[3]/div/label/input")).click();
        browser.findElement(By.xpath("//div[4]/div/label/input")).click();
        browser.findElement(By.xpath("//div[3]/div/label/input")).click();
        browser.findElement(By.xpath("//div[2]/div/label/input")).click();
        browser.findElement(By.name("perfil")).click();
        browser.findElement(By.id("b-prosseguir")).click();

        //Cadastre-se
        browser.findElement(By.id("cpf")).sendKeys("123.456.700-89");
        browser.findElement(By.id("nome")).click();
        browser.findElement(By.id("nome")).sendKeys("João Da Silva");
        browser.findElement(By.name("sexo")).click();
        browser.findElement(By.xpath("//div[@id='c-sexo']/div[2]/label[2]/input")).click();
        browser.findElement(By.id("dn-dia")).click();
        browser.findElement(By.id("dn-dia")).sendKeys("10");
        browser.findElement(By.id("dn-mes")).click();
        new Select(browser.findElement(By.id("dn-mes"))).selectByVisibleText("Junho");
        browser.findElement(By.id("dn-ano")).click();
        browser.findElement(By.id("dn-ano")).sendKeys("2000");
        browser.findElement(By.id("celular")).click();
        browser.findElement(By.id("celular")).sendKeys("11940028922");
        browser.findElement(By.id("email")).click();
        browser.findElement(By.id("email")).sendKeys("teste@teste.com");
        browser.findElement(By.id("senha")).click();
        browser.findElement(By.id("senha")).sendKeys("abcdefg");
        browser.findElement(By.id("privacidade")).click();
        browser.findElement(By.id("servico")).click();
        //browser.findElement(By.id("propaganda")).click();
        browser.findElement(By.id("b-salvar")).click();

        //Scroll de Tela
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

        //Botão Entrar
        browser.findElement(By.xpath("//a[@href='https://meucorreios.correios.com.br/core/seguranca/entrar.php']")).click();

        //Problemas ao acessar
        browser.get("https://cas.correios.com.br/login?service=https%3A%2F%2Fmeucorreios.correios.com.br%2Fcore%2Fseguranca%2Fservice.php");
        browser.findElement(By.xpath("//section[@id='menu']/a")).click();
        browser.findElement(By.linkText("Problemas para acessar o Meu Correios?")).click();

        //Central coronavirus
        browser.findElement(By.xpath("//a[@href='http://www.correios.com.br/coronavirus']")).click();
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);


        assertEquals(1, 1);
    }
}
