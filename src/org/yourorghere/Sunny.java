package org.yourorghere;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import com.sun.opengl.util.Animator;
import com.sun.opengl.util.GLUT;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * Sunny.java
 */
public class Sunny implements GLEventListener, KeyListener {
    static float pX=0,pY=0,pZ=0,
            a=0,s=0,d=0,
            ang1=0,ang2=0;
    static int aux;
    Barco barco;
    Ejes ejes;
    Agua agua;
    AletaTiburon aleta;
    Cuernito aletamovil;

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Sunny());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);
        

        // Setup the drawing area and shading mode
        this.barco = new Barco(gl);
        this.ejes = new Ejes(gl);
        this.agua = new Agua(gl);
        this.aleta = new AletaTiburon(gl);
        this.aletamovil = new Cuernito(gl);
        
        gl.glClearColor(0.0f, 0.8f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        addKeyListener(this);
        drawable.addKeyListener(this);
    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) { // avoid a divide by zero error!
            height = 1; 
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        //gl.glOrtho(-10, 10, -10, 10, -100, 100);
        glu.gluPerspective(45.0f, h, 1.0, 300);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu= new GLU();
        GLUT glut=new GLUT();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
                gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glTexEnvi(gl.GL_TEXTURE_ENV,gl.GL_TEXTURE_ENV_MODE, gl.GL_DECAL);


        
        if (aux == 1) {
            glu.gluLookAt(16,16, 16, 0, 0, 0, 0, 1, 0);
        }
        if (aux == 2) {

             glu.gluLookAt(5,-0.5f,(float) 2*Math.cos(ang2), 0, 0, 0, 0, 1, 0);
           //glu.gluLookAt((radio * Math.sin(angulo)), 1, (radio * Math.cos(angulo)), 0, 0, 0, 0, 1, 0);
        }
        if (aux == 3) {

            glu.gluLookAt(a,1.5f+s,5+d, a,s,d, 0, 1, 0);
        }
        //CAMARA CENITAL
        if (aux == 4) {

            glu.gluLookAt(13*Math.cos(ang2),2,13*Math.sin(ang2), 0, 0, 0, 0, 1, 0);
        }
        if (aux == 5) {

            glu.gluLookAt(pY*Math.cos(ang2),2,pY*Math.sin(ang2), 0, 0, 0, 0, 1, 0);
        }
        if (aux ==6){
            glu.gluLookAt(pX,pY,pZ, 0, 0, 0, 0, 1, 0);
        }

        ang2=ang2+0.1f;
        
        gl.glPushMatrix();
        gl.glScalef(0.2f,0.2f,0.2f);
        agua.DibujaAgua(-15,15,-4,-3,-15,15);
        gl.glPopMatrix();
        gl.glFlush();

        gl.glPushMatrix();
        gl.glRotated(1.2*Math.sin(ang1),1,0,0);
        gl.glRotated(2*Math.sin(-ang1),0,0,1);
        gl.glTranslated(0,0.1*Math.sin(-ang1/2),0);
        gl.glScalef(0.2f,0.2f,0.2f);
        barco.DibujaBarco();
        gl.glPopMatrix();
        ang1=ang1+0.6f;
        
//                
//
        gl.glPushMatrix();
        aleta.DibujaAletaTiburon();
        gl.glPopMatrix();
                
        gl.glPushMatrix();
        gl.glTranslatef(a,-0.5f+s,2+d);
        gl.glScalef(0.2f/4,0.6f/4,1.2f/4);
        aletamovil.DibujaCuernito();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glColor3f(1, 1, 1);
        ejes.DibujaEjes();
        gl.glPopMatrix();
//        

    }
public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_A){
           a -= 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_R){
           s -= 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_W){
           d -= 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_D){
           a += 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_F){
           s += 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_S){
           d += 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
           pX += 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_UP){
           pY += 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
           pY += -0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            pX += -0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_U){
            pZ += 0.3f;                      
        }
        if(e.getKeyCode()== KeyEvent.VK_J){
            pZ += -0.3f;                      
        }     
        if (e.getKeyCode() == KeyEvent.VK_1) {
            aux= 1;

        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            aux = 2;

        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            aux = 3;

        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            aux = 4;

        }
        if (e.getKeyCode() == KeyEvent.VK_5) {
            aux = 5;

        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            aux = 6;

        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            aux = 7;

        }
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

