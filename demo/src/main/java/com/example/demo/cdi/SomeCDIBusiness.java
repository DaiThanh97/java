package com.example.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

    @Inject
    private SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
