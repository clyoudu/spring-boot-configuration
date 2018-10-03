package github.clyoudu.starter.business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/3
 * @time 17:42
 * @desc ClyouduMustLoadClass
 */
public class ClyouduMustLoadClass {

    private String author = "clyoudu";

    private String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    public ClyouduMustLoadClass(String author, String date) {
        this.author = author;
        this.date = date;
    }

    @Override
    public String toString() {
        return "[" + date + "]" + author + " start up this application.";
    }
}
