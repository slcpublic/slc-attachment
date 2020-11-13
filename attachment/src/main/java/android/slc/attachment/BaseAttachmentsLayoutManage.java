package android.slc.attachment;

import android.content.Context;
import android.view.ViewGroup;

import androidx.collection.SimpleArrayMap;

public abstract class BaseAttachmentsLayoutManage<T extends IBaseAttachment, V extends ViewGroup> implements IBaseAttachmentsLayoutManage<T, V> {
    protected V mAttachmentsLayout;
    protected SimpleArrayMap<IBaseAttachment, IBaseAttachmentItem> mAttachmentItemList = new SimpleArrayMap<>();
    protected IBaseAttachmentItem.OnAttachmentActionListener<T> mOnAttachmentActionListener;

    public BaseAttachmentsLayoutManage(V attachmentsLayout) {
        mAttachmentsLayout = attachmentsLayout;
    }

    @Override
    public void setOnAttachmentActionListener(IBaseAttachmentItem.OnAttachmentActionListener<T> onAttachmentActionListener) {
        this.mOnAttachmentActionListener = onAttachmentActionListener;
    }

    @Override
    public Context getContext() {
        return mAttachmentsLayout.getContext();
    }

    @Override
    public void removeAllAttachmentItem() {
        mAttachmentsLayout.removeAllViews();
    }

    @Override
    public void removeAttachmentItem(int index) {
        mAttachmentsLayout.removeViewAt(index);
    }

    @Override
    public void destroy() {
        for (int i = 0; i < mAttachmentItemList.size(); i++) {
            mAttachmentItemList.valueAt(i).destroy();
        }
    }
}
