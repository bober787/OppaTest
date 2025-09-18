package org.example.utils;

import com.codeborne.selenide.Condition;
import org.example.data.Locators;
import org.example.data.LoginData;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;

public class BaseAuth {

    public static void login() {
        open(Locators.BASE_URL);

        if ($(Locators.BTN_AUTH).exists()) {
            $(Locators.BTN_AUTH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
            $(Locators.FIELD_USERNAME_LOGIN).setValue(LoginData.USERNAME);
            $(Locators.FIELD_PASSWORD_LOGIN).setValue(LoginData.PASSWORD);
            $(Locators.BTN_LOGIN).click();

            $(Locators.CAPTCHA).should(Condition.disappear, Duration.ofSeconds(30));
        }

    }
}
