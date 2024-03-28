import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TestClass {
//    ChromeDriver _globalDriver;
//    @BeforeTest
//    public void setup void test(){
//        _globalDriver = new ChromeDriver();
//    }

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

    public static String generateRandomEmail9() {
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
        email.append(" @");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    public static String generateRandomEmail7() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    public static String generateRandomEmail6() {
        String[] domains = {"gmail", "yahoo", "hotmail", "outlook", "example"};
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

    public static String generateRandomEmail5() {
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


    @Test //leisti po viena //Registravimasis teisingais duomenimis
    public void test1(){//jei atidaro teisingai pakūrėme projektą
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1/b"));
        Assert.assertEquals(resultText.getText(),"Jūs sėkmingai prisiregistravote!");
    }

    @Test //Registravimasis neįvedus vartotojo vardo
    public void test2(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Įveskite vartotojo vardą.");
    }

    @Test //Registravimasis įvedus specialiuosius simbolius vartotojo varde
    public void test3(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName()+"@!");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Specialiųjų simbolių varde negali būti.");
    }

    @Test //Registravimasis neįvedant el. pašto
    public void test4(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Įveskite el. pašto adresą.");
    }

    @Test //Registravimasis nurodant el. paštą be @ simbolio
    public void test5(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail5());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"El. pašto adresas nėra tinkamas.");
    }

    @Test //Registravimasis nurodant el. paštą be top-level domain
    public void test6(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail6());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"El. pašto adresas nėra tinkamas.");
    }

    @Test //Registravimasis nurodant el. paštą be username
    public void test7(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail7());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"El. pašto adresas nėra tinkamas.");
    }

    @Test //Registravimasis nurodant el. paštą su tarpu priekyje
    public void test8(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(" "+generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"El. pašto adresas nėra tinkamas.");
    }

    @Test //Registravimasis nurodant el. paštą su tarpu username viduje
    public void test9(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail9());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"El. pašto adresas nėra tinkamas.");
    }

    @Test //Registravimasis neįrašant slaptažodžio
    public void test10(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Įveskite slaptažodį.");
    }

    @Test //Registravimasis neįrašant slaptažodžio pakartotinai
    public void test11(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!@");
        driver.findElement(By.id("Password2")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[8]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Pakartotinai neįvedėte slaptažodžio.");
    }

    @Test //Registravimasis neįvedus slaptažodžio ir slaptažodžio pakartotinai
    public void test12(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.id("Password2")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Įveskite slaptažodį.");
    }

    @Test //Registravimasis slaptažodyje įvedus 7 simbolius
    public void test13(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!Asdf!");
        driver.findElement(By.id("Password2")).sendKeys("@!Asdf!");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Slaptažodį turi sudaryti bent 8 simboliai.");
    }

    @Test //Registravimasis slaptažodyje neįvedus specialiųjų simbolių
    public void test14(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("Asdfghj");
        driver.findElement(By.id("Password2")).sendKeys("Asdfghj");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Slaptažodį turi sudaryti bent 1 specialusis simbolis.");
    }

    @Test //Registravimasis slaptažodį parašius tik iš mažųjų raidžių
    public void test15(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("kvadratas");
        driver.findElement(By.id("Password2")).sendKeys("kvadratas");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Slaptažodį turi sudaryti bent 1 specialusis simbolis, 1 didžioji raidė ir 1 skaičius.");
    }

    @Test //Registravimasis slaptažodį parašius tik iš mažųjų raidžių
    public void test16(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("KVADRATAS");
        driver.findElement(By.id("Password2")).sendKeys("KVADRATAS");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Slaptažodį turi sudaryti bent 1 specialusis simbolis, 1 mažoji raidė ir 1 skaičius.");
    }

    @Test //Registravimasis slaptažodį parašius tik iš mažųjų raidžių
    public void test17(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/registracija");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("@!As df!@");
        driver.findElement(By.id("Password2")).sendKeys("@!As df!@");
        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
        Assert.assertEquals(resultText.getText(),"Slaptažodyje negali būti tarpų.");
    }

//    @Test
//    public void testSkelbimas1() {
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://elenta.lt/");
//
//        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
//        cookieButton.click();
//
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]")).click();
//        driver.findElement(By.id("UserName")).sendKeys("Asd123");
//        driver.findElement(By.id("Password")).sendKeys("Asd123");
//        driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).click();
//
//    }

    @Test
    public void testSkelbimas() {
        String myTitle = "Kompas";
        String myText = "Puikios būklės";
        String myNumber = "+37095150753";
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://elenta.lt/");

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("title")).sendKeys(myTitle);
        driver.findElement(By.id("text")).sendKeys(myText);
        driver.findElement(By.id("price")).sendKeys("5");
        driver.findElement(By.id("location-search-box")).sendKeys("Kaunas");
        driver.findElement(By.id("phone")).sendKeys(myNumber);
        driver.findElement(By.id("email")).sendKeys(generateRandomEmail());
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[7]/input[2]")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\ivetu\\Desktop\\woods.jpg");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/table/tbody/tr[12]/td[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/ul/li/div[1]/h3/a")).click();

        WebElement titleText = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/h1/a"));
        Assert.assertEquals(titleText.getText(),myTitle);
        WebElement numberText = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/a"));
        Assert.assertEquals(numberText.getText(),myNumber);
        WebElement theText = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[3]"));
        Assert.assertEquals(theText.getText(),myText);

    }



//    Thread.sleep(2000); milisekundemis
//
//    tiems, kam atsibodo, kad daug naršyklių po to reikia išjungti,
//    tai testo gale parašykit _globalDriver.close(); ir tada automatiškai išjungs naršyklę
}

