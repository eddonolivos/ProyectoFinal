/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author victo
 */
public class Ejes {
    GL gl;

    public Ejes (GL gl){
        this.gl=gl;
    }
     public void DibujaEjes(){
                 GLU glu= new GLU();
        GLUT glut=new GLUT();
        
        gl.glPushMatrix();
        gl.glBegin(gl.GL_LINES);
        gl.glColor3f(1, 0, 0);
        gl.glVertex3f(-10, 0, 0);
        gl.glVertex3f(10, 0, 0);
        gl.glEnd();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glBegin(gl.GL_LINES);
        gl.glColor3f(0, 1, 0);
        gl.glVertex3f(0, -10, 0);
        gl.glVertex3f(0, 10, 0);
        gl.glEnd();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glBegin(gl.GL_LINES);
        gl.glColor3f(0, 0, 1);
        gl.glVertex3f(0, 0, -10);
        gl.glVertex3f(0, 0, 10);
        gl.glEnd();
        gl.glPopMatrix();
        
         
     }
    
}
