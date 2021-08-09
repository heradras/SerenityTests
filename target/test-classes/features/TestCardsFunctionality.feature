Feature: Funcionamiento de las cards de homePage
  Como usuario quiero dar click a las diferentes tarjetas para ser redirigido a la mainPage

  Scenario Outline: Acceder a la tarjeta elements
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta <CardName>
    Then ve la pagina de elementos desplegables con titulo <Displayed Title>

    Examples:
    |   CardName       |     Displayed Title     |
    | elementsCard     |         Elements        |
    | formsCard        |         Forms           |
    | afwCard          | Alerts, Frame & Windows |
    | widgetsCard      |        Widgets          |
    | interactionsCard |      Interactions       |
    | bsaCard          |        Book Store       |