package ro.unibuc.hello.models;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
public class DamageClaim {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int idDamageClaim;
    @DateTimeFormat(pattern = "DD/MM/YYYY")
    private Date issuedDate;
    private String claimReason;
    private String claimIssuerCNP;

    public int getIdDamageClaim() {
        return idDamageClaim;
    }

    public void setIdDamageClaim(int idDamageClaim) {
        this.idDamageClaim = idDamageClaim;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getClaimIssuerCNP() {
        return claimIssuerCNP;
    }

    public void setClaimIssuerCNP(String claimIssuerCNP) {
        this.claimIssuerCNP = claimIssuerCNP;
    }
}
