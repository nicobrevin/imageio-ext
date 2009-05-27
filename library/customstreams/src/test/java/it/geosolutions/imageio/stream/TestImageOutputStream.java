/*
 *    ImageI/O-Ext - OpenSource Java Image translation Library
 *    http://www.geo-solutions.it/
 *    https://imageio-ext.dev.java.net/
 *    (C) 2007 - 2008, GeoSolutions
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package it.geosolutions.imageio.stream;

import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Simone Giannecchini, GeoSolutions
 */
public class TestImageOutputStream {
    private final static Logger LOGGER = Logger.getLogger(TestImageOutputStream.class.toString());


    public TestImageOutputStream() {
        super();
    }
    @Before
    public void setUp() throws Exception {
        ImageIO.setUseCache(true);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
    }
}
