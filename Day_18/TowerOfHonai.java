import java.util.Scanner;
class TowerOfHonai {
    public static void towerOfHanoi(int n, char source, char helper, char dest) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, source, helper, dest);
        
        System.out.println("Move disk " + n + " from " + source + " to " + dest);

        towerOfHanoi(n - 1, helper, source, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
        sc.close();
    }
}

// class Solution {
//   public:
//     int towerOfHanoi(int n, int from, int to, int aux) {
//         // code here
//         if(n==1){
//             return 1;
//         }
//         int left=towerOfHanoi(n-1,from,aux,to);
        
//         int right=towerOfHanoi(n-1,to,from,aux);
//         return left+1+right;
//     }
// };