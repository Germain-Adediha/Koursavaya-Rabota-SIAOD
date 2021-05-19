import java.util.ArrayList;

public class Balloons {
    public static int balloons(int[][] points) {
        ArrayList<Integer[]> peresechenie = new ArrayList<>();
        int changer0 = 0, changer1 = 0;
        for(int i = 0; i < points.length; i++) {
            for(int j = i; j < points.length; j++) {
                //tri du diametre
                if(points[j][0] < points[i][0]) {
                    changer0 = points[j][0];
                    changer1 = points[j][1];
                    points[j][0] = points[i][0];
                    points[j][1] = points[i][1];
                    points[i][0] = changer0;
                    points[i][1] = changer1;
                }
            }
        }

        for(int i = 0; i < points.length; i++) {
            peresechenie.add(new Integer[]{points[i][0], points[i][1]});
        }
        while(true) {
            boolean isNotChanged = true;
            //si deux boules se croisent , on change le premier par leur intersection et on supprime le deuxieme
            for(int i = 0; i < peresechenie.size()-1; i++) {
                if(peresechenie.get(i)[1] >= peresechenie.get(i+1)[0]) {
                    peresechenie.set(i, new Integer[]{peresechenie.get(i+1)[0], peresechenie.get(i)[1]});
                    peresechenie.remove(i+1);
                    isNotChanged = false;
                    break;
                }
            }
            if(isNotChanged) {
                break;
            }
        }
        return peresechenie.size();
    }
    public static void main(String[] args) {
        int[][] points={{5,2,7,},{3,4,6,}};
        System.out.println(balloons(points));
    }
}