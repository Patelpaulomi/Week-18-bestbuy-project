package com.bestbuy.model;

public class ServicePojo
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ServicePojo getServicePojo(String name)
   {
       ServicePojo servicePojo = new ServicePojo();
       servicePojo.setName(name);
       return servicePojo;
     //  storePojo.setServices(servicePojo);
   }
}
