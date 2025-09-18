package tests;

import com.codeborne.selenide.Selenide;
import org.example.data.Locators;
import org.example.utils.BaseAuth;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthTest {

    @BeforeEach
    void setUp() {
        BaseAuth.login();
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }

    @Test
    void testOpenHomePage() {
        open(Locators.BASE_URL);

        assertTrue(Locators.BALANCE.isDisplayed(), "BALANCE ❌");
        assertTrue(Locators.BTN_DEPOSIT.isDisplayed(), "BTN_DEPOSIT ❌");
        assertTrue(Locators.USER_PANEL.isDisplayed(), "USER_PANEL ❌");

    }
}
