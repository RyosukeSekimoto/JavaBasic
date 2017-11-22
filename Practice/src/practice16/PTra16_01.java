package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */
    	 Date date = new Date();

         SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
         System.out.println(sdf.format(date));
    }
}