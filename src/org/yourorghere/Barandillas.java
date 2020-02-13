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
public class Barandillas {
     GL gl;

    public Barandillas (GL gl){

        this.gl=gl;
    }
    public void DibujaEscalera(int x){
        GLUT glut=new GLUT();
            
    for (int i = 0; i < x; i++) {
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.9f, 0.8f);
        gl.glScalef(1, 4, 1);
        gl.glTranslatef(i, 0, 0);
        glut.glutSolidCube(0.3f);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 1, 1);
        gl.glTranslatef(i+0.5f,0.4f, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glScalef(4, 1, 1);
        glut.glutSolidCube(0.2f);
        gl.glPopMatrix();
        
        }
    }
    
}
