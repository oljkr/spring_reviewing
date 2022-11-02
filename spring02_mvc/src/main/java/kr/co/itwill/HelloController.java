package kr.co.itwill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	public HelloController() {
		System.out.println("-----HelloController()객체 생성됨");
	}//end
	
	//결과확인 http://localhost:9095/hello.do
	//요청명령어 등록 후 실행의 주체는 메소드(함수)
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav=new ModelAndView();
		
		// /WEB-INF/views/hello.jsp
		mav.setViewName("hello");
		
		mav.addObject("message", "Welcome to MyHome!!");
		
		return mav;
		
	}//hello() end
	
}//class end
