#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping({"/", "/index"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("salutation", "hello!");
		mav.setViewName("hello");
		return mav;
	}
	
}