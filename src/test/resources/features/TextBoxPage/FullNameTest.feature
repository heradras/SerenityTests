Feature: Comportamiento del campo de entrada Full Name
  Como usuario, quiero ingresar datos al campo de entrada Full Name para ingresar mi nombre

  Scenario: Datos correctos
    Given que el usuario esta en la pagina de la pestaña textBox
    When introduce el nombre completo Antonio Martinez en el campo FullName
    And hace click en el boton submit
    Then ve Antonio Martinez reflejado en la respuesta
