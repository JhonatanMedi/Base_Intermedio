#24/05/2021
#Jhonatan Medina Blanco
Feature: creau cuenta y agregar al carro productos

  @PRUEBAS
  Scenario Outline: create accuont
    Given open browser
    When clic on singUp user and password <passwordP>
    Then alert close and close browser

    Examples:
      | passwordP |
      | s12346    |

