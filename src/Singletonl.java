/**
 * @author: wbb
 * @date 2021/11/12 10:27 上午
 */
public final class Singletonl {

    private Singletonl() {
    }
    public int i;

    // 按需实例化
    public static Singletonl Instance()
    {
        return Nested.instance;
    }

    static class Nested{
        private Nested(){}

        private static Singletonl instance = new Singletonl();
    }

}

/** 法1 : 线程不安全版本
 * public final class Singletonl {
 *
 *     private Singletonl() {
 *     }
 *     public int i;
 *
 *     private static Singletonl instance = null;
 *
 *     public static Singletonl Instance()
 *     {
 *         if(null == instance){
 *             instance = new Singletonl();
 *         }
 *         return instance;
 *     }
 * }
 *
 *
 */
/** 法2 ：线程安全版本
 * public final class Singletonl {
 *
 *     private Singletonl() {
 *     }
 *     public int i;
 *
 *     private static Singletonl instance = null;
 *
 *     public static Singletonl Instance()
 *     {
 *         // 因为lock的成本较高，所以先判空
 *         if(null == instance){
 *             if(lock()){
 *                 instance = new Singletonl();
 *             }
 *         }
 *         return instance;
 *     }
 *
 * }
 */

/** 法3：静态构造版本
 * public final class Singletonl {
 *
 *     private Singletonl() {
 *     }
 *     public int i;
 *
 *     // 过早实例化（运行时），降低内存使用效率
 *     private static Singletonl instance = new Singletonl();
 *
 *     public static Singletonl Instance()
 *     {
 *         return instance
 *     }
 *
 * }
 */