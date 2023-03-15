package ro.unibuc.hello.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Primes {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int idPrime;

    String policyNumber;
    double prime;
    @DateTimeFormat(pattern = "DD/MM/YYYY")
    private Date issuedDate;


    public void setIdPrime(int idPrime) {
        this.idPrime = idPrime;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public int getIdPrime() {
        return idPrime;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getPrime() {
        return prime;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }
}
