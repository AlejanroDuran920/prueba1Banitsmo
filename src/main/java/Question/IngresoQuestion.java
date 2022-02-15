package Question;

import UI.CarritoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IngresoQuestion implements Question {
    private final int validtext;

    public IngresoQuestion(int validtext) {
        this.validtext = validtext;
    }
    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(CarritoUI.TEXT_VALID).viewedBy(actor).asInteger()<400)
            return true;
         else
            return false;
    }
    public static IngresoQuestion IngresoQ(int validtext){
        return new IngresoQuestion(validtext);
    }
}
