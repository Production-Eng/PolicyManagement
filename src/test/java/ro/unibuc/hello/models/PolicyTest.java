package ro.unibuc.hello.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PolicyTest {

    Policy pol = new Policy(Long.valueOf(1), "15662312EUR", "Iulian", "HV", "31234123123");


    @Test
    void test_id(){
        pol.setId(Long.valueOf(2));
        Assertions.assertEquals(Long.valueOf(2), pol.getIdPol());
    }

    @Test
    void test_policyNumber(){
        pol.setPolicyNumber("15662312EUR");
        Assertions.assertEquals("15662312EUR", pol.getPolicyNumber());
    }

    @Test
    void test_policyHolderFirstName(){
        pol.setPolicyHolderFirstName("IulianN");
        Assertions.assertEquals("IulianN", pol.getPolicyHolderFirstName());
    }

    @Test
    void test_policyHolderLastName(){
        pol.setPolicyHolderLastName("HVA");
        Assertions.assertEquals("HVA", pol.getPolicyHolderLastName());
    }

    @Test
    void test_CNP(){
        pol.setCNP("2233123");
        Assertions.assertEquals("2233123", pol.getCNP());

    }

    @Test
    void test_infoLetter(){
        pol.setCNP("anonCNP");
        Assertions.assertEquals("Stimate domn/doamna " + pol.getPolicyHolderFirstName() + " " + pol.getPolicyHolderLastName() + ", identificat prin " + pol.getCNP() + ", avand polita " + pol.getPolicyNumber() + " \r\nva multumim ca sunteti alaturi de noi si ca ne sunteti in continuare client\r\nVa dorim o zi buna!\r\nEchipa de la marketing", pol.infoLetter());

    }

}