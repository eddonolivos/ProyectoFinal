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
public class Cabeza{
    Cuernito Cuerno;
    Huesos hueso;
    GL gl;


    public Cabeza (GL gl){
        this.gl=gl;
        this.Cuerno= new Cuernito(gl);
        this.hueso= new Huesos(gl);
        
    }
    public void DibujaCabeza(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        gl.glDepthMask(true);
        GLUquadric quadric1 = glu.gluNewQuadric();
                              //HUESOS
        gl.glPushMatrix();        
        gl.glColor3f(1,1,1);
        gl.glTranslatef(3, 0, -3);
        gl.glRotatef(-45, 0, 0, 1);
        gl.glScalef(1, 1.3f, 1);
        hueso.DibujaHueso();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glColor3f(1,1,1);
        gl.glTranslatef(-3, 0, -3);
        gl.glScalef(1, 1.3f, 1);
        gl.glRotatef(45, 0, 0, 1);
        hueso.DibujaHueso();
        gl.glPopMatrix();
        //CABELLO
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        //gl.glRotatef(0, 0, 1, 0);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        gl.glRotatef(90, 0, 0, 1);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        gl.glRotatef(135, 0, 0, 1);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        gl.glRotatef(45, 0, 0, 1);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        gl.glRotatef(225, 0, 0, 1);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        gl.glRotatef(270, 0, 0, 1);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.5f, 0.0f);
        gl.glScaled(2, 1.5, 1.5);
        gl.glRotatef(315, 0, 0, 1);
        gl.glTranslatef(-0.5f, 1.3f,0);
        Cuerno.DibujaCuernito();     
        gl.glPopMatrix();
        
        //CABEZA BASE
        gl.glPushMatrix();
        gl.glColor3f(1f, 1f, 0.3f);
        glut.glutSolidSphere(3,14,14);
        gl.glPopMatrix();

        //OJOS
        
        gl.glPushMatrix();
        gl.glColor3f(1,1,1);
        gl.glRotatef(15, 0, 1, 0);
        gl.glTranslatef(0.7f, 0.9f, 3);
        glu.gluDisk(quadric1, 0.6, 0.8, 14, 14);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(1,1,1);
        gl.glRotatef(-15, 0, 1, 0);
        gl.glTranslatef(-0.7f, 0.9f, 3);
        GLUquadric quadric2 = glu.gluNewQuadric();
        glu.gluDisk(quadric2, 0.6, 0.8, 14, 14);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0,0,0);
        gl.glRotatef(15, 0, 1, 0);
        gl.glTranslatef(0.7f, 0.9f, 2.9f);
        glu.gluDisk(quadric1, 0, 0.6, 14, 14);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0,0,0);
        gl.glRotatef(-15, 0, 1, 0);
        gl.glTranslatef(-0.7f, 0.9f, 2.9f);
        glu.gluDisk(quadric2, 0, 0.6, 14, 14);
        gl.glPopMatrix();
        
        //DISQUEBOCA*
        gl.glPushMatrix();
        gl.glColor3f(1f, 1f, 0.6f);
        //gl.glRotatef(15, 0, 1, 0);
        gl.glTranslatef(0, -0.3f, 3);
        glu.gluDisk(quadric1, 0, 1, 14, 14);
        gl.glPopMatrix();

        
    }
    
    
}
