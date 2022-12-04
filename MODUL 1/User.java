public class User {

    String name;
    int no;

    public void setName(String name){
        this.name = name;
    }

    public void setNo(int no){
        this.no = no;
    }

    public void Register(){
        System.out.println("Register Success");
        System.out.println("Nama: "+name);
        System.out.println("Phone Number: "+no);
    }
}
