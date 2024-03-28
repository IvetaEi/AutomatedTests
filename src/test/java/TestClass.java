import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class TestClass {
//    ChromeDriver _globalDriver;
//    String _email;
//    String _name;
//    @BeforeClass
//    public void SetUpUserDetails(){
//        _email = generateRandomEmail();
//        _name = generateRandomName();
//    }
//
//    @BeforeTest
//    public void

//    @Test // anotacija, kuri leidžia javai suprasti, kad tai yra testas ir jį reikia paleisti.
//    public void test1(){//jei atidaro teisingai pakūrėme projektą
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.skelbiu.lt");//reikia https
//    }
//    @Test //leisti po viena
//    public void test2(){//jei atidaro teisingai pakūrėme projektą
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.skelbiu.lt");
//
//        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]")); //čia pilnas xphath. parodyti kaip išsitraukti pilną ir dalinį. (//*[@id="onetrust-accept-btn-handler"]) papasakoti kuo skirias. Dalinis xpath eina nuo artimiausio tėvinio unikalaus švyturio, pilnas nuo HTML pradžios.
//        cookieButton.click();
//        driver.findElement(By.xpath("//*[@id=\"searchKeyword\"]")).sendKeys("traktorius");// operacija nekuriant kintamojo.
//        driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
//    }
//
//
//    @Test //leisti po viena
//    public void test3(){//jei atidaro teisingai pakūrėme projektą
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.skelbiu.lt");
//
//        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//        driver.findElement(By.id("searchKeyword")).sendKeys("traktorius");// operacija nekuriant kintamojo.
//        // //*[@id="searchKeyword"]  paltginti dalinio xpath struktūrą su id. iš xpath matosi, kad elementas turi savo id.
//        // papasakoti kad galima selectinti pagal id, unikalu, pagal klase, (jei vienas elementas ok, jei keli su ta klase paims pirmą. arba su findelements galima paimti visus su x klase, bet tai vėliau.)
//        driver.findElement(By.id("searchButton")).click();
//
//    }
    public static boolean assertEquals(String actual, String expected) {
    return actual.equals(expected);
    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }
    public String generateRandomName(){
    String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

    Random random = new Random();

    StringBuilder name = new StringBuilder();

    // Generate username part
    int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
        String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
        char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
        name.append(randomChar);
    }
        return name.toString();
}


    @Test //leisti po viena
    public void test1(){//jei atidaro teisingai pakūrėme projektą
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1/b"));
        Assert.assertEquals(resultText.getText(),"Jūs sėkmingai prisiregistravote!");
    }

    @Test //leisti po viena
    public void test2(){//jei atidaro teisingai pakūrėme projektą
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Įveskite vartotojo vardą.");
    }

    @Test //leisti po viena
    public void test3(){//jei atidaro teisingai pakūrėme projektą
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName()+"@!");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Specialiųjų simbolių varde negali būti.");
    }




}

