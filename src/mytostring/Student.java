package mytostring;

class Student{
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }



    public static void main(String args[]){
        Student s1=new Student(101,"Raj","lucknow");
        Student s2=new Student(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()  mytostring.Student@119d7047  -->Memory Address (not hashcode!!!). Ojo q en muchos tutos dicen que devuelve el hashcode, pero devuelve el address
        System.out.println(s2);//compiler writes here s2.toString()  mytostring.Student@776ec8df  -->Memory Address (not hashcode!!!)

        System.out.println(s1.hashCode()); //aca si devuelve el hashcode
        System.out.println(s2.hashCode());

        Student s3=new Student(102,"Vijay","ghaziabad");
        System.out.println(s3);
        System.out.println(s3.hashCode());



    }
}