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
public class Escaleras {
     GL gl;

    public Escaleras (GL gl){

        this.gl=gl;
    }
    public void DibujaEscalera(int x){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
         for (int i = 0; i < x; i++) {
            
 if (i%2==0){
        gl.glPushMatrix();
        gl.glColor3f(0.6f,0.3f,0.1f);
        gl.glScalef(4, 1, 1);
        gl.glTranslatef(0, i, -i);
        glut.glutSolidCube(1);
        gl.glPopMatrix();
 } else{
                
        gl.glPushMatrix();
        gl.glColor3f(0.5f, 0.3f, 0.2f);
        gl.glScalef(4, 1, 1);
        gl.glTranslatef(0, i, -i);
        glut.glutSolidCube(1);
        gl.glPopMatrix();
 }


        }

    }
    
}
