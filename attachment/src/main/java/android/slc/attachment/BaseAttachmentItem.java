package android.slc.attachment;

import android.view.View;

/**
 * 附件的item基础类
 *
 * @param <T> 附件
 */
public class BaseAttachmentItem<T extends IBaseAttachment> implements IBaseAttachmentItem<T> {
    protected T mAttachment;
    protected View mItemView;
    protected OnAttachmentActionListener<T> mOnAttachmentActionListener;

    @Override
    public void setAttachment(T attachment) {
        this.mAttachment = attachment;
    }

    @Override
    public T getAttachment() {
        return this.mAttachment;
    }

    @Override
    public View getView() {
        return mItemView;
    }

    @Override
    public void setOnAttachmentActionListener(OnAttachmentActionListener<T> attachmentActionListener) {
        this.mOnAttachmentActionListener = attachmentActionListener;
    }

    @Override
    public void destroy() {

    }
}
