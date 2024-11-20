package Prototype;

public class Prototypemain {
    public static void main(String[] args) {
     Student feb2023=new Student("A2023","Sandeep",90);

//     Student Arshad=feb2023.clone();
//     Arshad.setName("Arshad");
//     Arshad.setEmail("acp@gmail.com");
//     Arshad.setPhonenumber("1234");
//
//     System.out.println(feb2023);
//     System.out.println(Arshad);

       Student prototype1=new Student("A2024","Naman",95);
        Student prototype2=new Student("A2025","Anshuman",98);
        Student prototype3=new Student("A2026","Adithya",80);
       Registry rg=new Registry();
       rg.add(prototype1);
       rg.add(prototype2);
       rg.add(prototype3);
       Student sandeep=rg.get("A2024").clone();//.clone will create deep copy
       //adding sandeep to  batchA2024 copy(template)
       sandeep.setName("Sandeep sinha");
       sandeep.setEmail("sandeep@gmail.com");
       sandeep.setPhonenumber("34566");

        Student ragav=rg.get("A2026").clone();
        ragav.setName("ragav sinha");
        ragav.setEmail("ragav@gmail.com");
        ragav.setPhonenumber("000000");

        Student cp=rg.get("A2024").clone();
        cp.setName("cp");
        cp.setEmail("cp@gmail.com");
        cp.setPhonenumber("1233445566");
        System.out.println(sandeep);
        System.out.println(ragav);
        System.out.println(cp);
    }


}
