package UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoUI {
    public static final Target BUTTON_DELETE= Target.the("boton eliminar producto").located(By.className("remove"));
    public static final Target TEXT_VALID = Target.the("El cliente valida que el precio se haya descontado").located(By.className("woocommerce-Price-amount amount"));


}
