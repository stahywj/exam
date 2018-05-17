/**
 * @author yanwenjing@meituan.com
 * @date 2018/4/24
 * @time 下午2:44
 **/
class SupplyInventoryException extends Exception {
    public SupplyInventoryException(String message, String s) {
    }

    public SupplyInventoryException(String message) {
        super(message);
    }

    public SupplyInventoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public SupplyInventoryException(Throwable cause) {
        super(cause);
    }

}
