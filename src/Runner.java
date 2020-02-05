public class Runner {

    public static void main(String[] args) {
        System.out.println(icyHot(10, 100));
        System.out.println(seeColor("Eliotredredblue"));
        System.out.println(cigarParty("50", true));
        System.out.println(stringSplosion("Eliot"));
        System.out.println(noTeenSum(20, 13, 6));
        int[] x = {1, 3, 4, 7};
        System.out.println(lucky13(x));
        System.out.println(equalIsNot("Eliot is not hungry"));
        int[] y = {1, 4, 5};
        System.out.println(sum3(y));
        System.out.println(seriesUp(45));
        System.out.println(repeatEnd("Eliot", 2));
    }

    // WARMUP 1
    public static boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }else{
            return false;
        }
    }

    // STRING 1
    public static String seeColor(String str) {
        String red = "red";
        String blue = "blue";
        if(str.length() <= 2) {
            return "";
        }
        if(str.equals("red")) {
            return red;
        }
        if(str.length() <= 3) {
            return "";
        }
        if(str.substring(0,3).equals("red")) {
            return red;
        }else if(str.substring(0, 4).equals("blue")) {
            return blue;
        }else{
            return "";
        }

    }

    // LOGIC 1
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        }
        if(isWeekend && cigars >= 40) {
            return true;
        }
        return false;
    }

    // WARMUP 2
    public static String stringSplosion(String str) {
        String newStr = "";
        for(int i=0; i<str.length()+1; i++) {
            newStr += str.substring(0, i);
        }
        return newStr;
    }

    // LOGIC 2
    public static int noTeenSum(int a, int b, int c) {
        if((a >= 13 && a < 15) || (a > 16 && a <= 19)) {
            a = 0;
        }
        if((b >= 13 && b < 15) || (b > 16 && b <= 19)) {
            b = 0;
        }
        if((c >= 13 && c < 15) || (c > 16 && c <= 19)) {
            c = 0;
        }
        return a + b + c;
    }

    // ARRAY 2
    public static boolean lucky13(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 3 || nums[i] == 1) {
                return false;
            }
        }
        return true;
    }

    // STRING 3
    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for(int i=0; i<=str.length()-3; i++) {
            if(str.substring(i, i+2).equals("is")) {
                is += 1;
            }else if(str.substring(i, i+3).equals("not")) {
                not += 1;
            }
        }
        if(str.length() >= 2 && str.substring(str.length()-2).equals("is")) {
            is += 1;
        }
        return is == not;
    }

    // ARRAY 1
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    // ARRAY 3
    public static int[] seriesUp(int n) {
        int[] newArr = new int[n*(n+1)/2];
        int e = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                newArr[e++] = j;
            }
        }
        return newArr;
    }

    // STRING 2
    public static String repeatEnd(String str, int n) {
        String newStr = "";
        for(int i=0; i<n; i++) {
            newStr += str.substring(str.length()-n);
        }
        return newStr;
    }
}