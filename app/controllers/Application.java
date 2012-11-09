package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void handlesession(String user)
    {
    	String key=session.getId();
    	String value=user;
    	session.put(key,value);
    	System.out.println("Session created for"+session.get(value)+" is mapped to"+session.getId());
    	render();
    }

    public static void removesession()
    
    {
    	String key=session.getId();
    	//String value=user;
    	//System.out.println("Session created for "+session.get(value)+" mapped to"+session.getId()+" is deleted sucessfully");
    	System.out.println(" mapped to"+session.getId()+" is deleted sucessfully");
    	session.remove(key);
    	render();
    }
}