Feature: Ingreso

  Caracterisstica: Ingresar a la pagina web

  @EscenarioSinEjemplos
  Scenario Outline: Ingreso a comprar
    Given El cliente debera ingresar a la pagina web
    When El cliente agrega productos al carrito
    Then El cliente elimina un producto del carrito

    Examples:


