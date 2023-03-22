package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_INICIO;

public class MensajeCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_INICIO.resolveFor(actor).getText();
    }

    public static MensajeCompra mensajeCompra(){
        return new MensajeCompra();
    }
}