package com.prueba.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

public class EjemploLog {

	public static void main(String[] args) {
		// Cargamos la configuración de Log4J desde un archivo accesible via CLASSPATH
		DOMConfigurator.configure(EjemploLog.class.getClassLoader().getResource("configuracionLog.xml"));
		
		// Obtenemos el Log para esta clase.
		Log log = LogFactory.getLog(EjemploLog.class);
		
		// Por motivos de eficiencia, siempre se debería preguntar si está activado el log para este nivel.
		if (log.isDebugEnabled()){
			log.debug("Salida DEBUG desde la clase EjemploLog");
		}
		
		log.error("Salida ERROR desde la clase EjemploLog");
		
		// Instanciamos los objetos necesarios para este ejemplo
		new com.prueba.tiposlog1.clase1();
		new com.prueba.tiposlog2.clase2();
	}
}