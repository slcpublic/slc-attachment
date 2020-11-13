package android.slc.attachment;

import android.view.View;

import java.util.Map;

/**
 * 附件的item接口
 */
public interface IBaseAttachmentItem<T extends IBaseAttachment> {
    /**
     * 设置附件
     *
     * @param mAttachment
     */
    void setAttachment(T mAttachment);

    T getAttachment();

    /**
     * 获取item的view
     *
     * @return
     */
    View getView();

    /**
     * 设置附件的事件
     *
     * @param attachmentActionListener
     */
    void setOnAttachmentActionListener(OnAttachmentActionListener<T> attachmentActionListener);

    void destroy();

    /**
     * 对附件的一些操作事件
     */
    interface OnAttachmentActionListener<T> {
        /**
         * 对附件的操作事件
         *
         * @param eventCode  事件代码 参考{@link com.slc.commonlist.utils.attachment.AttachmentOperatingEvent}
         * @param attachment 附件
         */
        void onOperating(int eventCode, T attachment, Map<String, Object> extra);
    }
}
