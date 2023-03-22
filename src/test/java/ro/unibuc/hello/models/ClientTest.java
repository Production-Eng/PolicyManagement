package ro.unibuc.hello.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientTest {

    Client client = new Client(1, "John", "12345");
    Client client2 = new Client();

    @Test
    void test_name(){
        Assertions.assertSame("John", client.getName());
    }
    @Test
    void test_cnp(){
        Assertions.assertEquals("12345", client.getCnp());
    }

    @Test
    void test_id() {Assertions.assertEquals(1, client.getIdClient()); }

    @Test
    void test_setIdClient() {
        client2.setIdClient(2);
        Assertions.assertEquals(2, client2.getIdClient());
    }

    @Test
    void test_setCnp() {
        client2.setCnp("54321");
        Assertions.assertEquals("54321", client2.getCnp());
    }

    @Test
    void test_setName() {
        client2.setName("Andrei");
        Assertions.assertEquals("Andrei", client2.getName());
    }
}