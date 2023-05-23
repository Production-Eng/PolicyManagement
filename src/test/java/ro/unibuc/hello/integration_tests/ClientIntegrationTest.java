package ro.unibuc.hello.integration_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ro.unibuc.hello.models.Client;
import ro.unibuc.hello.models.ClientRepository;

@SpringBootTest
class ClientIntegrationTest {

    @Autowired
    ClientRepository clientRepository;

    @Test
    void test_buildClientFromInfo_returnsClientWithInformation() {

        Client client = new Client(1, "John", "12345");

        Assertions.assertEquals(1, client.getIdClient());
        Assertions.assertEquals("John", client.getName());
        Assertions.assertEquals("12345", client.getCnp());
    }
}