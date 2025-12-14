import java.util.*;

class Main {
    
    public static void listofpatterns() {
        System.out.println(" 1). Hollow Diamond Pattern.");
        System.out.println(" 2). Solid Diamond Pattern.");
        System.out.println(" 3). Hourglass Pattern.");
        System.out.println(" 4). Butterfly Pattern.");
        System.out.println(" 5). Cross (X) Pattern.");
        System.out.println(" 6). Hollow Pyramid Pattern.");
        System.out.println(" 7). Palindrome Pattern.");
        System.out.println(" 8). Binary Triangle Pattern.");
        System.out.println(" 9). Checkerboard Pattern.");
    }
    
    public static void takinginput(Scanner sc) {
        
        String starting = "Hello";
        while(!starting.equalsIgnoreCase("start")) {
        System.out.print(" Type 'start' to get the list of patterns : ");
        starting = sc.nextLine();
        
        if(starting.equalsIgnoreCase("start")) {
            System.out.println(" \n ==> If you want to see hollow diamond pattern then type '1' and for solid diamond type '2' and so on as serial number mentioned in the list of the respective patterns.\n");
            System.out.println(" Here are the list of patterns : \n");
            listofpatterns();
            System.out.println(" ==========================================================================");
            System.out.println(" ==========================================================================\n");
            }
        }
    }
    
    public static void hollowdiamond(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 3 to 12.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 3 || n > 12) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            int spaces = 2*(i-1)-1;
            if(spaces>0) {
            for(int k=1; k<=spaces; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=(n-i); j>=1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            int spaces = 2*(i-1)-1;
            if(spaces>0) {
            for(int k=spaces; k>=1; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void soliddiamond(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 3 to 12.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 3 || n > 12) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            int spaces = 2*(i-1)-1;
            if(spaces>0) {
            for(int k=1; k<=spaces; k++) {
                System.out.print("*");
            }
            System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=(n-i); j>=1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            int spaces = 2*(i-1)-1;
            if(spaces>0) {
            for(int k=spaces; k>=1; k--) {
                System.out.print("*");
            }
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void hourglass(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 4 to 13.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 4 || n > 13) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=i-1; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=i-1; j>=0; j--) {
                System.out.print(" ");
            }
            for(int k=2*(n-i)+1; k>=1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void butterfly(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 4 to 10.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 4 || n > 10) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i)-1;
            if(spaces>0) {
            for(int k=0; k<spaces; k++) {
                System.out.print(" ");
                }
            }    
            for(int l=1; l<=(i==n ? i-1 : i); l++) {
                System.out.print("*");
                }
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            int spaces = 2*(n-i)-1;
            if(spaces>0) {
            for(int k=spaces; k>0; k--) {
                System.out.print(" ");
                }
            }
            for(int l=i; l>=1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void cross(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 3 to 10.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 3 || n > 10) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<=2*(n-i)-1; k++) {
                System.out.print(" ");
            }
            if(i != n ) {
            System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=i-1; j>=1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=2*(n-i)-1; k>=1; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }
    
    public static void hollowpyramid(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 5 to 15.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 5 || n > 15) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<=2*(i-1)-1; k++) {
                System.out.print(" ");
            }
            if(i != 1) {
            System.out.print("*");
            }
            System.out.println();
        }
        int l = 1;
        while(l<=2*n-1) {
            System.out.print("*");
            l++;
        }
        System.out.println();
    }
    
    public static void palindrome(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 3 to 9.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 3 || n > 9) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for(int k=1; k<=i; k++) {
                System.out.print(num);
                num++;
            }
            if(i != 1) {
                int num2 = i-1;
                    for(int k=1; k<=i-1; k++) {
                       System.out.print(num2);
                       num2--;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void binarytriangle(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 4 to 15.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 4 || n > 15) {
            System.out.print(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void checkerboard(Scanner sc) {
        
        System.out.println("\n Note number of lines must be between 4 to 15.");
        System.out.print("\n Enter the number of lines you want : ");
        int n = sc.nextInt();
        while(n < 4 || n > 15) {
            System.out.println(" Invalid Input! Enter again : ");
            n = sc.nextInt();
        }
        
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println(" Welcome to this Shape Generator app made by Nirwan Jain");
        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
        
        int choice;
        
        takinginput(sc);
        
        do {
        System.out.println(" Here are the list of patterns : \n");
            listofpatterns();
            System.out.println(" ==========================================================================");
            System.out.println(" ==========================================================================\n");
        System.out.print(" Enter the serial number to see the corresponding pattern : ");
        int number = sc.nextInt();
        sc.nextLine();
        
        switch(number) {
            case 1 : hollowdiamond(sc);
            break;
            
            case 2 : soliddiamond(sc);
            break;
            
            case 3 : hourglass(sc);
            break;
                
            case 4 : butterfly(sc);
            break;
                
            case 5 : cross(sc);
            break;
                
            case 6 : hollowpyramid(sc);
            break;
                
            case 7 : palindrome(sc);
            break;
                
            case 8 : binarytriangle(sc);
            break;
                
            case 9 : checkerboard(sc);
            break;
                
            default : System.out.println(" Invalid Input. Please choose between 1 to 9.");
        }
        
        System.out.println(" If you want to Continue type '1' else for Exit type '0'.");
        
        System.out.print(" Your choice : ");
        choice = sc.nextInt();
        sc.nextLine();
        System.out.println();
        
    } while (choice == 1);
    
    System.out.println(" ==========================================================================");
    System.out.println(" Thank you for using the Shape Generator App. I hope you enjoyed generating patterns!");
        sc.close();
        System.out.println(" ==========================================================================");
    }
}
