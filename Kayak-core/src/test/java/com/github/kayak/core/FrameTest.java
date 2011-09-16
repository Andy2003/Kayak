/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.kayak.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dsi9mjn
 */
public class FrameTest {

    public FrameTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testFromLogFileNotation() {
        System.out.println("fromLogFileNotation");
        String line = "(1244101432.788973)  can1 040#4B0B000000000000";
        Frame result = Frame.fromLogFileNotation(line);

        assertEquals(1244101432788973L, result.getTimestamp());
        assertEquals(0x40, result.getIdentifier());
    }

    @Test
    public void testFromLogFileNotation2() {
        System.out.println("fromLogFileNotation2");
        String line = "(1244101432.830624) vcan2 7D3#6C00082E36560100";
        Frame result = Frame.fromLogFileNotation(line);

        assertEquals(1244101432830624L, result.getTimestamp());
        assertEquals(0x7d3, result.getIdentifier());
    }

    @Test
    public void testIsExtendedIdentifier() {
        System.out.println("isExtendedIdentifier");
        Frame instance = new Frame(0x456743, new byte[] {});
        boolean result = instance.isExtendedIdentifier();
        assertEquals(true, result);
    }

    @Test
    public void patternTest() {
        System.out.println("patternTest");
        String line = "(1244101432.830624) vcan2 7D3#6C00082E36560100";
        boolean result = Frame.LogFileNotationPattern.matcher(line).matches();
        assertEquals(true, result);
    }
}
