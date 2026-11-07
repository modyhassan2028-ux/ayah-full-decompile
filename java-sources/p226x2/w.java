package p226x2;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: loaded from: classes.dex */
public final class w implements View.OnKeyListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f24358r;

    public w(SeekBarPreference seekBarPreference) {
        this.f24358r = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f24358r;
        if ((!seekBarPreference.f12801k0 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.f12799i0;
        if (seekBar != null) {
            return seekBar.onKeyDown(i10, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }
}
