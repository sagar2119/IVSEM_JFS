import java.util.*;
public class sinknode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adjmatrix[][]={{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
        int zero_ctr=0;
        int sink_ctr=0;
        for(int i =0;i<adjmatrix.length;i++){
            zero_ctr=0;
            for(int j=0; j<adjmatrix.length;j++){
                if(adjmatrix[i][j]==0)
                zero_ctr++;
            }
            if(zero_ctr==adjmatrix.length){
                System.out.println("sinknode="+(char)(65+i));
                sink_ctr++;
            }


        }
        System.out.println("number of sink="+sink_ctr);
    }
    
}
