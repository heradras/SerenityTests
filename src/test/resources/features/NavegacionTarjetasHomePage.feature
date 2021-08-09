Feature: Funcionamiento de las cards de homePage
  Como usuario quiero dar click a las diferentes tarjetas para remitirme a la mainPage
@asd
  Scenario: Acceder a la tarjeta elements
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta elementsCard
    And el usuario hace click en la pestaña Forms de los elementos desplegados
    Then ve la pagina con titulo