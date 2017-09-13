/**
 * Created by chaegley on 9/13/17.
 */
package example.chaegley.studentlist;

public class Student {
    private String name;
    private int gradYear;
    private String major;

    public Student(){
        name = "default name";
        gradYear = 2018;
        major = "Computer Science";
    }

    public String getName(){
        return name;
    }

    public int getGradYear(){
        return gradYear;
    }

    public String getMajor(){
        return major;
    }

    public void setName(String n){
        name = n;
    }

    public void setGradYear(int y){
        gradYear = y;
    }

    public void setMajor(String m){
        major =  m;
    }
}
