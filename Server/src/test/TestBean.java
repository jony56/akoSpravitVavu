package test;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Jednoducha stateless session beana
 */
@Stateless
public class TestBean implements TestBeanRemote {


	
	/**
	 * Biznis logika ktora vrati rozsireny textovy retazec
	 */
    public String testMe(String input) {
    	return "tested " + input;
    }

}
