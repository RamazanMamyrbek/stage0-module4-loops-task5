package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int crossIndex = (int)Math.floor((sideLength+1)/2);
        for(int i = 1; i <= sideLength; i++) {
            if(i==crossIndex) {
                for(int j = 1; j <= sideLength; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }else {
                for(int j = 1; j < crossIndex; j++)
                    System.out.print(" ");
                System.out.print("8");
                for(int j = 1; j < crossIndex; j++)
                    System.out.print(" ");
                System.out.println();
            }

        }
    }
}
