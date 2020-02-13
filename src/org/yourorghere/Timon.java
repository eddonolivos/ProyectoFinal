/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;

/**
 *
 * @author victo
 */
public class Timon {
    GL gl;

    public Timon (GL gl){

        this.gl=gl;
    }
    public void DibujaTimon(){
        GLUT glut=new GLUT(); 
        //BASE DEL TIMON
        gl.glPushMatrix();
        gl.glColor3f(0.4f, 0.2f, 0.2f);
        gl.glScalef(2.5f, 0.5f, 2.5f);
        glut.glutSolidCube(1);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.3f, 0.1f, 0.1f);
        //gl.glTranslatef(0,0.5f,0);
        gl.glRotatef(-90, 1, 0, 0);
        glut.glutSolidCylinder(1, 4, 9, 9);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0);
        gl.glTranslatef(0,4f,0);
        gl.glRotatef(-90, 1, 0, 0);
        glut.glutSolidCylinder(1, 0.3f, 9, 9);
        gl.glPopMatrix();
        
        for (int i = 0; i < 10; i++) {
        
        gl.glPushMatrix();
        gl.glColor3f(0.4f, 0.2f, 0);
        gl.glTranslatef(-0.4f,4.5f,0);
        gl.glRotatef(i*45, 1, 0, 0);
        glut.glutSolidCylinder(0.3, 3f, 7, 7);
        gl.glPopMatrix();
        
        }
        

    }

}
