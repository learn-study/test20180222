//1^9の任意の数字を入力したら1~99の整数でnの倍数と一の位がnの数字を表示、合計も表示する

import java.io.*;

class Test2{
    public static void main(String[] args) throws IOException{
        System.out.println("1 ~ 9 の整数を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        
        System.out.println(n + "の倍数と" + "一の位が" + n + "の数字を表示します。");
        int sum = 0;
        for( int i = 1; i < 100; i++){
            if( i % n == 0 || i % 10 == n  ){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("合計は" + sum + "です。");
 
    }
}