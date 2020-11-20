/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author Sebas
 */

public class JGivenTest 
        extends ScenarioTest<GivenTextShape, WhenTextShapeAnchored, ThenShapeReturned>{

    @Test
    public void givenTesting() {
        given().a_user_requested_text_shape_for_string("Some text");
        when().shape_contains_text_and_is_anchored();
        then().text_shape_is_editable();
    }
}
