package Avikal.JavaMasterClass;

public class Generic {
    private String str[] = {"Apple", "Ball","Cat", "Dog"};
    private Integer num[] = {1, 2, 3,4, 5,6};
    private Character ch[] = {'a', 'b', 'c', 'd'};

    public <E> void printData(E []str){
        for(E i: str){
            System.out.println(i);
        }
    }
//    public void printData(int[] num){
//        for(int i: num){
//            System.out.println(i);
//        }
//    }
//
//    public void printData(char[] ch){
//        for(char i: ch){
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {
        Generic data = new Generic();
        data.printData(data.str);
        data.printData(data.num);
        data.printData(data.ch);
    }
}
