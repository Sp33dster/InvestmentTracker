package pl.speedster.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    public void shouldCreateUserCorrectly(){
        User user = new User("testUser", "password", "est@example.pl");

        assertThat(user.getUsername()).isEqualTo("testUser");
        assertThat(user.getPassword()).isEqualTo("password");
        assertThat(user.getEmail()).isEqualTo("est@example.pl");

    }
}
