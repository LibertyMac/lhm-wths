public class rocket {
	public static void main (String[] args) {
		final int SIZE = 3;
//////////////////////////////////////////////////////////////////////////////////////		  
	     cone(SIZE);
         equalstimes(SIZE);
         aa(SIZE);
         w(SIZE);
         equalstimes(SIZE);
         w(SIZE);
         aa(SIZE);
         equalstimes(SIZE);
         cone(SIZE);
         
         }
//////////////////////////////////////////////////////////////////////////////////////		
            public static void cone(int X){
               	for (int line =1; line <= X * 2 - 1; line++){
   				for (int spaces =1; spaces <= X * 2 - line ; spaces++){
   					System.out.print(" ");
   				}
   				for (int fslash = 1; fslash <= line ; fslash++){
   					System.out.print("/");
   				}
   					System.out.print("**");
   				for (int bslash = 1; bslash <= line ; bslash++){
   					System.out.print("\\");
   				}
   			System.out.println();
            }
         }
//////////////////////////////////////////////////////////////////////////////////////  
            public static void equalstimes(int X){ 
                  System.out.print("+");
               for (int plsmn = 1; plsmn <= X * 2; plsmn++){
                  System.out.print("=*");
                  }
                System.out.print("+");
               System.out.println();
            }
//////////////////////////////////////////////////////////////////////////////////////
            public static void aa(int X){  
               for (int line =1; line <= X; line++){
               System.out.print("|"); 
               for (int dot = X - line; dot > 0; dot--){
                  System.out.print(".");         
               }
               for (int slash =1; slash <= line; slash++){
                   System.out.print("/\\");
               }
                for (int dot2 = (X - line) * 2; dot2 > 0; dot2--){
                  System.out.print(".");         
               }
               for (int slash =1; slash <= line; slash++){
                   System.out.print("/\\");
               }
               for (int dot = X - line; dot > 0; dot--){
                  System.out.print(".");         
               }
                System.out.print("|");
               System.out.println();
                }
            }
//////////////////////////////////////////////////////////////////////////////////////
            public static void w(int X){  
               for (int line =1; line <= X; line++){
               System.out.print("|"); 
               for (int dot = 1; dot < line; dot++){
               System.out.print(".");         
               }
               for (int slash = 0; slash <= X - line ; slash++){
               System.out.print("\\/");
               }
               for (int dot = 2; dot < line * 2; dot++){
               System.out.print(".");          
               }
               for (int slash = 0; slash <= X - line ; slash++){
               System.out.print("\\/");
               }
               for (int dot = 1; dot < line; dot++){
               System.out.print(".");         
               }
               System.out.print("|"); 
               System.out.println();
               }
            }
//////////////////////////////////////////////////////////////////////////////////////

 
 
 
 
 
 
 
 
 
 
 
 
 
  }
