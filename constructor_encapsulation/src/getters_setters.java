
class Launch
{ private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.age=age;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class getters_setters {
    public static void main(String[]args)
    {
Launch obj=new Launch();
obj.setAge(34);
obj.setName("Rohan");
String name=obj.getName();
int age=obj.getAge();
System.out.println(age+ " "+ name);
    }
}
