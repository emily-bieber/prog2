package aufgaben.aufgabe7;

public class Student implements Listener
{
	private String name;
	private Publisher publisher;
	
	public Student(String name)
	{
		this.name = name;
	}

	@Override
	public void update() 
	{
		String msg = this.publisher.getUpdate(this);
		System.out.println(this.name + " received " + msg);
	}

	@Override
	public void setPublisher(Publisher publisher) 
	{
		this.publisher = publisher;
		if (this.publisher.register(this))
		{
			System.out.println(this.name + " successfully registered!");
		}
	}

	@Override
	public void removePublisher(Publisher publisher) 
	{
		this.publisher = publisher;
		if (this.publisher.unregister(this))
		{
			System.out.println(this.name + " successfully deregistered!");
		}
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other == null) return false;
		if (this == other) return true;
		if (this.getClass() != other.getClass()) return false;
		
		Student otherStudent = (Student)other;
		return (this.name.equals(otherStudent.name));
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}

}
