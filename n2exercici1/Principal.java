package n2exercici1;

import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {

	public static void main(String[] args) {
			
		Persona p1 = new Persona("Marta", 44);
		
		SerialitzarJson s1 = p1.getClass().getAnnotation(SerialitzarJson.class);
        String directori = s1.directori();
			
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonFitxer = gson.toJson(p1); 
		System.out.println(jsonFitxer);
	
		try (PrintWriter pw = new PrintWriter(new File(directori+"persona.json"))){
			pw.write(jsonFitxer);
			System.out.println("Objecte serialitzat a JSON correctament");
						
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
