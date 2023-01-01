package com.uniProject.SE_Project.serviceProvider;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.logic;

//import java.util.List;

@RestController
@RequestMapping(value = "/serviceProvider")
public class ServicePcontroller {
    //@Autowired
	private ProvidersRepo repo;
    public ServicePcontroller(ProvidersRepo repo) {
    	this.repo= repo;
    	
    }
   // @RequestMapping(value = "/getAll-servicesProvider",method = RequestMethod.GET)
    //public List<ServiceProviderEntity> getServiceProvider(){
       // return lo.getServiceProvider();
    //}
    @RequestMapping(value = "/search/{p}",method = RequestMethod.GET)
    public List<ServiceProvider> SearchFor(@PathVariable ("p") String tofind){
        return repo.findByName(tofind);
}
    
    
   /** @RequestMapping(value="/search/byID/{id}/fillForm/other",method=RequestMethod.POST)
    public String fillFormOther(@PathVariable ("id") int i,@RequestBody  Form F) {
    	return logicBusiness.addOtherFormFields(i, F.getAmount());
    }**/


}
