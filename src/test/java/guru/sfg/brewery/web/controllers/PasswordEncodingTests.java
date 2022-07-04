package guru.sfg.brewery.web.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

public class PasswordEncodingTests {
    static final String PASSWORD = "password";

    @Test
    void hashingExample() {
        //Encoding never changes
        System.out.println(DigestUtils.md5DigestAsHex(PASSWORD.getBytes()));
        //Encoding changes because of the salt value
        String salted = PASSWORD + "ThisIsMySaltValue";
        System.out.println(DigestUtils.md5DigestAsHex(salted.getBytes()));
    }
}
