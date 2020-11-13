package android.slc.attachment.loading;


import android.slc.attachment.IBaseAttachment;
import android.slc.attachment.bean.FileInfo;
import android.slc.attachment.bean.NetBody;
import android.slc.attachment.bean.Progress;

/**
 * 加载附件的附件 用于上传或者下载
 *
 * @param <L> 本地主体
 * @param <N> 网络主体
 * @param <F> 文件信息
 * @param <P> 进度回调
 * @param <P>
 */
public interface ILoadingAttachment<L, N extends NetBody, F extends FileInfo, P extends Progress> extends IBaseAttachment<L, N> {

    /**
     * 附件操作监听
     * 如上传下载
     *
     * @return
     */
    OnAttachmentOperatingListener<F, P> getOnAttachmentOperatingListener();

    /**
     * 设置附件操作监听
     *
     * @param operatingListener
     */
    void setOnAttachmentOperatingListener(OnAttachmentOperatingListener<F, P> operatingListener);

}
