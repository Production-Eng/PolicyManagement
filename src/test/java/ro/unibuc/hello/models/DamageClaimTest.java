package ro.unibuc.hello.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class DamageClaimTest {
    private int id = 1;
    private Date date = new Date();
    private String cnp = "121412412";
    private String claimReason = "accident";
    private Float damageValue = 1241.32f;
    private Float totalDamageValue = damageValue + 0.3f * damageValue;
    DamageClaim myDamageClaim = new DamageClaim(id, date, claimReason, cnp, damageValue);

    @Test
    void test_id(){
        int new_id = 2;
        Assertions.assertSame(id, myDamageClaim.getIdDamageClaim());
        myDamageClaim.setIdDamageClaim(new_id);
        Assertions.assertSame(new_id, myDamageClaim.getIdDamageClaim());
    }
    @Test
    void test_issuedDate(){
        Date new_date = new Date();
        Assertions.assertSame(date, myDamageClaim.getIssuedDate());
        myDamageClaim.setIssuedDate(new_date);
        Assertions.assertSame(new_date, myDamageClaim.getIssuedDate());
    }
    @Test
    void test_claimReason(){
        String new_claimReason = "new accident";
        Assertions.assertSame(claimReason, myDamageClaim.getClaimReason());
        myDamageClaim.setClaimReason(new_claimReason);
        Assertions.assertSame(new_claimReason, myDamageClaim.getClaimReason());
    }
    @Test
    void test_claimIssuerCNP(){
        String new_cnp = "1241241215";
        Assertions.assertSame(cnp, myDamageClaim.getClaimIssuerCNP());
        myDamageClaim.setClaimIssuerCNP(new_cnp);
        Assertions.assertSame(new_cnp, myDamageClaim.getClaimIssuerCNP());
    }
    @Test
    void test_damageValue(){
        Float new_damageValue = 2111.5f;
        Assertions.assertSame(damageValue, myDamageClaim.getDamageValue());
        myDamageClaim.setDamageValue(new_damageValue);
        Assertions.assertSame(new_damageValue, myDamageClaim.getDamageValue());
    }

    @Test
    void test_totalDamageValue(){
        Float new_damageValue = 2111.5f;
        Float new_totalDamageValue = new_damageValue + 0.3f * new_damageValue;
        Assertions.assertSame(damageValue, myDamageClaim.getDamageValue());
        myDamageClaim.setDamageValue(new_totalDamageValue);
        Assertions.assertSame(new_totalDamageValue, myDamageClaim.getDamageValue());
    }
}