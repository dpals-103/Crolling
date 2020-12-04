package crolling;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	public static void main(String[] args) {
		
		// 시스템변수 가져오기
		//user.dir = java가 실행된 디렉토리이며, jvm을 시작한 곳. 꼭 디렉토리 내에 있을 필요는 없고 java를 실행할 수 있는 권한이 있는 곳이면 가능
		Path path = Paths.get(System.getProperty("user.dir"), "src/main/resource/chromedriver.exe"); 
		
		//WebDriver 경로 설정 
		System.setProperty("webdriver.chrome.driver", path.toString());
	
		//WebDriver 옵션 설정
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maxmized"); //전체화면으로 실행
		options.addArguments("--disable-popup-blocking"); //팝업 무시
		options.addArguments("--disable-default-apps"); //기본 앱 사용안함
		//options.setHeadless(true);
		
		//WebDriver 객체생성
		ChromeDriver driver = new ChromeDriver(options);
		
		//빈탭 생성
		driver.executeScript("window.open('about:blank','_blank');"); 
		
		//getWindowHandles() : 동시에 열린 모든 페이지의 핸들 셋을 저장한다. (활성 브라우저의 주소를 가져와 String 형태로 반환) 
		List<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		
		//첫번째 탭으로 전환 
		driver.switchTo().window(tabs.get(0)); 
		driver.get("https://pann.nate.com/Talk/Ranking");
		
		
		//쉬는 구간 
		Util.sleep(1000);
	}
	
}
