//以下要件を満たす現在の時刻を表示するプログラムを作成してください。
//表示形式がyyyy'年'M'月'dd'日'E'曜日'k'時'mm'分'ss'秒'
//localeはハワイを指定することPacific/Honolulu
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class Test1{
    public static void main(String[] args){
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'M'月'dd'日'k'時'mm'分'");

        sdf.setTimeZone(TimeZone.getTimeZone("Pacific/Honolulu"));
        System.out.println("現在のハワイの時刻は" + sdf.format(date));
    }
}