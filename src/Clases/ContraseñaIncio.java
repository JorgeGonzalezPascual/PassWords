/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Jorge
 */
public class ContraseñaIncio implements Serializable{

    private String password;

    public ContraseñaIncio(String p) {
        this.password = coding(p);
    }

    private String coding(String s) {
        //coding data using BASE64
        return DatatypeConverter.printBase64Binary(s.getBytes());
    }

    private String decoding(String encoded) {
        //decoding data using BASE64
        return new String(DatatypeConverter.parseBase64Binary(encoded));
    }

    public String getPassword() {
        return decoding(password);
    }
   
}
