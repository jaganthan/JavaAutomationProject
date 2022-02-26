package org.maptask;
import java.util.*;
import java.util.Map.Entry;
public class Question7 {
	
	public static void main(String[] args) {
		
		Map<String,String> p = new LinkedHashMap<String,String>();
		
		p.put("stdId","5478");
		p.put("stdName", "Jaganathan");
		p.put("Address", "136,thirumalivasan, nagar ch - 62");
		p.put("stdPhone", "9445733468");
		p.put("doB", "25-03-1995");
		p.put("eMail", "manijagan2595@gmail.com");
		p.put("gender", "Male");
		
		Set<Entry<String,String>> x = p.entrySet();
		for (Entry<String,String> i : x)
		{
			System.out.println(i.getKey()+ " : " + i.getValue());
			
		}
		
		
	}

}


