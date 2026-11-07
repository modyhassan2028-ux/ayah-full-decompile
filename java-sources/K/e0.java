package K;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public enum e0 {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll),
    Autofill(Build.VERSION.SDK_INT <= 26 ? com.ayah.R.string.autofill : R.string.autofill);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4629r;

    e0(int i10) {
        this.f4629r = i10;
    }
}
