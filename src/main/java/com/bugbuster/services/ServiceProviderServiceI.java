package com.bugbuster.services;


import com.bugbuster.models.serviceprovider.ServiceProvider;

import java.util.List;

public interface ServiceProviderServiceI {
    void addServiceProvider(ServiceProvider serviceProvider);
    ServiceProvider updateServiceProvider(ServiceProvider serviceProvider, Long id);
    ServiceProvider findById(Long id);
    List<ServiceProvider> findAll();
    void deleteServiceProvider(Long id);
}
