import java.util.*;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int a = 0,b=0,c=0,d=0,e=0;
        int sum = 0;
        while (t > 0) {
            String s = sc.next();
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Tetrahedron", 4);
            map.put("Cube", 6);
            map.put("Octahedron", 8);
            map.put("Dodecahedron", 12);
            map. put("Icosahedron", 20);

            if (map.containsKey(s)) {
                sum += map.get(s);
            }

            t--;
        }

        System.out.println(sum);
    }
}
