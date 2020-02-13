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
public class Barco {
    GL gl;
    Cabeza cabeza;
    Caparazon caparazon;
    InteriorBarco interior;


    public Barco (GL gl){
        this.gl=gl;
        this.cabeza=new Cabeza(gl);
        this.caparazon=new Caparazon(gl);
        this.interior=new InteriorBarco(gl);
        
    }
    public void DibujaBarco(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        gl.glDepthMask(true);


        
        gl.glPushMatrix();
        gl.glScaled(1.2f, 1f, 1.2f);
        caparazon.DibujaCaparazon();
        gl.glPopMatrix();  
        
         gl.glPushMatrix();
        gl.glTranslatef(0, 2, 0);
        gl.glScaled(1, 1, 1);
        interior.DibujaInteriorBarco();
        gl.glPopMatrix();       
        
        gl.glPushMatrix();
        gl.glTranslatef(0,2.5f,11.8f);
        gl.glScalef(0.5f, 0.5f, 0.5f);
        cabeza.DibujaCabeza();
        gl.glPopMatrix();
    }
    
}
