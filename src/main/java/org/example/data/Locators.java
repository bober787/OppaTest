package org.example.data;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Locators {

    public static final String BASE_URL = "https://www.oppabet.com";

    // Авторизация
    public static final String BTN_AUTH = "button#login-form-call";
    public static final String BTN_LOGIN = "button.auth-button";
    public static final String BTN_REGISTRATION = "#registration-form-call";
    public static final String FIELD_USERNAME_LOGIN = "input#auth_id_email";
    public static final String FIELD_PASSWORD_LOGIN = "input#auth-form-password";
    public static final String CAPTCHA = "#captcha-element-id";


    // Элементы пользователя
    public static final SelenideElement BALANCE = $("#user-money");
    public static final SelenideElement BTN_DEPOSIT = $("#fast-deposit-popup-link");
    public static final SelenideElement USER_PANEL = $("#loginout.header-topbar__userpanel");

    //Форма регистрации
    public static final String FIELD_SPORTS = ".c-registration-bonus__item .c-registration-bonus__title";
    public static final String FIELD_SLOTS = ".c-registration-bonus__item .c-registration-bonus__title";
    public static final String FIELD_CANCEL = ".c-registration-bonus__item .c-registration-bonus__title";

}
