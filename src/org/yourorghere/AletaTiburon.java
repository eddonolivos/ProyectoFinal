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
public class AletaTiburon {
    static double ang;
     GL gl;
     Cuernito aleta;

    public AletaTiburon (GL gl){
        this.gl=gl;
        this.aleta = new Cuernito(gl);
    }
    public void DibujaAletaTiburon(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        
        gl.glPushMatrix();
        gl.glColor3f(0, 0.1f, 0.7f);
        gl.glTranslatef(5,-0.5f,(float) (2*Math.cos(ang)));
        gl.glScalef(0.2f/4,0.6f/4,1.2f/4);
        gl.glRotatef((float) ang, 0, 1, 0);
        aleta.DibujaCuernito();
        gl.glPopMatrix();
        ang+=0.1f;
        }
}
