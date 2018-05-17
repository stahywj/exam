import java.util.Date;

/**
 * @author yanwenjing@meituan.com
 * @date 2018/4/24
 * @time 下午2:41
 **/
public class execption {
    void test() throws SupplyInventoryException {
        int i = 0;
        if (i == 0){
            System.out.println("hahahhaha");
            throw new SupplyInventoryException("24334", new Date().toString());
        }
    }
}
