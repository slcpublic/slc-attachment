package android.slc.attachment.bean;

import java.io.Serializable;

public class Progress {
    public static final int NONE = 0;         //无状态
    public static final int WAITING = 1;      //等待
    public static final int LOADING = 2;      //下载中
    public static final int PAUSE = 3;        //暂停
    public static final int ERROR = 4;        //错误
    public static final int FINISH = 5;       //完成

    public String tag;                              //下载的标识键
    public String url;                              //网址
    public String folder;                           //保存文件夹
    public String filePath;                         //保存文件地址
    public String fileName;                         //保存的文件名
    public int fraction;                          //下载的进度，0-100
    public long totalSize=0;                          //总字节长度, byte
    public long currentSize;                        //本次下载的大小, byte
    public transient long speed;                    //网速，byte/s
    public int status;                              //当前状态
    public Serializable extra1;                     //额外的数据
    public Serializable extra2;                     //额外的数据
    public Serializable extra3;                     //额外的数据

}
