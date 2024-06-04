import java.util.Date;

public class Student {
    String name;
    int age;
    String classNm;
    String gen;
    Date birth;

    public Student() { }

    public Student(String name, int age, String classNm, String gen, Date date) { 
        this.name = name;
        this.age = age;
        this.classNm = classNm;
        this.gen = gen;
        this.birth = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassNm(String classNm) {
        this.classNm = classNm;
    }

    public void setGende(String gen) {
        this.gen = gen;
    }

    public void setDate(Date birth) {
        this.birth = birth;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return  this.age;
    }

    public String geGende() {
        return this.gen;
    }    

    public String getClassNm() {
        return  this.classNm;
    }

    public Date getDate() {
        return this.birth;
    }
}
