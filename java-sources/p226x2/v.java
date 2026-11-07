package p226x2;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: loaded from: classes.dex */
public final class v implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f24357a;

    public v(SeekBarPreference seekBarPreference) {
        this.f24357a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        SeekBarPreference seekBarPreference = this.f24357a;
        if (!z10 || (!seekBarPreference.f12803m0 && seekBarPreference.f12798h0)) {
            int i11 = i10 + seekBarPreference.f12795e0;
            TextView textView = seekBarPreference.f12800j0;
            if (textView != null) {
                textView.setText(String.valueOf(i11));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.f12795e0;
        if (progress != seekBarPreference.f12794d0) {
            seekBarPreference.B(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f24357a.f12798h0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.f24357a;
        seekBarPreference.f12798h0 = false;
        int progress2 = seekBar.getProgress();
        int i10 = seekBarPreference.f12795e0;
        if (progress2 + i10 == seekBarPreference.f12794d0 || (progress = seekBar.getProgress() + i10) == seekBarPreference.f12794d0) {
            return;
        }
        seekBarPreference.B(progress, false);
    }
}
