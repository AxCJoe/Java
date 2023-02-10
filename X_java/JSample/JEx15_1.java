package JSample;

import java.util.ArrayList;



    public class JEx15_1 {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("佐藤 純一", 1));
            students.add(new Student("田中 太郎", 2));
    
            for (Student student : students) {
                System.out.println("番号: " + student.getNumber() + " 名前: " + student.getName());
            }
        }
    }

class Student {
    //  名前
    private String name;
    //  番号
    private int number;
    //コンストラクタ
    public Student(String name,int number){
        this.name = name;
        this.number = number;
    }
    //  名前の取得
    public String getName() {
        return name;
    }
    //  名前のセット
    public void setName(String name) {
        this.name = name;
    }
    //  番号の取得
    public int getNumber() {
        return number;
    }
    //  番号のセット
    public void setNumber(int number) {
        this.number = number;
    }
}
