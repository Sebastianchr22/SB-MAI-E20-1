/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.Quoted;
import org.junit.Test;

/**
 *
 * @author Sebas
 */
public class GivenTextShape extends Stage<GivenTextShape> {
    
    @ProvidedScenarioState
    SVGTextFigure shape;
    
    @Test
    public GivenTextShape a_user_requested_text_shape_for_string(@Quoted String text) {
        shape = new SVGTextFigure(text);
        return this;
    }

}
