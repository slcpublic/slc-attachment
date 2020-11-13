package android.slc.attachment;


import android.slc.attachment.bean.NetBody;

public interface IBaseAttachment<L, N extends NetBody> {
    /**
     * 获取本地主体，一般为附件的信息
     *
     * @return
     */
    L getLocalBody();

    void setLocalBody(L localBody);

    boolean isLocalBody();

    /**
     * 获取本地路径
     */
    void setLocalPath(String path);

    /**
     * 设置本地路径
     *
     * @return
     */
    String getLocalPath();

    /**
     * 获取网络主体
     * 如果附件为本地上传，则网络信息必定为空，上传完成后，则赋值改网络信息
     *
     * @return
     */
    N getNetBody();

    /**
     * 设置网络主体
     *
     * @param netPath
     */
    void setNetBody(N netPath);

    /**
     * 是否存在网络信息
     * 根据网络信息是否为空来进行判断
     *
     * @return
     */
    boolean isNetBody();

    /**
     * 获取网络路径
     */
    void setNetPath(String path);

    /**
     * 设置网络路径
     *
     * @return
     */
    String getNetPath();

}
