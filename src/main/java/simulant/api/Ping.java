package simulant.api;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * A simple Ping Service to test if the Server is online.
 * 
 * @author Simulant
 *
 */
@Controller
public class Ping {

	/**
	 * Simple GET of String to test if the Server is online.
	 *
	 * @return The String: {"ping": pong}
	 */
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String getPing() {
		return "{\"ping\": pong}";
	}

}
