package android.slc.attachment.loading;

import android.slc.attachment.IBaseAttachment;
import android.slc.attachment.IBaseAttachmentItem;
import android.slc.attachment.bean.FileInfo;
import android.slc.attachment.bean.Progress;

/**
 * 加载进度item
 *
 * @param <T>
 * @param <F>
 * @param <P>
 */
@Deprecated
public interface ILoadingAttachmentItem<T extends IBaseAttachment, F extends FileInfo, P extends Progress> extends IBaseAttachmentItem<T>, OnAttachmentOperatingListener<F, P> {
}
