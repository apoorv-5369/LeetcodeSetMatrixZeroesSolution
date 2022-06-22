/* Using the approach of taking two dummy arrays and filling them with '-1', and then replacing the places where there is '-1' with '0',
according to the places filled with '0' in the original matrix.
 By doing this, we are making changes to the dummy arrays, and not to the original matrix.
 Finally, We can traverse through the original matrix and check where there are 0s in dummy arrays, and if we found the 0s then we can 
 replace them in the original matrix and print the value of the modified matrix.*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int[] dum1=new int[m];
        int[] dum2=new int[n];
        Arrays.fill(dum1, -1);
        Arrays.fill(dum2, -1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    dum1[i]=0;
                    dum2[j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dum1[i]==0||dum2[j]==0){
                    matrix[i][j]=0;
                }
                System.out.println(matrix[i][j]);
            }
        }
    
    }
}
