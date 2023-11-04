package test.api;

public class Response {
	int id;
	String name;
	public Response(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
	}
	public Response(int id) {
		this.id=id;
		System.out.println("id:"+id);
	}
	
	public Response() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}