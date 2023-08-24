package s23.carDatabase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

		@RequestMapping("index")
		@ResponseBody
		public String showMainPage() {
			return "This is the main page";
		}
		
		@RequestMapping("contact")
		@ResponseBody
		public String showContact() {
		return "This is the contact page";
		}
		
		@RequestMapping("hello")
		@ResponseBody
		public String sayHelloToSomebody(@RequestParam (name="name", required=false, defaultValue="someone") String name,
				@RequestParam(name="location", required=false, defaultValue="somewhere") String location) {
				return "Welcome to the " + location + " " + name + "!";		

		}
}
