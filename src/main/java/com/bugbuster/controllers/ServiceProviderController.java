package com.bugbuster.controllers;

import com.bugbuster.models.serviceprovider.ServiceProvider;
import com.bugbuster.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-provider")
public class ServiceProviderController {

    private ServiceProviderService serviceProviderService;

    @Autowired
    public ServiceProviderController(ServiceProviderService serviceProviderService) {
        this.serviceProviderService = serviceProviderService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addServiceProvider(@RequestBody ServiceProvider serviceProvider){
        serviceProviderService.addServiceProvider(serviceProvider);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ServiceProvider updateServiceProvider(@RequestBody ServiceProvider serviceProvider, @PathVariable Long id){
        serviceProvider.setId(id);
        return serviceProviderService.updateServiceProvider(serviceProvider, id);
    }

    @RequestMapping(value = "{/id}", method = RequestMethod.GET)
    public ServiceProvider findById(@PathVariable Long id){
        return serviceProviderService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ServiceProvider> findAll(){
        return serviceProviderService.findAll();
    }

    @RequestMapping(value = "{/id}", method = RequestMethod.DELETE)
    public void deleteServiceProvider(@PathVariable Long id){
        serviceProviderService.deleteServiceProvider(id);
    }

}
