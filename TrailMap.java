import java.util.*;

public class TrailMap {
    public static void main(String[] args) {
        Comparator<studentClass> sortStudentsScore = (s1, s2) -> s2.score - s1.score;
        studentClass s = new studentClass();
        s.name = "Suprina";
        s.score = 40;

        studentClass n = new studentClass();
        n.name = "Narayan";
        n.score = 90;
        studentClass su = new studentClass();
        su.name = "Suvansu";
        su.score = 87;

        studentClass sun = new studentClass();
        sun.name = "Sunita";
        sun.score = 43;

        studentClass ni = new studentClass();
        ni.name = "Neelam";
        ni.score = 67;

        studentClass r = new studentClass();
        r.name = "Ramesh";
        r.score = 47;

        studentClass subh = new studentClass();
        subh.name = "Subhadra";
        subh.score = 90;

        studentClass m = new studentClass();
        m.name = "Madhav";
        m.score = 60;

        studentClass a = new studentClass();
        a.name = "Ankit";
        a.score = 78;

        studentClass smr = new studentClass();
        smr.name = "Smriti";
        smr.score = 28;


        List<studentClass> valSetOneA = new ArrayList<studentClass>();
        valSetOneA.add(s);
        valSetOneA.add(sun);
        valSetOneA.add(r);
        valSetOneA.add(smr);
        valSetOneA.sort(sortStudentsScore);

        List<studentClass> valSetTwoB = new ArrayList<>();
        valSetTwoB.add(n);
        valSetTwoB.add(ni);
        valSetTwoB.add(subh);
        valSetTwoB.sort(sortStudentsScore);


        List<studentClass> valSetThreeC = new ArrayList<studentClass>();
        valSetThreeC.add(su);
        valSetThreeC.add(m);
        valSetThreeC.add(a);
        valSetThreeC.sort(sortStudentsScore);

        Map<String, List<studentClass>> map = new HashMap<String, List<studentClass>>();
        map.put("A", valSetOneA);
        map.put("B", valSetTwoB);
        map.put("C", valSetThreeC);

        System.out.println(map);
        for (Map.Entry<String, List<studentClass>> entry : map.entrySet()) {
//            System.out.println(entry);
            String key = entry.getKey();
            List<studentClass> value = entry.getValue();

                System.out.println("Class"+key+ " first Topper = " +value.get(0));
                System.out.println("Class"+key+ " second Topper = "+ value.get(1));
//            for (studentClass values : value) {
////                System.out.println(values);
////                System.out.println("Key = " + key);
////                System.out.println("Value=" + values);
//            }
        }
    }
}