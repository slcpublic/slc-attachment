package android.slc.attachment;

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;

/**
 * 附件的布局管理
 *
 * @param <T>
 */
@Deprecated
public interface IBaseAttachmentsLayoutManage<T extends IBaseAttachment, V extends ViewGroup> {
    void addAttachmentItem(T attachment);

    void addAttachments(List<T> attachmentList);

    Context getContext();

    void setOnAttachmentActionListener(IBaseAttachmentItem.OnAttachmentActionListener<T> onAttachmentActionListener);
    void removeAttachmentItem(int index);
    void removeAllAttachmentItem();
    void destroy();
}
