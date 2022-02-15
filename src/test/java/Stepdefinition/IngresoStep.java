package Stepdefinition;

import Question.IngresoQuestion;
import Task.IngresoTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresoStep {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El cliente debera ingresar a la pagina web$")
    public void el_cliente_debera_ingresar_a_la_pagina_web() {
        theActorCalled("Cliente").attemptsTo(Open.url("http://practice.automationtesting.in/shop/"));

    }

    @When("^El cliente agrega productos al carrito$")
    public void el_cliente_agrega_productos_al_carrito()  {
        theActorCalled("cliente").attemptsTo(IngresoTask.IngresoP());

    }

    @Then("^El cliente elimina un producto del carrito$")
    public void el_cliente_elimina_un_producto_del_carrito(){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(IngresoQuestion.IngresoQ()));

    }


}
