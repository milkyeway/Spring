package tw.leonchen.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes(names = { "userName" })
public class HelloController2 {

	@RequestMapping(path = "/hello.controller2", method = RequestMethod.GET)
	public String processAction1(@RequestParam("userName") String userName, Model m, SessionStatus status) {
		// String userName = request.getParameter("userName");

		Map<String, String> errors = new HashMap<String, String>();
		// request.setAttribute("errors", errors);
		m.addAttribute("errors", errors);

		if (userName == null || userName.length() == 0) {
			errors.put("name", "name is required");
		}

		if (errors != null && !errors.isEmpty()) {
			return "/form.jsp";
		}

//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userName);	
		m.addAttribute("userName", userName);

		status.setComplete();

		return "/success.jsp";
	}

	@RequestMapping(path = "/hello.controller2", method = RequestMethod.POST)
	public String processAction2(@RequestParam("userName") String userName, Model m, SessionStatus status) {
		// String userName = request.getParameter("userName");

		Map<String, String> errors = new HashMap<String, String>();
		// request.setAttribute("errors", errors);
		m.addAttribute("errors", errors);

		if (userName == null || userName.length() == 0) {
			errors.put("name", "name is required");
		}

		if (errors != null && !errors.isEmpty()) {
			return "/form.jsp";
		}

//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userName);	
		m.addAttribute("userName", userName);

		status.setComplete();

		return "/success.jsp";
	}

}
