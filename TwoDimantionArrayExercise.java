
package twodimantionarrayexercise;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoDimantionArrayExercise {

   static char[][] board;
    public static void main(String[] args) {
       
        
            
   Scanner input = new Scanner(System.in);
        
   
   // quastion 1
   /*
    int[][] a = new int[3][3];
    
        for(int i = 0 ;i < 3;i++){
        for(int j =  0 ;j <3;j++){
            a[i][j] = input.nextInt();}
        }
    
   int col = input.nextInt() ;
        System.out.println(sum(a,col)); 
    }
    public static int sum(int[][] a , int col){
     Scanner input = new Scanner(System.in);

    int sum = 0 ;
    
    for(int i = 0 ;i < 3;i++){
            sum += a[i][col-1];
        
    }
        return sum;
}   
}*/
   
   // quastion 2
   /*
   int n = input.nextInt();
   double[][] a = new double[n][n];
   
   for(int i = 0 ;i < n;i++){
       for(int j = 0 ;j < n ;j++)
           a[i][j] = input.nextInt();
   }
   
        System.out.println(SumMajorDilog(a,n));
    }
    public static double SumMajorDilog(double[][] a,int n){
        int sum = 0 ;
          for(int i = 0 ;i < n;i++){
       for(int j = 0 ;j <= i ;j++)
           if(i == j)
          sum += a[i][j];
   }
        return sum;
    }
}
*/
   
   // quastion 3
   /*
      String[] name ={"Ali","Muhammad","Siar","Ramin","Amin","AnwerKhan","Adel"};
   int[] student = {1,2,3,4,5,6,7};  //7 6 5 4 8 7 7
   char[][] answer = {{'A','B','A','C','C','D','E','E','A','D' },
                   {'D','B','A','B','C','A','E','E','A','D' },
                   {'E','D','D','A','C','B','E','E','A','D' },
                   {'C','B','A','E','D','C','E','E','A','D' },
                   {'A','B','D','C','C','D','E','E','A','D' },
                   {'B','B','E','C','C','D','E','E','A','D' },
                   {'B','B','A','C','C','D','E','E','A','D' },
                   {'B','B','E','C','C','D','E','E','A','D' }
};

char[] key = {'D','B','D','C','C','D','A','E','A','D' };
   int[] count = new int[answer.length] ;
for(int i = 0 ;i <  answer.length;i++){
     
    for(int j = 0 ;j < key.length;j++){
        if(answer[i][j] == key[j])
            count[i]++;
    }
   
}

for(int i = 0 ; i < count.length-1;i++ ){
   
    for(int j = i+1 ;j < count.length-1;j++){
        if(count[i]  < count[j]){
            int temp = count[i];
            count[i] = count[j];
            count[j] = temp;
            
            String t = name[i];
            name[i] = name[j];
            name[j] = t;
          
        }
    }
}
System.out.println("ID        NAME          SCORE");
     for(int i = 0 ; i < student.length;i++ ){
          
              
               System.out.println(student[i]+" :       "+name[i]+"         "+count[i]);
        } 
   */
   
   // QUASTION 4
   /*
      String[] name ={"Employee 0","Employee 1","Employee 2","Employee 3","Employee 4","Employee 5","Employee 6","Employee 7"};
   int[] student = {1,2,3,4,5,6,7};  //7 6 5 4 8 7 7
   int[][] hourse = {{2,4,3,4,5,8,8 },
                   {7,3,4,3,3,4,4 },
                   {3,3,4,3,4,2,2 },
                   {9,3,4,7,3,4,1 },
                   {3,5,4,3,6,3,8 },
                   {3,4,4,6,3,4,4 },
                   {3,7,4,8,3,8,4 },
                   {6,3,5,9,2,7,9 }
};


   int[] count = new int[hourse.length] ;
   
for(int i = 0 ;i <  hourse.length;i++){
   int sum = 0;
   for(int j = 0 ;j < hourse[i].length;j++){
       sum += hourse[i][j];}
count[i]= sum;
    
}
for(int i = 0 ; i < count.length-1;i++ ){
   
    for(int j = i+1 ;j < count.length-1;j++){
        if(count[i]  < count[j]){
            int temp = count[i];
            count[i] = count[j];
            count[j] = temp;
            
            String t = name[i];
            name[i] = name[j];
            name[j] = t;
          
        }
    }
}
System.out.println("ID        NAME               HOURSE");
     for(int i = 0 ; i < student.length;i++ ){
          
              
               System.out.println(student[i]+" :       "+name[i]+"         "+count[i]);
        }     

   */

   //  quastion 5
   /*
   double[][] a = new double[2][2];
   double[][] b = new double[2][2];
   for(int i = 0 ;i < a.length;i++){
       for(int j = 0;j < a[i].length;j++){
           a[i][j] = input.nextDouble();
           b[i][j] = input.nextDouble();
   }
   }
   
   double[][] result = addMetrix(a,b);
       
      for(int i = 0 ;i < a.length;i++){
       for(int j = 0;j < a[i].length;j++){
        System.out.println(result[i][j]);
       }}
    }
   public static double[][] addMetrix(double[][] a , double[][] b){
       double[][] c= new double[2][2];
          for(int i = 0 ;i < a.length;i++){
       for(int j = 0;j < a[i].length;j++){
       c[i][j]= a[i][j]+b[i][j];
       }
       }
 
        return c;
   } 
}
*/
   
   // quastion 6
   /*
   
   double[][] a = new double[2][2];
   double[][] b = new double[2][2];
   for(int i = 0 ;i < a.length;i++){
       for(int j = 0;j < a[i].length;j++){
           a[i][j] = input.nextDouble();
           b[i][j] = input.nextDouble();
   }
   }
   
   double[][] result = addMetrix(a,b);
       
      for(int i = 0 ;i < a.length;i++){
       for(int j = 0;j < a[i].length;j++){
        System.out.println(result[i][j]);
       }
          System.out.println();}
    }
   public static double[][] addMetrix(double[][] a , double[][] b){
       double[][] c= new double[2][2];
          for(int i = 0 ;i < a.length;i++){
       for(int j = 0;j < a[i].length;j++){
       c[i][j]= a[i][j]*b[i][j];
       }
       }
 
        return c;
    }
    
}
*/
   
   // qustion 7
   
   /*
      double[][] points = {{-1,0,3},{-1,-1,-1},{4,1,1},{2,0.5,9},{3.5,2,-1},{3,1.5,3},{-1.5,4,2},{5.5,-4,-0.5}};
   double mindst=distance(points[0],points[1]);
   int p1 = 0; int p2 = 1;
   for(int i= 0;i< points.length;i++){
       for(int j = 0 ; j < points.length;j++){
           double dist=distance(points[i],points[j]);
           if(dist < mindst){
               mindst = dist;
               p1 = i ;
               p2 = j;
           }
       }
   }
        System.out.println("closet points are:");
        System.out.println("point"+p1+"and point "+p2);
        System.out.println("Dsistance:"+mindst);
    }
   public static double distance(double[] p1,double[] p2){
        return Math.sqrt(Math.pow(p1[0]-p2[0], 2)+Math.pow(p1[1]-p2[1], 2)+Math.pow(p1[2]-p2[2], 2));
       
   }
}
   
   s
   */
   
//   char[][] board = new char[3][3];
//   for(int i = 0 ; i < 3;i++)
//       for(int j = 0 ; j < 3;j++)
//           board[i][j] = ' ';
//   
//   char player = 'x';
//   while(true){
//       printBoard();
//       System.out.print("Enter row (0-2)for player "+player+":");
//       int row = input.nextInt();
//       System.out.print("Enter column (0-2): ");
//       int col = input.nextInt();
//       if(board[row][col] != ' '){
//           System.out.println("cell already taken!");
//           continue;
//       }
//       board[row][col] = player;
//       if(checkWin(player)){
//           printBoard();
//           System.out.println(player+"winst!");
//           break;
//       }
//       if(isFull()){
//           printBoard();
//           System.out.println("Draw!");
//           break;
//       }
//       player = (player == 'x')? 'o':'x';
//   }
//   }
//   static void printBoard(){
//       System.out.println("- - - - - - - - - - - - -");
//       for(int i = 0  ;i < 3;i++){
//           System.out.print("| ");
//           for(int j = 0 ;j < 3;j++){
//               System.out.print(board[i][j]+" | ");
//           }
//           System.out.println();
//           System.out.println("- - - - - - - - - - - - -");
//       }
//   }
//   static boolean checkWin(char p){
//       for(int i = 0 ;i < 3 ;i++){
//           if((board[i][0]== p && board[i][1] == p && board[i][2] == p) || (board[0][i] == p && board[1][i] == p&& board[2][i] == p)){
//           return true;
//       }
//       }
//                  if((board[0][0]== p && board[1][1] == p && board[2][2] == p) ||(board[0][2] == p && board[1][1] == p&& board[2][0] == p)){
//           return true;
//       }
//       return false;
//   } 
//    
//   static boolean isFull(){
//       for(int i = 0 ;i < 3;i++)
//           for(int j = 0 ;j < 3;j++)
//            if(board[i][j]== ' ')
//                return false;
//       return true;
//   }
//}
   
////    
////int[][]  a = new int[4][4];
////
////for(int i = 0 ; i < a.length;i++){
////    for(int j = 0; j < a[i].length;j++){
////        a[i][j] = (int)(Math.random() * 2);
////    }
////}
////for(int i = 0 ; i < a.length;i++){
////    for(int j = 0; j < a[i].length;j++){
////        System.out.print(a[i][j]);
////    }
////    System.out.println();
////}
////int maxRow =0 ,maxCol = 0;
//////int maxRowCount = 0 ,maxColCount = 0;
//// int[] b = new int[a.length+1];
//// int[] c = new int[a.length+1];
//// 
////    for(int i = 0 ; i < a.length;i++){
////        int count = 0;
////        int count1 =0;
////    for(int j = 0; j < a[i].length;j++){
////    if(a[i][j] == 1 )
////        count++;
////    if(a[j][i] == 1 )
////        count1++;
////    
////    }
////    b[i]= count;
////    c[i]= count1;
////    }
////for(int i = 0 ; i < b.length-1;i++)
////    for(int j = i+1 ;j < b.length;j++)
////{
////    if(b[i] > b[j])
////        maxRow = b[i];
////}
////for(int i = 0 ; i < b.length-1;i++)
////    for(int j = i+1 ;j < b.length;j++)
////{
////    if(b[j] > b[i])
////        maxCol = b[j];
////}
////for(int i = 0 ; i < b.length-1;i++){
////            System.out.print(b[i]+" ");
////            System.out.println();
////            }
////for(int i = 0 ; i < b.length-1;i++)
////            System.out.print(c[i]+" ");
////        System.out.println("maxrow"+maxRow);
////        System.out.println("maxCol"+maxCol);

// Quastion 37

/*
double[][] points = {{1,2},{3,-7},{-6.3,-7},{6,3}};
double[] x = getRightMostLowestPoint(points);
        System.out.println(x);
        System.out.println("point is : ("+x[0]+","+x[1]+")");
    }
    public static double[] getRightMostLowestPoint(double[][] points){
       double[] best = points[0];
        for(int i = 0 ; i < points.length;i++){
            if(points[i][1] < best[1] || (points[i][1] == best[1] && points[i][0] > best[0])){
                best = points[i];
            }
      
    }
       return best;
    }
}
*/

// Quastion 36

/*
    
        System.out.println("Enter number:");
        int n = input.nextInt();
        input.nextLine();
        char[][] me = new char[n][n];
        System.out.println("enter rows sepreted by space:");
        for(int i = 0 ; i< n ;i++){
            String line = input.nextLine();
            String[] parts = line.split(" ");
            
            for(int j = 0 ;j < n ;j++){
                me[i][j] = parts[j].charAt(0);
                
            }
        }
        if(isLatinSquare(me))
            System.out.println("the input array is latin square!");
        else
            System.out.println("the input array is not latinSquare");
    }
    
    public static boolean isLatinSquare(char[][] m){
        int n = m.length;
        for(int i = 0 ; i< n ;i++){
            Set<Character > row = new HashSet<>();
            Set<Character > col = new HashSet<>();
            for(int j = 0 ; j < n  ;j++){
                row.add(m[i][j]);
                col.add(m[j][i]);
            }
            if(row.size() != n || col.size() !=n)
return false;
        }
       return true;
    }
}

*/


// quastion 37
 
/*
String[][] a = {{"Afghanistan","kabul"},{"pakistan","islamAbad"},{"loger","MuhammadAgha"},{"helman","lashkergah"}};

 int count = 0;
   for(int i = 0 ;i < a.length;i++){
       System.out.println("What is the centr of"+a[i][0]+" : ");
          String center = input.nextLine();
          if(center.equals(a[i][1]))
              count++;
          else
              System.out.println("your answer is worng the correct option id :"+a[i][1]);
   }
        System.out.println(count);
        */
int n = input.nextInt();
input.nextLine();
int[][] b = new int[n][n];
for(int i = 0  ; i < n ;i++){
    String s = input.nextLine();
    String[] a = s.split(" ");
        
            for(int j = 0 ; j < n ;j++){
        b[i][j]=a[j].charAt(0);
    }
}

System.out.print(findLargastBlock(b));

    }
public static int[] findLargastBlock(int [][] m){
    int n = m.length;
    int[][] dp = new int[n][n];
    
    int max = 0,row= 0 , col = 0 ;
    
    for(int i = 0 ; i < n ;i++){
        for(int j = 0  ;j < n ;j++){
            if(i == 0 || j == 0 )
                dp[i][j] = m[i][j];
            else if(m[i][j] == 1)
                dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1]));
            if(dp[i][j] > max)
            {
                max = dp[i][j];
                row = i;
                col = j;
            }
        }
    }
       return new int[]{row-max+1,col-max+1,max};
}
}


//  
