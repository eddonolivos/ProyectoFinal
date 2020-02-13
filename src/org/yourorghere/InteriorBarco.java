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
public class InteriorBarco {
    GL gl;
    Camarotes camarote;
    Pilares pilar;
    Escaleras escalera;
    Barandillas barandilla;
    Timon timon;
    Agua bandera;


    public InteriorBarco (GL gl){
        this.gl=gl;
        this.camarote = new Camarotes(gl);
        this.pilar= new Pilares(gl);
        this.escalera = new Escaleras(gl);
        this.barandilla = new Barandillas(gl);
        this.timon = new Timon(gl);
        this.bandera = new Agua(gl);
        
    }
    public void DibujaInteriorBarco(){
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        //BASE DEL INTERIOR
        
        gl.glPushMatrix();
        gl.glColor3f(0.4f, 0.5f, 0.1f);
        gl.glTranslatef(0,-2, 0);
        gl.glScalef(8, 1, 12);
        glut.glutSolidCube(1f);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glColor3f(0.6f,0.3f,0.1f);
        gl.glTranslatef(0,-0.5f, -4.7f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glScalef(4, 5, 2);
        glut.glutSolidCube(1f);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f,0.3f,0.1f);
        gl.glTranslatef(0,-0.7f, +4.7f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glScalef(4, 3, 2f);
        glut.glutSolidCube(1f);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.6f,0.3f,0.1f);
        gl.glTranslatef(0,1f, 6f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glScalef(8, 1.5f, 2);
        glut.glutSolidCube(1f);
        gl.glPopMatrix();
//        gl.glPushMatrix();
//        camarote.DibujaCamarotes();
//        gl.glPopMatrix();
        //COMPLEMENTOS DEL INTERIOR
        gl.glPushMatrix();
        gl.glTranslatef(0, 0, 2.55f);
        gl.glScalef(0.3f, 0.5f, 0.3f);
        pilar.DibujaPilar();
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(0, 2, -4.5f);
        gl.glScalef(0.3f, 0.48f, 0.3f);
        pilar.DibujaPilar();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(3.2f, -1.5f, -0.2f);
        gl.glScalef(0.4f, 0.2f, 0.2f);
        escalera.DibujaEscalera(11);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(-3.2f, -1.5f, -0.2f);
        gl.glScalef(0.4f, 0.2f, 0.2f);
        escalera.DibujaEscalera(11);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(1.45f, -1.5f, 1);
        gl.glScalef(0.4f, 0.25f, 0.3f);
        gl.glRotatef(90,1,0,0);
        escalera.DibujaEscalera(8);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(-1.45f, -1.5f, 1);
        gl.glScalef(0.4f, 0.25f, 0.3f);
        gl.glRotatef(90,1,0,0);
        escalera.DibujaEscalera(8);
        gl.glPopMatrix();
              
        gl.glPushMatrix();
        gl.glTranslatef(1.2f, 0.5f, 3.5f);
        gl.glScalef(0.4f, 0.25f, 0.3f);
        gl.glRotatef(90,1,0,0);
        escalera.DibujaEscalera(6);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslatef(3.9f, -1.3f, 3f);
        gl.glScalef(0.7f, 0.7f, 0.7f);
        gl.glRotatef(90, 0, 1, 0);
        barandilla.DibujaEscalera(8);
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(-3.9f, -1.3f, 3f);
        gl.glScalef(0.7f, 0.7f, 0.7f);
        gl.glRotatef(90, 0, 1, 0);
        barandilla.DibujaEscalera(8);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0, 2, 6);
        gl.glRotatef(-90,0,1,0);
        gl.glScalef(0.2f, 0.2f, 0.2f);
        timon.DibujaTimon();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslatef(0, 2, 6);
        gl.glRotatef(-90,0,1,0);
        gl.glScalef(0.2f, 0.2f, 0.2f);
        timon.DibujaTimon();
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glColor3f(0.8f, 1, 0.9f);
        gl.glTranslatef(0,6.2f, 2);
        gl.glScalef(6, 4, 0.3f);
        glut.glutSolidCube(1f);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3f(0.8f, 1, 0.9f);
        gl.glTranslatef(0,8.3f, -4);
        gl.glScalef(6, 4, 0.3f);
        glut.glutSolidCube(1f);
        gl.glPopMatrix();


    }
}
