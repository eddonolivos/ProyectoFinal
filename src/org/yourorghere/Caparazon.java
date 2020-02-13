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
public class Caparazon {
    GL gl;

    public Caparazon (GL gl){

        this.gl=gl;
    }
    public void DibujaCaparazon(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        gl.glDepthMask(true);
        
        //ESTA ES LA BASE DONDE SE DIBUJARA EL BARCO
//        gl.glPushMatrix(); 
//        gl.glColor3f(0,0.4f,1);
//        gl.glTranslatef(0,-3,0);
////        gl.glRotatef(45, 0, 1, 0);
//        gl.glScalef(4, 0.08f, 7);
//        glut.glutSolidCube(3);
//        gl.glPopMatrix();
        
        //AQUI DIBUJAMOS LA PARTE EXTERIOR DEL BARCO, LA CARCASA
        
        //PRIMERA CAPA
        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(4,0.75f,0);
        gl.glScalef(0.08f, 1, 4);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(-4,0.75f,0);
        gl.glScalef(0.08f, 1, 4);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(0,0.75f,8.05f);
        gl.glScalef(1, 1, 0.08f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(0,0.75f,-8);
        gl.glScalef(1.7f, 1, 0.08f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(2.75f,0.75f,7);
        gl.glRotatef(45, 0, 1, 0);
        gl.glScalef(1.1f, 1, 0.08f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(-2.75f,0.75f,7);
        gl.glRotatef(-45, 0, 1, 0);
        gl.glScalef(1.1f, 1, 0.08f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(3.275f,0.75f,-7);
        gl.glRotatef(-45, 0, 1, 0);
        gl.glScalef(0.8f, 1, 0.08f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(-3.275f,0.75f,-7);
        gl.glRotatef(45, 0, 1, 0);
        gl.glScalef(0.8f, 1, 0.08f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
        
        //SEGUNDA CAPA
        
        
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(-3.2f,-1.4f,0);
        gl.glRotatef(45, 0, 0, 1);
        gl.glScalef(0.08f, 1.4142f/2, 4f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(3.2f,-1.4f,0);
        gl.glRotatef(-45, 0, 0, 1);
        gl.glScalef(0.08f, 1.4142f/2, 4f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(-1.6f,-2.5f,0);
        gl.glRotatef(63.43495f, 0, 0, 1);
        gl.glScalef(0.08f, 0.6f, 4f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix(); 
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(1.6f,-2.5f,0);
        gl.glRotatef(-63.43495f, 0, 0, 1);
        gl.glScalef(0.08f, 0.6f, 4f);
        glut.glutSolidCube(3);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.3f, 0);
        gl.glTranslatef(0,-2,0);
        gl.glScalef(2, 1, 3);
        glut.glutSolidCube(3);
        gl.glPopMatrix();




    }

}
