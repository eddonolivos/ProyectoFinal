/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author victo
 */
public class Agua {
    GL gl;
    private float ang=0;

    public Agua (GL gl){
        this.gl=gl;
    }
    public void DibujaAgua(int x1,int x2, int y1, int y2, int z1, int z2){
         GLU glu= new GLU();
        GLUT glut=new GLUT();
        gl.glDepthMask(true);
        
        for (int i = x1; i < x2; i++) {
            for (int j = z1; j < z2; j++) {        
        gl.glColor3f(0,0.4f, (float) Math.random()*1+0.7f);
        for (int k = y1; k < y2; k++) {
        gl.glPushMatrix();        
        gl.glTranslatef(i,k+(float) Math.sin(ang)*0.6f, j);
        glut.glutSolidSphere(0.6, 10, 10);
//        gl.glColorf(0,0,0);
//        glut.glutWireSphere(0.6, 10, 10);
        gl.glPopMatrix(); 
                }
            }
            ang=ang+0.6f; 
        }
    }
}
