package com.uniProject.SE_Project.serviceProvider;

import com.uniProject.SE_Project.serviceProvider.ServiceProvider;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProvidersRepo{
	private List<ServiceProvider> providers;
    
    
    public ProvidersRepo()
    {
    	providers = new ArrayList<>();
    	providers.add(new CancerHospital());
    	providers.add(new Etisalat());
    	providers.add(new NGos());
    	providers.add(new Orange());
    	providers.add(new Schools());
    	providers.add(new Vodafone());
    	providers.add(new We());
    	
    }
    
    public ServiceProvider findById(int id) {
		for(ServiceProvider providerDb:providers) {
			if(providerDb.getId()==id) {
				return providerDb;
			}
		}
		return null;
	}
    
    public List <ServiceProvider> findByName(String n) {
    	List <ServiceProvider> results = new ArrayList<>();
		for(ServiceProvider providerDb:providers) {
			if(providerDb.getServicePName().toUpperCase().contains(n.toUpperCase())) {
				 results.add(providerDb);
			}
		}
		return results;
	}
    
    
    

	
	
	
	
}