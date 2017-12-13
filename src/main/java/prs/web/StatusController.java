package prs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import prs.domain.status.Status;
import prs.domain.status.StatusRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/Status") // This means URL's start with /demo (after Application path)
public class StatusController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private StatusRepository statusRepository;

//	@GetMapping(path="/add") // Map ONLY GET Requests
//	public @ResponseBody String addNewUser (@RequestParam String name
//			, @RequestParam String email) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//
//		User n = new User();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
//		return "Saved";
//	}

	@GetMapping(path="/List") //currently products and vendors are linked
	public @ResponseBody Iterable<Status> getAllStatus() {
		// This returns a JSON or XML with the users
		return statusRepository.findAll();
	}
	
    @GetMapping(path="/Get")
    public @ResponseBody Status getStatus(@RequestParam int id) {
        Status s = statusRepository.findOne(id);
        return s;//Get?id= enter id # here
    }
    
    @GetMapping(path="/Delete")
    public @ResponseBody String deleteProduct(@RequestParam int id) {
        String msg = "";
        try {
            statusRepository.delete(id);
            msg = "Status " + id + " deleted";
        } catch (EmptyResultDataAccessException exc) {
            msg = "Status " + id + " doesn't exist...can't delete!";
        }
        return msg;
    }

}