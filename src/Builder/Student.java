package Builder;

public class Student {
    private String name;
    private String Phonenumber;
    private int age;
    private int grad_year;
    private int psp;
   private Student(String name,String phonenumber,int age,int grad_year,int psp){
       this.name=name;
       this.Phonenumber=phonenumber;
       this.age=age;
       this.grad_year=grad_year;
       this.psp=psp;
   }
   public static Builder builder(){
     return new Builder();

   }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Phonenumber='" + Phonenumber + '\'' +
                ", age=" + age +
                ", grad_year=" + grad_year +
                ", psp=" + psp +
                '}';
    }

    public static  class Builder{
       private String name;
       private  String Phonenumber;
       private  int age;
       private int grad_year;
      private  int psp;

       public Builder name(String name){
           this.name=name;
           return this;
       }
       public Builder Phonenumber(String phonenumber){
         Phonenumber=phonenumber;
           return this;
       }
       public Builder age(int age){
           this.age=age;
           return this;
       }
       public Builder grad_year(int grad_year){
           this.grad_year=grad_year;
           return this;
       }
       public Builder psp(int psp){
           this.psp=psp;
           return this;
       }
       public void validate(){
           if(this.name==null){
               throw new NameNotFoundException();
           }
           if(this.grad_year>2023){
               throw new gradYearNotValidException();
           }
           if(this.Phonenumber==null){
               throw new PhoneNumberNotFoundException();
           }
       }
       public Student build(){//return type is Student object
           validate();
           return new Student(this.name,this.Phonenumber,this.age,this.grad_year,this.psp);
       }


   }

}
