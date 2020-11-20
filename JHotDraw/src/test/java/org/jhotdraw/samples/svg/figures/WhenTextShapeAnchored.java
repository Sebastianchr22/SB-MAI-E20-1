/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.FillerWord;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.samples.svg.SVGAttributeKeys;
import static org.jhotdraw.samples.svg.SVGAttributeKeys.TEXT_ANCHOR;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Sebas
 */
class WhenTextShapeAnchored extends Stage<WhenTextShapeAnchored> {
    
    @ExpectedScenarioState
    SVGTextFigure shape;
    
    @Test
    public WhenTextShapeAnchored shape_contains_text_and_is_anchored() {
        Assert.assertNotEquals(shape.getText(), "");
        TEXT_ANCHOR.set(shape, SVGAttributeKeys.TextAnchor.MIDDLE);
        Assert.assertNotNull(shape.getAttribute(TEXT_ANCHOR));
        return this;
    }
}
