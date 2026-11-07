package p143o2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
