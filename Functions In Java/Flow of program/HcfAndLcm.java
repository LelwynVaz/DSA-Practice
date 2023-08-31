public class HcfAndLcm {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        int hcf = numHCF(num1, num2);
        int lcm = numLCM(num1, num2, hcf);
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }

    static int numHCF(int num1, int num2) {
        int hcf;
        for(hcf = (num1 < num2) ? num1 : num2; true; hcf--) {
            if (num1 % hcf == 0 && num2 % hcf == 0) {
                break;
            }
        }
        return hcf;
    }

    static int numLCM(int num1, int num2, int hcf) {
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
}
