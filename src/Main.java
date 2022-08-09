import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println("Jalpy sandar " + arrayList);
        System.out.println("Jalpy sandardyn kolichestvosu: " + arrayList.size());

        ArrayList<Integer> takSandar = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==1){
                takSandar.add(arrayList.get(i));
            }
        }
        System.out.println("Tak sandar: " + takSandar);
        System.out.println("Tak sandardyn kolichestvosu: " + takSandar.size());
        ArrayList<Integer> jupSandar = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==0){
                jupSandar.add(arrayList.get(i));
            }
        }
        System.out.println("Jup sandar: " + jupSandar);
        System.out.println("Jup sandardyn kolichestvosu: " + jupSandar.size());

    }
}