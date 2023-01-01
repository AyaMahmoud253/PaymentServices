package com.uniProject.SE_Project.Refund;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.uniProject.SE_Project.Refund.ProcessRepo;
import com.uniProject.SE_Project.Refund.ProcessInformation;

import com.uniProject.SE_Project.user.Response;
@RestController
public class RefundProcessController {
	
	private  final ProcessRepo Repository;
	
	@Autowired
	public RefundProcessController(ProcessRepo Repository) {
		this.Repository=Repository;
	}
	
	 Response R=new Response();

	@RequestMapping(value = "/getAllRequests",method = RequestMethod.GET)
	public List<ProcessInformation> getAllRequests() {
		return Repository.getAll();
	}
	@RequestMapping(value = "/AddRequest",method = RequestMethod.POST)
	public String AddRequests(@RequestBody ProcessInformation refund) {
		return Repository.AddRequest(refund);
		
	}
	@RequestMapping(value = "/getRequest/{id}",method = RequestMethod.GET)
	public ProcessInformation getRequest(@PathVariable("id") int id) {
		return Repository.getRequest(id);
	}
	@RequestMapping(value = "/getMessage/{id}",method = RequestMethod.GET)
	public String RefundProcess(@PathVariable("id") int id) {
		if(Repository.Search(id)) {
			R.setMessage("Refund Process Completed");
			return R.getMessage();
		}else {
			R.setMessage("Refund Process did not Completed");
			return R.getMessage();
 
		}
		
		
	}
	
	

}
