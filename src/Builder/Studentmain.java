package Builder;

public class Studentmain {
   public static void main(String[] args){
       Student s=Student.builder()
               .name("abcd")
               .Phonenumber("12345")
               .grad_year(2020)
               .age(20)

               .psp(60)
               .build();
       System.out.println(s);
   }

}
