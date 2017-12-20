/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexamboilerplate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kemar Golding
 */
public class FinalExamBoilerplate extends Application {
    
    protected Layout pane = new Layout();
    protected int count = 0;
    final int FIRST_NAME = 32;
    final int LAST_NAME = 32;
    
    @Override
    public void start(Stage primaryStage) {
        // Create and register handlers
        pane.btWriteData.setOnAction( e -> writeData() );
        pane.btDisplayData.setOnAction( e -> readAndDisplay() );
        
        Scene scene = new Scene(pane, 330, 140);
        primaryStage.setTitle("Final Exam Template");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /** Write data to file. */
    private void writeData() {
        try (
                // Create a random access file
                RandomAccessFile inout =
                        new RandomAccessFile("App.dat", "rw");
                ) {
            inout.seek(inout.length());
            write(inout);
        } 
        catch (FileNotFoundException ex) {}
        catch (IOException ex) {}
    }
    
    /** Read data from file */
    private void readAndDisplay() {
        try (
                // Create a random access file
                RandomAccessFile inout =
                        new RandomAccessFile("App.dat", "rw");
                ) {
            if (inout.length() > 0) {
                inout.seek(0);
                read(inout);
                System.out.println("Reading data from file!");
                count = 1;
            } else {
                System.out.println("File is empty!");
            }
        }
        catch (IOException ex) {}
    }
    
    private void write(RandomAccessFile inout) throws IOException {
        inout.write(fixedLength(pane.tfOne.getText().getBytes(), FIRST_NAME));
        inout.write(fixedLength(pane.tfTwo.getText().getBytes(), LAST_NAME));
        System.out.println("Name #" + (count + 1) + " saved!"); 
    }
    
    private void read(RandomAccessFile inout) throws IOException {
        int pos;
        byte[] first_name = new byte[FIRST_NAME];
        pos = inout.read(first_name);
        pane.tfOne.setText(new String(first_name));
        
        byte[] last_name = new byte[LAST_NAME];
        pos = inout.read(last_name);
        pane.tfTwo.setText(new String(last_name));
    }
    
    /** Return a byte[] of fixed-length */
    private byte[] fixedLength(byte[] x, int n) {
	byte[] b = new byte[n];
        System.arraycopy(x, 0, b, 0, x.length);
	return b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
