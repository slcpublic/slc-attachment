package android.slc.attachment.loading;

import android.slc.attachment.BaseAttachment;
import android.slc.attachment.bean.FileInfo;
import android.slc.attachment.bean.NetBody;
import android.slc.attachment.bean.Progress;

/**
 * 加载附件的附件类型
 *
 * @param <L>
 * @param <N>
 * @param <F>
 * @param <P>
 */
public abstract class LoadingAttachment<L, N extends NetBody<?>, F extends FileInfo, P extends Progress> extends BaseAttachment<L, N> implements ILoadingAttachment<L, N, F, P> {
    private P progress;
    private OnAttachmentOperatingListener<F, P> mOnAttachmentOperatingListener;

    @Override
    public OnAttachmentOperatingListener<F, P> getOnAttachmentOperatingListener() {
        return this.mOnAttachmentOperatingListener;
    }

    @Override
    public void setOnAttachmentOperatingListener(OnAttachmentOperatingListener<F, P> operatingListener) {
        this.mOnAttachmentOperatingListener = operatingListener;
    }

    @Override
    public P getProgress() {
        return progress;
    }

    @Override
    public void setProgress(P progress) {
        this.progress = progress;
    }
}
