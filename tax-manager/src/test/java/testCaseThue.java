//package test;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.dungnd.dao.impl.TaxConfigDaoImpl;
//import com.dungnd.model.TaxConfig;
//
//public class testCaseThue {
//	TaxConfig cu = new TaxConfig(1, 9000000, 3600000, 760000);
//	private WebDriver driver;
//	private Connection con;
//	JavascriptExecutor js;
//	public static final String HOSTNAME = "http://192.168.43.67:8080";
//
//	@BeforeEach
//	public void setUp() throws SQLException, ClassNotFoundException {
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=tax_sqa", "cuong1",
//				"1");
//		con.setAutoCommit(false);
//	}
//
//	@AfterEach
//	public void tearDown() throws SQLException {
//		TaxConfigDaoImpl check = new TaxConfigDaoImpl();
//		check.editTax(cu);
//		con.close();
//	}
//
//	@Test
//	public void testRedirectToTaxConfig() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		// mở trình duyệt
//		driver.get(HOSTNAME + "/tax-manager/home");
//		// chiều dài chiều rộng cửa rổ trình duyêt
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		// click vào cái cấu hình
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// kiểm tra có phải title là cấu hình thuế không
//		assertThat(driver.getTitle(), is("Cấu hình thuế"));
//		driver.quit();
//	}
//
//	@Test
//	public void testRedirectToTaxList() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		// mở trình duyệt
//		driver.get(HOSTNAME + "/tax-manager/home");
//		// chiều dài chiều rộng cửa rổ trình duyêt
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		// click vào cái cấu hình
//		driver.findElement(By.linkText("Danh sách thuế")).click();
//		// kiểm tra có phải title là cấu hình thuế không
//		assertThat(driver.getTitle(), is("Danh sách thuế"));
//		driver.quit();
//	}
//
//	@Test
//	public void testInputNumberGTBanThan() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		// mở trình duyệt web
//		driver.get(HOSTNAME + "/tax-manager/home");
//		// set cao rộng
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		// cick vào link chuyển sang cấu hình thuế
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// click vào giảm trừ bản thân
//		driver.findElement(By.id("gtBanThan")).click();
//		// xóa
//		driver.findElement(By.id("gtBanThan")).clear();
//		// nhập
//		driver.findElement(By.id("gtBanThan")).sendKeys("jsjakjdakdj");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("760000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtBanThan")).getAttribute("validationMessage");
//		assertEquals("Please fill out this field.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputNumberGTPhuThuoc() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		// mở trình duyệt web
//		driver.get(HOSTNAME + "/tax-manager/home");
//		// set cao rộng
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		// cick vào link chuyển sang cấu hình thuế
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// click vào giảm trừ bản thân
//		driver.findElement(By.id("gtBanThan")).click();
//		// xóa
//		driver.findElement(By.id("gtBanThan")).clear();
//		// nhập
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("sjkhcajkscl");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("760000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtPhuThuoc")).getAttribute("validationMessage");
//		assertEquals("Please fill out this field.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputNumberGTTienAn() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		// mở trình duyệt web
//		driver.get(HOSTNAME + "/tax-manager/home");
//		// set cao rộng
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		// cick vào link chuyển sang cấu hình thuế
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// click vào giảm trừ bản thân
//		driver.findElement(By.id("gtBanThan")).click();
//		// xóa
//		driver.findElement(By.id("gtBanThan")).clear();
//		// nhập
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("sdsdssf");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtTienAn")).getAttribute("validationMessage");
//		assertEquals("Please fill out this field.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testBlankInputGTBanThan() {
//		// ok nhá
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// click vào giảm trù bản thân
//		// cái id này hình như của text mà ông chưa sửa
//		driver.findElement(By.id("gtBanThan")).click();
//		// clear cái text đấy
//		driver.findElement(By.id("gtBanThan")).clear();
//		// điền vào
//		driver.findElement(By.id("gtBanThan")).sendKeys("");
//		// tương tự trên
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).sendKeys("760000");
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.cssSelector(".btn")).click();
//		// kiểm tra xem cái Giảm trù bản thân có rỗng không
//		String message = driver.findElement(By.id("gtBanThan")).getAttribute("validationMessage");
//		assertEquals("Please fill out this field.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testBlankInputGTPhuThuoc() {
//		// ok nhá
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// click vào giảm trù bản thân
//		// cái id này hình như của text mà ông chưa sửa
//		driver.findElement(By.id("gtBanThan")).click();
//		// clear cái text đấy
//		driver.findElement(By.id("gtBanThan")).clear();
//		// điền vào
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		// tương tự trên
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).sendKeys("760000");
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.cssSelector(".btn")).click();
//		// kiểm tra xem cái Giảm trù bản thân có rỗng không
//		String message = driver.findElement(By.id("gtPhuThuoc")).getAttribute("validationMessage");
//		assertEquals("Please fill out this field.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testBlankInputGTTienAn() {
//		// ok nhá
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		// click vào giảm trù bản thân
//		// cái id này hình như của text mà ông chưa sửa
//		driver.findElement(By.id("gtBanThan")).click();
//		// clear cái text đấy
//		driver.findElement(By.id("gtBanThan")).clear();
//		// điền vào
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		// tương tự trên
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).sendKeys("");
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.cssSelector(".btn")).click();
//		// kiểm tra xem cái Giảm trù bản thân có rỗng không
//		String message = driver.findElement(By.id("gtTienAn")).getAttribute("validationMessage");
//		assertEquals("Please fill out this field.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testBoundInputGTBanThan() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("900000000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("760000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtBanThan")).getAttribute("validationMessage");
//		assertEquals("Value must be less than or equal to 100000000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testBoundInputGTPhuThuoc() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("90000000000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("760000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtPhuThuoc")).getAttribute("validationMessage");
//		assertEquals("Value must be less than or equal to 100000000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testBoundInputGTTienAn() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("76000000000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtTienAn")).getAttribute("validationMessage");
//		assertEquals("Value must be less than or equal to 100000000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputNegativeNumberGTTienAn() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("-7600000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtTienAn")).getAttribute("validationMessage");
//		assertEquals("Value must be greater than or equal to 1000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputNegativeNumberGTBanThan() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("-9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("7600000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtBanThan")).getAttribute("validationMessage");
//		assertEquals("Value must be greater than or equal to 1000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputNegativeNumberGTPhuThuoc() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("-3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("7600000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtPhuThuoc")).getAttribute("validationMessage");
//		assertEquals("Value must be greater than or equal to 1000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputBanThan() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000123");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("7600000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtBanThan")).getAttribute("validationMessage");
//		System.out.println(message);
//		assertEquals("Please enter a valid value. The two nearest valid values are 9000000 and 9001000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputPhuThuoc() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000000");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600125");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("7600000");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtPhuThuoc")).getAttribute("validationMessage");
//		System.out.println(message);
//		assertEquals("Please enter a valid value. The two nearest valid values are 3600000 and 3601000.", message);
//		driver.quit();
//	}
//
//	@Test
//	public void testInputTienAn() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(HOSTNAME + "/tax-manager/home");
//		driver.manage().window().setSize(new Dimension(1050, 840));
//		driver.findElement(By.linkText("Cấu hình thuế")).click();
//		driver.findElement(By.id("gtBanThan")).click();
//		driver.findElement(By.id("gtBanThan")).clear();
//		driver.findElement(By.id("gtBanThan")).sendKeys("9000123");
//		driver.findElement(By.id("gtPhuThuoc")).click();
//		driver.findElement(By.id("gtPhuThuoc")).clear();
//		driver.findElement(By.id("gtPhuThuoc")).sendKeys("3600000");
//		driver.findElement(By.id("gtTienAn")).click();
//		driver.findElement(By.id("gtTienAn")).clear();
//		driver.findElement(By.id("gtTienAn")).sendKeys("7600456");
//		driver.findElement(By.cssSelector(".btn")).click();
//		String message = driver.findElement(By.id("gtTienAn")).getAttribute("validationMessage");
//		System.out.println(message);
//		assertEquals("Please enter a valid value. The two nearest valid values are 7600000 and 7601000.", message);
//		driver.quit();
//	}
//}
