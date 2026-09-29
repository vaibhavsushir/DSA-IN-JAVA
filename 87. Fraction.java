 class Fraction {
     public int gcd(int x, int y) {
         int min = Math.min(x, y);
         for (int i = min; i >= 1; i--) {
             if (x % i == 0 && y % i == 0) {
                 return i;
             }
         }
         return min;
     }

     public static class fraction {
         int num;
         int den;

         public fraction(int num, int den) {
             this.num = num;
             this.den = den;
         }

         //        public simplify(){
//            int hcf = gcd(num,den);
//            }
//        }
         public static void main(String[] args) {
             fraction f1 = new fraction(3, 7);
             System.out.println(f1.num + "/" + f1.den);
         }
     }
 }
