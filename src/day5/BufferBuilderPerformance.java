package day5;

public class BufferBuilderPerformance {
        public static void main(String[] args) {
            long starttime = System.currentTimeMillis();
            StringBuilder sbl = new StringBuilder("Placement");
            for(int i=0; i<10000000; i++){
                sbl.append("Training");
            }
            System.out.println("Time taken by sbl : "
                    + (System.currentTimeMillis() - starttime )+ "ms");

            starttime = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer("Placement");
            for(int i=0; i<10000000; i++){
                sb.append("Training");
            }
            System.out.println("Time taken by sb : "
                    + (System.currentTimeMillis() - starttime )+ "ms");
        }
    }
