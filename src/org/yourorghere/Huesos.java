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
public class Huesos {
     GL gl;

    public Huesos (GL gl){

        this.gl=gl;
    }
    public void DibujaHueso(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        gl.glDepthMask(true);
        gl.glPushMatrix();
        //gl.glScalef(0.08f, 1.6f, 1.6f);
        //gl.glTranslatef(50,0,0);
        gl.glRotatef(90, 1, 0, 0);
        glut.glutSolidCylinder(0.8f, 10, 14, 14);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f,0.8f,0);
        glut.glutSolidSphere(1, 14, 14);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(0.5f,0.8f,0);
        glut.glutSolidSphere(1, 14, 14);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f,-9.8f,0);
        glut.glutSolidSphere(1, 14, 14);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(0.5f,-9.8f,0);
        glut.glutSolidSphere(1, 14, 14);
        gl.glPopMatrix();
    }
}
