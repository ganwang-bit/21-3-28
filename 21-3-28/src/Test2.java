import java.util.Arrays;
class Student implements Cloneable{
    private String name ;
    private int age;
    private int score;
    Student(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score=score;
    }
    public String toString(){
        return name+" "+age+" "+score;
    }

}
public class Test2 {
    public static void main(String[] args){
        Student[] students ={new Student("1",2,3),
                             new Student("2",3,4),
                             new Student("3",4,5)};
        System.out.println(Arrays.toString(students));
    }
}
