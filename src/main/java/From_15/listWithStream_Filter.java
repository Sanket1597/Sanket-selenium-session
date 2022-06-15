package From_15;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listWithStream_Filter {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.in/b?node=15325111031&pf_rd_r=JECSM6DHZY0QZ8501HE5&pf_rd_p=c855632a-e534-4274-bfe3-c500ef877b08&pd_rd_r=5fa5be54-d498-4c4a-9363-a6b699619103&pd_rd_w=aSp13&pd_rd_wg=nVqK7&ref_=pd_gw_unk");
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	By links=By.tagName("a");	
	List<WebElement>linkList=	driver1.findElements(links);
		
		System.out.println(linkList.size());
		
		List<String> collectlist=linkList
	                                            .stream()
	                                             	.filter(ele ->! ele.getText().equals("") &&	ele.getText().contains("Amazon"))
		                                                  .map(ele -> ele.getText())
	                                                        	.collect(Collectors.toList());
		

//		List<String> collectlist=linkList
//	                                            .stream()
//	                                             	.filter(ele ->! ele.getText().isEmpty())
//	                                             			.filter(ele -> ele.getText().startsWith(" "))
//		                                                  .map(ele -> ele.getText().trim())
//	                                                        	.collect(Collectors.toList());
		
		
		
		
		
		
		
		
		collectlist.stream().forEach(ele -> System.out.println(ele));//sequenial streaam

		collectlist.parallelStream().forEach(ele -> System.out.println(ele));//parallel streaam
		
		
		
		
		
		
		
		
		

	}

}
