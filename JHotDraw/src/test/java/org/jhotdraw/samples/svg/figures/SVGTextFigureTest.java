/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.Graphics2D;
import java.awt.Shape;
import junit.framework.Assert;
import static org.jhotdraw.samples.svg.SVGAttributeKeys.TEXT_ANCHOR;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Sebas
 */
public class SVGTextFigureTest {
    SVGTextFigure instance;

    @Before
    public void setUp(){
        System.out.println("Setting up test class");
        instance = new SVGTextFigure();
    }
    
    @After
    public void tearDown(){
        System.out.println("Tearing down test class");
        instance = null;
    }
    
    /**
     * Test of isEmptyText method, of class SVGTextFigure.
     */
    @Test
    public void testIsEmptyText() {
        System.out.println("* SVGTextFigureTest: test method 1 - testIsEmptyText()");
        
        String blank = "";
        String nText = null;
        String numText = "-11";
        String symbText = "<@€$[€£@$£$£€{{[{[][{}€$£@";
        
        assertEquals(instance.isEmptyText(blank), true);
        assertEquals(instance.isEmptyText(nText), true);
        assertEquals(instance.isEmptyText(numText), false);
        assertEquals(instance.isEmptyText(symbText), false);
    }

    /**
     * Test of getTextShape method, of class SVGTextFigure.
     */
    @Test
    public void testGetTextShape() {
        Shape shape = instance.getTextShape();
        assertNotNull(shape);
        
        assertTrue(shape.getBounds().height > 0);
        assertFalse(shape.getBounds().height < 0);
        
        assertNotNull(TEXT_ANCHOR.get(instance));
    }
    
}
