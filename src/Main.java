public class Main {

    // using this()
    public Main(){

        this("samrat");
        System.out.print(" karki");

    }

    public Main(String str){
        System.out.print(str);
    }

    public static void main(String[] args) {

     Main obj = new Main();
    }
}