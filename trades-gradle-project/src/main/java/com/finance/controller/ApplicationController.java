/**
 * 
 */
package com.finance.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Supriya
 *
 */
@Controller
public class ApplicationController {
 
	@RequestMapping(value="/", method= RequestMethod.GET)
    public String welcome() throws IOException {

        System.out.println("Inside GET in Application Controller");

        return "index";
    }
	
 
}
