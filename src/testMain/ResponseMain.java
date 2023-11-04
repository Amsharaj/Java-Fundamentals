package testMain;


import test.api.*;
import java.util.ArrayList;

public class ResponseMain {
	public static void main(String[] args) {
	ArrayList<Response> al=new ArrayList<>();
	
		Response r= new Response();	
		Response rr = new Response(2, "santho");
		
		r.setId(1);
		r.setName("madhu");

		
		al.add(new Response(2125,"sara"));
		System.out.println("second constructor:");
		al.add(new Response(2125));
		al.add(r);
		al.add(rr);
		al.add(new Response(34, "test"));
		
		al.add(3, new Response());
		
		
		
	}

}
