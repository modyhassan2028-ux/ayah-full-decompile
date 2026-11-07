package p226x2;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24317c;

    public o(Preference preference) {
        this.f24317c = preference.getClass().getName();
        this.f24315a = preference.U;
        this.f24316b = preference.f12753V;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f24315a == oVar.f24315a && this.f24316b == oVar.f24316b && TextUtils.equals(this.f24317c, oVar.f24317c);
    }

    public final int hashCode() {
        return this.f24317c.hashCode() + ((((527 + this.f24315a) * 31) + this.f24316b) * 31);
    }
}
