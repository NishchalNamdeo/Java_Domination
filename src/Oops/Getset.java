//package Oops;
//
//import javax.xml.crypto.Data;
//import java.util.Objects;
//
//public class Getset {
//    private  String name;
//    private  int rollno;
//    private  String CollgName;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//
//    public void setCollgName(String collgName) {
//        CollgName = collgName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    public String getCollgName() {
//        return CollgName;
//    }
//
//
////  do ka kam check krna do obj same ya ni and true false return krna - equal, hashcode
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Getset getset = (Getset) o;
//        return rollno == getset.rollno && Objects.equals(name, getset.name) && Objects.equals(CollgName, getset.CollgName);
//    }
//
////Data ke basis pe generate, hashcode - int generate
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rollno, CollgName);
//    }
//
//    @Override
//    public String toString() {
//        return "Getset{" +
//                "name='" + name + '\'' +
//                ", rollno=" + rollno +
//                ", CollgName='" + CollgName + '\'' +
//                '}';
//    }
//
//    public Getset (String name, int rollno, String CollName){
//        this.name = name;
//        this.rollno = rollno;
//        this.CollgName = CollName;
//    }
//}
