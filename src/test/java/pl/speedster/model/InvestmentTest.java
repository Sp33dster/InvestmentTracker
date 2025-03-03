package pl.speedster.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class InvestmentTest {

    @Test
    public void shouldCreateInvestmentCorrectly() {
        Investment inv = new Investment();
        inv.setAmount(3.2);
        inv.setType("Lego");
        inv.setUser(new User("test", "pass", "test@test.com"));
        inv.setPurchaseDate(new Date(2024,02,22));
        inv.setPurchasePrice(200.2);

        assertThat(inv.getAmount()).isEqualTo(3.2);
        assertThat(inv.getType()).isEqualTo("Lego");
        assertThat(inv.getUser().getUsername()).isEqualTo("test");
        assertThat(inv.getPurchaseDate().getDate()).isEqualTo(22);
        assertThat(inv.getPurchasePrice()).isEqualTo(200.2);

    }
}
