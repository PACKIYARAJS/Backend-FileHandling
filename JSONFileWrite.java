package sample1.sample12;
import java.io.*;

import org.json.simple.JSONObject;

public class JSONFileWrite {
	
	public void Writedata() throws Exception{
		
		JSONObject obj = new JSONObject();
		
		obj.put("EmployeeID","1234");
		
		obj.put("NAME","RAM");
		
		obj.put("Country", "INDIA");
		
		FileWriter write = new FileWriter("C:\\Users\\AGASH\\OneDrive\\Desktop\\FILE READ AND WRITE\\text.json",true);
		
		write.write(obj.toJSONString());
		
		write.close();
		
		System.out.println("DONE JSON FILE");
		
	}

	public static void main(String [] args) throws Exception{
		
		new JSONFileWrite().Writedata();
		
	}
}
