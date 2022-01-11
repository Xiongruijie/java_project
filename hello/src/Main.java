
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
        	byte[] bs = toGBK("����");
        	System.out.println(Arrays.toString(bs));
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println(e);
		}
    	
        
    }

    static byte[] toGBK(String s) throws UnsupportedEncodingException{
        return s.getBytes("GBK");
//    	 try {
//             // ��ָ������ת��StringΪbyte[]:
//             return s.getBytes("GBK");
//         } catch (UnsupportedEncodingException e) {
//             // ���ϵͳ��֧��GBK���룬�Ჶ��UnsupportedEncodingException:
//             System.out.println(e); // ��ӡ�쳣��Ϣ
//             return s.getBytes(); // ����ʹ����Ĭ�ϱ���
//         }
    }
}
