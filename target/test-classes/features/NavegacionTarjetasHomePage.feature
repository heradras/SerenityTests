Feature: Funcionamiento de las cards de homePage
  Como usuario quiero dar click a las diferentes tarjetas para remitirme a la mainPage
@asd
  Scenario: Acceder a la tarjeta elements
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta elementsCard
    Then ve la pagina de elementos desplegables con titulo Elements
    Then

  Scenario: Acceder a la tarjeta forms
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta formsCard
    Then ve la pagina de elementos desplegables con titulo Forms

  Scenario: Acceder a la tarjeta AFW
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta afwCard
    Then ve la pagina de elementos desplegables con titulo Alerts, Frame & Windows

  Scenario: Acceder a la tarjeta widgets
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta widgetsCard
    Then ve la pagina de elementos desplegables con titulo Widgets

  Scenario: Acceder a la tarjeta interactions
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta interactionsCard
    Then ve la pagina de elementos desplegables con titulo Interactions

  Scenario: Acceder a la tarjeta BSA
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta bsaCard
    Then ve la pagina de elementos desplegables con titulo Book Store