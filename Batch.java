import java.lang.*;
import java.time.LocalDateTime;
public class Batch {
    private int batchcode;
    private String courseName;
     private LocalDateTime startDate;
     private int studentcount;
     private LocalDateTime time;
     private int days;
     private static int totalnumberofbadges;

     public void setBatchcode(int batchcode) {
         this.batchcode = batchcode;
     }
     public void setCourseName(String courseName) {
         this.courseName = courseName;
     }
     public void setStartDate(LocalDateTime startDate) {
         this.startDate = startDate;
     }
     public void setStudentcount(int studentcount) {
         this.studentcount = studentcount;
     }
     public void setTime(LocalDateTime time) {
         this.time = time;
     }
     public void setDays(int days) {
         this.days = days;
     }
     public static void setTotalnumberofbadges(int totalnumberofbadges) {
         Batch.totalnumberofbadges = totalnumberofbadges;
     }
     public int getBatchcode() {
         return batchcode;
     }
     public String getCourseName() {
         return courseName;
     }
     public int getDays() {
         return days;
     }
     public LocalDateTime getStartDate() {
         return startDate;
     }
     public int getStudentcount() {
         return studentcount;
     }
     public LocalDateTime getTime() {
         return time;
     }
     public static int getTotalnumberofbadges() {
         return totalnumberofbadges;
     }
     public static void main(String[] args) {
        Batch s2 = new Batch();
        Batch s3 = new Batch();
        s2.setBatchcode(4200);
        s2.setCourseName("CAO");
        Batch.setTotalnumberofbadges(5);
        System.out.println(s2.getCourseName());
        System.out.println(s2.getTotalnumberofbadges());
        
        System.out.println(s3.getTotalnumberofbadges());
     }
}
// totalnumberofbadges static isliye hai, taake yeh har object ke liye common ho Kyu kai static class sai belong karta hai 
// to class mai save kardi ap har object mai same hi dekhaiga 