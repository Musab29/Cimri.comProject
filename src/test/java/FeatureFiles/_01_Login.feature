#Login kontrol senaryosu
#siteye git,
#login bilgilerini gir,
#giriş yaptığını doğrula.

Feature: Login function

  Scenario: Sign in with valid email and password

    Given Navigate to Cımrı
    When Enter username and password and click login button
    Then User should login successfully