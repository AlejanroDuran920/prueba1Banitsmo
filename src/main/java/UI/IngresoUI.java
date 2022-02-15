package UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoUI {
    public static final Target BUTTON_ADD_TO_BASKET_1 = Target.the("boton agregar 1").located(By.id("165"));
    public static final Target BUTTON_ADD_TO_BASKET_2 = Target.the("boton agregar 2").located(By.id("169"));
    public static final Target BUTTON_SHOPPING_CART = Target.the("boton agregar carrito").located(By.className("wpmenucart-contents"));


}
