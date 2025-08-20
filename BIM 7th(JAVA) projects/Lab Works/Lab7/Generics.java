
package Lab7;

import java.util.*;

public class Generics {

    int Customer;

    public static void main(String[] args) {
        //List<Customer> l = new ArrayList<Customer>();
        Scanner ob = new Scanner("System.in");
        int a[];
        a = new int[5];
        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
            a[i] = ob.nextInt();

        }
        int q = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] > q) {
                q = a[i];
            }
        }
        //l.add(1);
       // l.add(2);

        //Iterator i = l.iterator();
       // while (i.hasNext()) {

        }
        //System.out.println("the greatest number is:" + q);
    }

/*
list1(){
        f1=new JFrame();
        f1.setSize(200,200);
        f1.setLayout(new FlowLayout());
        String a[]={"a","b","c"};
        String k[]={"z","x"};
        l=new JList(a);
        p=new JScrollPane(l);
        c=new JComboBox(k);
       
        
        f1.add(p);
        f1.add(c);
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        list1 ob=new list1();
    }
}

*/
