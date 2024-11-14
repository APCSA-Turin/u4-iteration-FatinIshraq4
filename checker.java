public class checker {
    public void printNums(int value, int numRounds) {
        //your code here
            int check = 0;
            int i = 0;
            while (i<numRounds) {
                while (check != value) {
                    check = (int) (Math.random()*10);
                    if (check != value) {
                        System.out.print(check);
                    } else {
                        System.out.println(check);
                    }
                }
                check = 0;
                i++;
            }
        }
    public static void main(String[] args) {
        String str = "cbbaaabbmgg!";
        String maxC = str.substring(0, 1);
        int maxL = 1;
        String cur = "";
        String prev = "";
        int count = 1;
    
        for (int i = 1; i < str.length(); i++) {
            cur = str.substring(i, i + 1);
            prev = str.substring(i - 1, i);
    
            if (cur.equals(prev)) {
                count++;
                if (count > maxL) {
                    maxL = count;
                    maxC = cur;
                }
            } else {
                count = 1;
            }
        }
    
    
    

        System.out.println(maxC + " " + maxL);
       
    
    
    }        
}