/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lwjglfx.util;

import java.io.File;

/**
 *
 * @author matth
 */
public class LWJGLUtils {

    public static void bindNativePath() {
        System.setProperty("org.lwjgl.librarypath", new File(new File("target"), "natives").getAbsolutePath());
    }
    
}
