package android.slc.attachment.loading;

import android.slc.attachment.bean.FileInfo;
import android.slc.attachment.bean.Progress;

public interface OnAttachmentOperatingListener<F extends FileInfo, P extends Progress> {
    void onStart(P progress);

    void onProgress(P progress);

    void onFinish(String s, P progress);

    void onNext(F data);

    void onError(int errorCode, String errorMessage);
}