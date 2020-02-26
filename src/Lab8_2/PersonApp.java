package Lab8_2;

public class PersonApp {

    public static void main(String[] args) {
        //create objects
        Person P1 = new Person("Pongsaton suttipan","1986");
        Person P2 = new Sheriff("saton supan","1983","Thungsong");
        Person P3 = new Police("ton ti ","1980","Nakorn");


        P1.introduce();
        P2.introduce();
        P3.introduce();

    }
}
