/*******************************
 * 
 * Project: 2D Matrix
 * Language: Java
 * Date: April 2021
 * 
 * Dev: Jayed Rafi
 *
*******************************/

public class Matrix
{
  private static int row = 5;
  private static int col = 5;
  public static char [][] matrix = new char [row][col];
  
  public static void main (String[] args)
  {
      System.out.println("Matrix:");
      createMatrix ('-');
      print();
      System.out.println("\n\nLeft to right diagonal matrix:");
      createMatrix ('-');
      LRdiagonalMatrix('X');
      print();
      System.out.println("\n\nRight to left diagonal matrix:");
      createMatrix ('-');
      RLdiagonalMtrix ('X');
      print();
      System.out.println("\n\nUpper diagonal matrix:");
      createMatrix ('-');
      upperDiagonal('X');
      print();
      System.out.println("\n\nLower diagonal matrix:");
      createMatrix ('-');
      lowerDiagonal ('X');
      print();
      System.out.println("\n\nLine after line matrix:");
      createMatrix ('-');
      lineAfterLine ('X');
      print();
      System.out.println("\n\nColumn after column matrix:");
      createMatrix ('-');
      colAfterCol('X');
      print();
      System.out.println("\n\nChess matrix:");
      createMatrix ('-');
      chess('X');
      print();
    }
    
  public static void createMatrix (char a)
  {
    for(int i=0; i<row; i++)
    {
     for(int j=0; j<col; j++)
     matrix[i][j] = a;
        }
    }
  
  public static void LRdiagonalMatrix (char a)
  {
     int rowColMin = Math.min(row,col);
      for(int i=0; i<rowColMin; i++)
     {
         matrix[i][i] = a;
        }
    }
    
  public static void RLdiagonalMtrix (char a)
  {
     int rowColMin = Math.min(row,col);
     int j = 0;
     for(int i=rowColMin-1; i>=0; i--)
     {
         matrix[i][j] = a;
         j++;
        }
    }
  
  public static void upperDiagonal (char a)
  {
      for(int i=0; i<row; i++)
      {
         for(int j=i; j<col; j++)
         {
             matrix[i][j] = a;
            }
        }
    }
    
  public static void lowerDiagonal (char a)
  {
     for(int i=0; i<row; i++)
     {
         for(int j=0; j<i; j++)
         {
             matrix[i][j] = a;
            }
        }
    }
  
  public static void lineAfterLine (char a)
  {
     for(int i=0; i<row; i+=2)
     {
     for(int j=0; j<col; j++)
     {
         matrix[i][j] = a;
        }
        }
    }
    
  public static void chess (char a)
  {
     for(int i=0; i<row; i++)
     {
     for(int j=i%2; j<col; j+=2)
     {
         matrix[i][j] = a;
        }
        }
    }
  
  public static void colAfterCol (char a)
  {
  for(int i=0; i<row; i++)
  {
  for(int j=0; j<col; j+=2)
  {
     matrix[i][j] = a; 
    }
    }
    }
  
  public static void print()
  {
     String line = "";
      for(int i=0; i<matrix.length; i++)
     {
     for(int j=0; j<matrix[i].length; j++)
     {
         line+=" "+ matrix[i][j];
        }
     System.out.println(line);
     line = "";
        }
    }
}
