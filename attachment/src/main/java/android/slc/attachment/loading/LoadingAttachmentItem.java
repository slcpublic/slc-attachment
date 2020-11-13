package android.slc.attachment.loading;

import android.slc.attachment.BaseAttachmentItem;
import android.slc.attachment.bean.FileInfo;
import android.slc.attachment.bean.Progress;

public abstract class LoadingAttachmentItem<T extends ILoadingAttachment, F extends FileInfo, P extends Progress> extends
        BaseAttachmentItem<T> implements ILoadingAttachmentItem<T, F, P> {
    /*@Override
    public abstract void onNext(F data);*/

    @Override
    public void destroy() {
        super.destroy();
        if (mAttachment != null) {
            mAttachment.setOnAttachmentOperatingListener(null);
        }
    }
}
