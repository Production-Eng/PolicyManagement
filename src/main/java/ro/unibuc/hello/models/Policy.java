package ro.unibuc.hello.models;


import javax.persistence.*;

@Entity
public class Policy {

    public Policy()
    {

    }

    public Policy(Long idpol, String policyNumber, String policyHolderFirstName, String policyHolderLastName, String CNP)
    {
        this.idpol = idpol;
        this.policyNumber = policyNumber;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.CNP = CNP;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idpol;
    private String policyNumber;
    private String policyHolderFirstName;

    private String policyHolderLastName;

    private String CNP;

    private String infoLetter;

    public void setPolicyNumber(String policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    public void setPolicyHolderFirstName(String policyHolderFirstName)
    {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    public void setId(Long id)
    {
        this.idpol = id;
    }

    public void setPolicyHolderLastName(String policyHolderLastName)
    {
        this.policyHolderLastName = policyHolderLastName;
    }

    public void setCNP(String CNP)
    {
        this.CNP = CNP;
    }

    public Long getIdPol()
    {
        return idpol;
    }

    public String getPolicyNumber()
    {
        return policyNumber;
    }

    public String getPolicyHolderFirstName()
    {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName()
    {
        return policyHolderLastName;
    }

    public String getCNP()
    {
        return CNP;
    }

    public String infoLetter()
    {
        String letterText = "Stimate domn/doamna " + this.getPolicyHolderFirstName() + " " + this.getPolicyHolderLastName() + ", identificat prin " + this.getCNP() + ", avand polita " + this.getPolicyNumber() + " \r\nva multumim ca sunteti alaturi de noi si ca ne sunteti in continuare client\r\nVa dorim o zi buna!\r\nEchipa de la marketing";
        return letterText;
    }


}
