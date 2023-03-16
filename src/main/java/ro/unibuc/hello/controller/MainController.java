package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.unibuc.hello.models.PolicyRepository;
import ro.unibuc.hello.models.Policy;
import ro.unibuc.hello.models.PrimesRepository;
import ro.unibuc.hello.models.Primes;
import ro.unibuc.hello.models.DamageClaimRepository;
import ro.unibuc.hello.models.DamageClaim;
import java.util.Date;

@Controller // This means that this class is a Controller
@RequestMapping(path="/")
public class MainController {

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private PrimesRepository primesRepository;

    @Autowired
    private DamageClaimRepository damageClaimRepository;

    @PostMapping(path="/addPolicy") // Map ONLY POST Requests
    public @ResponseBody String addNewPolicy (
            @RequestParam String policyNumber,
            @RequestParam String policyHolderFirstName,
            @RequestParam String policyHolderLastName,
            @RequestParam String CNP) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Policy p = new Policy();
        p.setCNP(CNP);
        p.setPolicyNumber(policyNumber);
        p.setPolicyHolderFirstName(policyHolderFirstName);
        p.setPolicyHolderLastName(policyHolderLastName);
        policyRepository.save(p);
        return "Saved";
    }

    @PostMapping(path="/addPrimes") // Map ONLY POST Requests
    public @ResponseBody String addNewPrimes (
            @RequestParam String policyNumber,
            @RequestParam double prime,
            @RequestParam Date issuedDate) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Primes p = new Primes();
        p.setPolicyNumber(policyNumber);
        p.setPrime(prime);
        p.setIssuedDate(issuedDate);
        primesRepository.save(p);
        return "Saved";
    }

    @PostMapping(path="/addDamageClaim") // Map ONLY POST Requests
    public @ResponseBody String addDamageClaim (
            @RequestParam Date issuedDate,
            @RequestParam String claimReason,
            @RequestParam String claimIssuerCNP) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        DamageClaim claim = new DamageClaim();
        claim.setIssuedDate(issuedDate);
        claim.setClaimReason(claimReason);
        claim.setClaimIssuerCNP(claimIssuerCNP);
        damageClaimRepository.save(claim);
        return "Saved";
    }

    @GetMapping(path="/getPolicy")
    public @ResponseBody Iterable<Policy> getAllPolicy() {
        // This returns a JSON or XML with the users
        return policyRepository.findAll();
    }

    @GetMapping(path="/getPrimes")
    public @ResponseBody Iterable<Primes> getAllPrimes() {
        // This returns a JSON or XML with the users
        return primesRepository.findAll();
    }

    @GetMapping(path="/getDamageClaims")
    public @ResponseBody Iterable<DamageClaim> getAllDamageClaims() {
        // This returns a JSON or XML with the users
        return damageClaimRepository.findAll();
    }

}
