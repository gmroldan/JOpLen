/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joplen.exceptions;

/**
 *
 * @author martin
 */
public class JOpLenException extends Exception {

    /**
     * Creates a new instance of <code>JOpLenException</code> without detail
     * message.
     */
    public JOpLenException() {
    }

    /**
     * Constructs an instance of <code>JOpLenException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public JOpLenException(String msg) {
        super(msg);
    }

    public JOpLenException(Throwable cause) {
        super(cause);
    }

    public JOpLenException(String message, Throwable cause) {
        super(message, cause);
    }    
}
