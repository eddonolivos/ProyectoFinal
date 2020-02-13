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
public class Cuernito {
    GL gl;

    public Cuernito (GL gl){

        this.gl=gl;
    }
    public void DibujaCuernito(){

        //CUADRADO BASE (2 CUADRADOS Y UN TRIÁNGULO EN TOTAL)
        //BASE INFERIOR
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 0, 0);
        gl.glVertex3f(1, 0, 0);
        gl.glVertex3f(1, 1, 0);
        gl.glVertex3f(0, 1, 0);
        gl.glEnd();
        
        //LADOS
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 0, 0);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(0, 1, 1);
        gl.glVertex3f(0, 0, 1);
        gl.glEnd();
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 0, 0);
        gl.glVertex3f(1, 0, 0);
        gl.glVertex3f(1, 1, 0);
        gl.glVertex3f(0, 1, 0);
        gl.glEnd();
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(1, 0, 0);
        gl.glVertex3f(1, 1, 0);
        gl.glVertex3f(1, 1, 1);
        gl.glVertex3f(1, 0, 1);
        gl.glEnd();
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 0, 1);
        gl.glVertex3f(1, 0, 1);
        gl.glVertex3f(1, 1, 1);
        gl.glVertex3f(0, 1, 1);
        gl.glEnd();
        
        //CUADRADO DE LA MITAD
        
        //LADOS
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(0, 1, 1);
        gl.glVertex3f(0, 2, 1.5f);
        gl.glVertex3f(0, 2,0.5f);
        gl.glEnd();
        
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(1, 1, 0);
        gl.glVertex3f(1, 1, 1);
        gl.glVertex3f(1, 2, 1.5f);
        gl.glVertex3f(1, 2,0.5f);
        gl.glEnd();
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(1, 1, 0);
        gl.glVertex3f(1, 2, 0.5f);
        gl.glVertex3f(0, 2,0.5f);
        gl.glEnd();
                
        gl.glBegin(gl.GL_QUADS);
        gl.glVertex3f(0, 1, 1);
        gl.glVertex3f(1, 1, 1);
        gl.glVertex3f(1, 2, 1.5f);
        gl.glVertex3f(0, 2, 1.5f);
        gl.glEnd();
        
        //PIRÁMIDE DE LA PUNTA 
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glVertex3f(0, 2, 0.5f);
        gl.glVertex3f(0, 2, 1.5f);
        gl.glVertex3f(0.5f, 3, 2);
        gl.glEnd();

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glVertex3f(1, 2, 0.5f);
        gl.glVertex3f(1, 2, 1.5f);
        gl.glVertex3f(0.5f, 3, 2);
        gl.glEnd();
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glVertex3f(0, 2, 0.5f);
        gl.glVertex3f(1, 2, 0.5f);
        gl.glVertex3f(0.5f, 3, 2);
        gl.glEnd();
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glVertex3f(0, 2, 1.5f);
        gl.glVertex3f(1, 2, 1.5f);
        gl.glVertex3f(0.5f, 3, 2);
        gl.glEnd();


    }


}
