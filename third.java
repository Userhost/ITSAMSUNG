import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 13;
        int d = 2;
        int k = 2;
        int h = 0;
        int w = 0;
        int c = 0;
        int an = n;
        int ad = d;
        int ak = k;
        for (int i = 0; i < 1000 ; i++) {

            if ((c < 2) && (n >= d)){
                n -=d;
                c++;
            }
            else{
                if(c==2 && n >= d*k){
                    d *=k;
                    c = 0;
                }
                else{
                    h = d+1;
                    w = d+1;

                }
            }
        }
        System.out.println(h+" "+w);
        char [][] sist = new char[h][w];
        for (int i = 0; i <h ; i++) {
            for (int j = 0; j <w ; j++) {
                sist[i][j] = '.';
            }
        }
        int x0 = h%2+1;
        int y0 = w%2+1;
        int str = 1;
        sist[h%2+1][w%2+1] = '*';
        for (int pp = 0; pp < 1000; pp++)

        {
            int i =0;
            int j =0;
            int l =0;
            for (i = y0+1; i <= y0 + ad; i++) {
                if(an == 0){
                    break;
                }
                sist[x0][i] = '*';
                an--;

            }
            str = 2;
            i--;
            y0 = i;
            for (j = x0-1; j >= x0-ad; j--) {
                if(an == 0){
                    break;
                }
                sist[j][y0] = '*';
                an--;

            }
            str = 3;
            j++;
            x0=j;
            ad *=ak;
            for (l = y0-1; l >= y0-ad ; l--) {
                if(an == 0){
                    break;
                }
                sist[x0][l]='*';
                an--;

            }
            str = 4;
            l++;
            y0 = l;
            for (int m = x0+1; m <=x0+ad ; m++) {
                if(an == 0){
                    break;
                }
                sist[m][y0]='*';
                an--;

            }
            str = 1;
            ad*=k;

        }
        if (str == 1) {
            for (int i = y0+1; i <= y0 + ad; i++) {
                if(an == 0){
                    break;
                }
                sist[x0][i] = '*';
                an--;

            }
        }
        else{
            if(str == 2){
                for (int j = x0-1; j >= x0-ad; j--) {
                    if(an == 0){
                        break;
                    }
                    sist[j][y0] = '*';
                    an--;

                }
            }
        }

      for (int q = 0; q <h ; q++) {
          for (int r = 0; r <w ; r++) {
              System.out.print(sist[q][r]);
          }
          System.out.println();
      }

}
}
