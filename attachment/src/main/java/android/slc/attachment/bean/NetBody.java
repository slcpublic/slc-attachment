package android.slc.attachment.bean;

/**
 * @author slc
 * @date 2020-09-03 13:47
 */
public interface NetBody<T> {
    /**
     * 获取网络主体id
     *
     * @return
     */
    T getNetBodyId();

    /**
     * 设置网络主体id
     *
     * @param netBodyId
     */
    void setNetBodyId(T netBodyId);

    /**
     * 获取网路主体名称
     *
     * @return
     */
    String getNetBodyName();

    /**
     * 设置网络主体名称
     *
     * @param netBodyName
     */
    void setNetBodyName(String netBodyName);

    /**
     * 获取网络文件路径
     *
     * @return
     */
    String getNetBodyPath();

    /**
     * 设置网络文件路径
     *
     * @param netBodyPath
     */
    void setNetBodyPath(String netBodyPath);
}
