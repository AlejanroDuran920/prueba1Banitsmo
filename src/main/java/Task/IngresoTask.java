package Task;

import UI.CarritoUI;
import UI.IngresoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IngresoUI.BUTTON_ADD_TO_BASKET_1));
        actor.attemptsTo(Click.on(IngresoUI.BUTTON_ADD_TO_BASKET_2));
        actor.attemptsTo(Click.on(IngresoUI.BUTTON_SHOPPING_CART));
    }
    public static Performable IngresoP(){
        return instrumented(IngresoTask.class);
    }
}
