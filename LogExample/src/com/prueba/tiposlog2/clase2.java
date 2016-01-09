package com.prueba.tiposlog2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 

public class clase2 {
	private Log log;
	
	public clase2(){
		log = LogFactory.getLog(this.getClass());
		if (log.isDebugEnabled()){
			log.debug("Salida debug desde la clase 2");
		}
		log.error("Salida error desde la clase 2");
	}
}