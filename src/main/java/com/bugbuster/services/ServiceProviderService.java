package com.bugbuster.services;

import com.bugbuster.models.serviceprovider.ServiceProvider;
import com.bugbuster.repositories.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProviderService implements ServiceProviderServiceI{

    private ServiceProviderRepository serviceProviderRepository;

    @Autowired
    public ServiceProviderService(ServiceProviderRepository serviceProviderRepository) {
        this.serviceProviderRepository = serviceProviderRepository;
    }

    @Override
    public void addServiceProvider(ServiceProvider serviceProvider) {
        serviceProviderRepository.save(serviceProvider);
    }

    @Override
    public ServiceProvider updateServiceProvider(ServiceProvider serviceProvider, Long id) {
        findById(serviceProvider.getId());
        return serviceProviderRepository.saveAndFlush(serviceProvider);
    }

    @Override
    public ServiceProvider findById(Long id) {
        return serviceProviderRepository.findById(id).get();
    }

    @Override
    public List<ServiceProvider> findAll() {
        return serviceProviderRepository.findAll();
    }

    @Override
    public void deleteServiceProvider(Long id) {
        serviceProviderRepository.deleteById(id);
    }
}
