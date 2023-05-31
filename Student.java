public class Student {

    private String Name;
    private int Age;
    private int Date;

    public Student(String name, int age, int date) {
        Name = name;
        Age = age;
        Date = date;
    }

    public String GetName() {return Name;}
    public int GetAge() {return Age;}
    public int GetDate() {return Date;}

    public String ToString() {
        return Name + " " + Integer.toString(Age) + " " + Integer.toString(Date);
    }

    public static Student Parse(String str) {
        String[] data = str.split(" ");
        if(data.length != 3)
            return new Student("Parse Error", -1, -1);
        return new Student(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
    }
}