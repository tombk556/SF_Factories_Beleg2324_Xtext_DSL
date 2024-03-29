/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.Infinitiv;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Nutzen;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
	@Check
	public void checkNutzenVerb(Nutzen nutzen) {
		String my_verb = nutzen.getVerb();
		if (my_verb.startsWith("zu")) {															// wenn Verb mit "zu" beginnt
			String restOfString =my_verb.substring(2);
			if (!restOfString.contains("zuzu")) {													// "zuzu" fehlt
				error("Zu wenig 'zu' oder 'zu' an falscher Stelle!!!", MyDslPackage.Literals.NUTZEN__VERB);
			}	else {  																			// "zuzu" vorhanden
				String restString = restOfString.substring(restOfString.indexOf("zuzu")+4);
				String beforeString = restOfString.substring(0, restOfString.indexOf("zuzu"));
				if (restString.contains("zu") | beforeString.contains("zu"))							// insgesamt mehr als 3 zu im Wort
					error("Zu viel 'zu'!", MyDslPackage.Literals.NUTZEN__VERB);
			}
		}else {																				// wenn Verb nicht mit "zu" beginnt
			error("Verb muss mit 'zu' beginnen!", MyDslPackage.Literals.NUTZEN__VERB);
		}
		if (!my_verb.endsWith("n"))															// Endung auf "n"
			error("Infinitive enden auf '-en', '-ern', '-eln', also auf 'n'!", MyDslPackage.Literals.NUTZEN__VERB);

	}
	@Check
	public void checkInfinitiv(Infinitiv infinitiv) {
		String my_word = infinitiv.getWord();
		if (!my_word.endsWith("n"))															// Endung auf "n"
			error("Infinitive enden auf '-en', '-ern', '-eln', also auf 'n'!", MyDslPackage.Literals.INFINITIV__WORD);	
	}

}