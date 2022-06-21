package com.bridgelabz.cabinvoicegenerator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {


    CabInvoiceGenerator cabInvoiceGenerator;
    @Before
    public void setUp() throws Exception {
        cabInvoiceGenerator=new CabInvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals("fare", 25, fare, 0.0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare(){
        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
        double distance=0.1;
        int time=1;
        double fare=cabInvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals("fare",5,fare,0.0);
    }

//    @Test
//    public void givenMultipleRides_ShouldReturnTotalFare(){
//        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
//        Ride[] rides={new Ride(2.0,5),
//                new Ride(0.1,1)
//        };
//        double fare=cabInvoiceGenerator.calculateFare(rides);
//        Assert.assertEquals("fare",30,fare,0.0);
//    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary(){
        Ride[] rides={new Ride(2.0,5),
                new Ride(0.1,1)
        };
        InvoiceSummary invoiceSummary=cabInvoiceGenerator.calculateFare(rides);
        InvoiceSummary expected_invoiceSummary=new InvoiceSummary(2,30.0);
        Assert.assertEquals(expected_invoiceSummary,invoiceSummary);
    }
}