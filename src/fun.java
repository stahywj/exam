import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kenneth on 2016/8/17.
 */
public class fun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        Ordinate ordinate = new Ordinate();
        List<Ordinate> list = new ArrayList();
        while (scan.hasNext()){

//            while (count >= 0){
            /*    String str = scan.nextLine();
            System.out.println(str);
                String[] splits = str.split(" ");
            System.out.println(splits.length);
                ordinate.setRow_x(Double.parseDouble(splits[0]));
                ordinate.setRow_y(Double.parseDouble(splits[1]));
                ordinate.setCol_x(Double.parseDouble(splits[2]));
                ordinate.setCol_y(Double.parseDouble(splits[3]));
                list.add(ordinate);
                count--;*/
//            }
            System.out.println(scan.nextLine());

        }
       Ordinate ord = min_max(list);
        System.out.println(ord.getRow_x()+" "+ord.getRow_y()+" "+ord.getCol_x()+" "+ord.getCol_y());
    }
    public static Ordinate min_max(List<Ordinate> list){
        double min_x = 0;
        double min_y = 0;
        double max_x = 0;
        double max_y = 0;
        Ordinate ord = new Ordinate();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRow_x() < min_x && list.get(i).getRow_y() < min_y){
                min_x = list.get(i).getRow_x();
                min_y = list.get(i).getRow_y();
            }
            if (list.get(i).getCol_x() > max_x && list.get(i).getCol_y() > max_y){
                max_x = list.get(i).getCol_x();
                max_y = list.get(i).getCol_y();
            }
        }
        ord.setRow_x(min_x);
        ord.setRow_y(min_y);
        ord.setCol_x(max_x);
        ord.setCol_y(max_y);
        return ord;
    }
}
