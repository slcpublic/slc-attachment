package android.slc.attachment;


import android.slc.attachment.bean.NetBody;

public abstract class BaseAttachment<L, N extends NetBody<?>> implements IBaseAttachment<L, N> {
    protected L mLocalBody;
    protected N mNetBody;

    @Override
    public L getLocalBody() {
        return mLocalBody;
    }

    @Override
    public void setLocalBody(L localBody) {
        this.mLocalBody = localBody;
    }

    @Override
    public boolean isLocalBody() {
        return this.mLocalBody != null;
    }

    @Override
    public N getNetBody() {
        return mNetBody;
    }

    @Override
    public void setNetBody(N netBody) {
        this.mNetBody = netBody;
    }

    @Override
    public boolean isNetBody() {
        return this.mNetBody != null;
    }
}
