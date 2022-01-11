
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
import java.util.Arrays;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
        	byte[] bs = toGBK("中文");
        	System.out.println(Arrays.toString(bs));
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println(e);
		}
    	
        
    }

    static byte[] toGBK(String s) throws UnsupportedEncodingException{
        return s.getBytes("GBK");
//    	 try {
//             // 用指定编码转换String为byte[]:
//             return s.getBytes("GBK");
//         } catch (UnsupportedEncodingException e) {
//             // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
//             System.out.println(e); // 打印异常信息
//             return s.getBytes(); // 尝试使用用默认编码
//         }
    }
}
