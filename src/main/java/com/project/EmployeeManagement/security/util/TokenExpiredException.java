// package com.project.EmployeeManagement.security.util;

// public class TokenExpiredException {
    
// }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.EmployeeManagement.security.util;

/**
 *
 * @author nirmal
 */
public class TokenExpiredException extends IllegalArgumentException {

    public TokenExpiredException(String s) {
        super(s);
    }

    public TokenExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
