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
public class Pilares {
    GL gl;

    public Pilares (GL gl){

        this.gl=gl;
    }
    public void DibujaPilar(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        //gl.glDepthMask(true);

               
        gl.glPushMatrix();
        gl.glColor3f(0.3f, 0.1f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(2, 3.5, 12, 12);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0, 0, 0);
        gl.glTranslatef(0, 1, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(2, 1, 12, 12);
        gl.glPopMatrix();

        for (int i = 0; i < 8; i++) {
            gl.glPushMatrix();
            gl.glColor3f(1, 1, 0);
            gl.glRotatef((float) (i*45), 0, 1,0);
            gl.glTranslatef(0, 0.5f, 2);
            glut.glutSolidSphere(0.2, 5, 5);
            gl.glPopMatrix();
        }
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(0, 1.5f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(1.8, 0.5f, 12, 12);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.3f, 0.1f, 0);
        gl.glTranslatef(0, 4.85f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(1.8, 3.3, 12, 12);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(0, 5.35f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(1.6, 0.5f, 12, 12);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.3f, 0.1f, 0);
        gl.glTranslatef(0, 8.7f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(1.6, 3.3, 12, 12);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0, 0, 0);
        gl.glTranslatef(0, 9.2f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(1.4, 0.5f, 12, 12);
        gl.glPopMatrix();
               
        for (int i = 0; i < 8; i++) {
            gl.glPushMatrix();
            gl.glColor3f(1, 1, 0);
            gl.glRotatef((float) (i*45), 0, 1,0);
            gl.glTranslatef(0, 9f, 1.4f);
            glut.glutSolidSphere(0.2, 5, 5);
            gl.glPopMatrix();
        }
                
        gl.glPushMatrix();
        gl.glColor3f(0.3f, 0.1f, 0);
        gl.glTranslatef(0, 17.23f, 0);
        gl.glRotatef(90, 1, 0,0);
        glut.glutSolidCylinder(1, 8, 12, 12);
        gl.glPopMatrix();
    }
}

