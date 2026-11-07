package p143o2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f20265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f20266b;

    public c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f20266b = onAudioFocusChangeListener;
        this.f20265a = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f20266b.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        Handler handler = this.f20265a;
        handler.sendMessage(Message.obtain(handler, 2782386, i10, 0));
    }
}
