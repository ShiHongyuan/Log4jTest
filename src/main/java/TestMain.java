import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



public class TestMain {
    // 生成记录器实例
    // 获取一个有名称的记录器实例，记录器名称是可以传递任何字符串，通常是类或包的名称
    private static Logger log = Logger.getLogger(TestMain.class.getName());
    // 获取没有名称的根记录器
    private static Logger rootLog = Logger.getRootLogger();

    // 根记录器是最基本配置的默认值，可以通过程序修改根记录器setXXX，也可以修改log4j.properties



    public static void main(String[] args) {

        // 获取默认情况下的级别 --  DEBUG
        System.out.println(rootLog.getLevel());
        // 获取默认情况下的appender  -- null
        System.out.println(rootLog.getAllAppenders());

        // 修改记录器的级别
        log.setLevel(Level.INFO);

        // 打印日志方法
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");



        // log4j.properties配置根记录器，在src/main/resources加一个文件log4j.properties

    }


}
