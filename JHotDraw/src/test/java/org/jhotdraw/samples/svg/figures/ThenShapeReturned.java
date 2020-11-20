/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Sebas
 */
class ThenShapeReturned extends Stage<ThenShapeReturned> {

    @ExpectedScenarioState
    SVGTextFigure shape;

    @Test
    public ThenShapeReturned text_shape_is_editable() {
        assertNotNull(shape);
        assertTrue(shape.isEditable());
        return this;
    }
}
