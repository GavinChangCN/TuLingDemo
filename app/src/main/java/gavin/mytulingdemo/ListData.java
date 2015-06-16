package gavin.mytulingdemo;

/**
 * @Description: 封装数据测试
 * User: Gavin章华隽
 * Date: 2015-03-25
 * Time: 20:16
 */
public class ListData {
    private String content ;
    public static final int SEND = 1 ;
    public static final int RECEIVE = 2 ;
    private int flag ;
    private String time ;

    public ListData(String content , int flag , String time ) {
        setContent(content) ;
        setFlag(flag) ;
        setTime(time) ;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}