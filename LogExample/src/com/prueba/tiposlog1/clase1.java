package com.prueba.tiposlog1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 
public class clase1 {
	
	private Log log;
	
	public clase1(){
		log = LogFactory.getLog(this.getClass());
		if (log.isDebugEnabled()){
			log.debug("Salida debug desde la clase 1");
		}
		log.error("Salida error desde la clase 1");
	}
}