package p226x2;

import M.k;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24331b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f24332c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f24333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences.Editor f24334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24335f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PreferenceScreen f24336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PreferenceFragmentCompat f24337i;
    public PreferenceFragmentCompat j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PreferenceFragmentCompat f24338k;

    public r(Context context) {
        this.f24330a = context;
        this.g = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (this.f24333d != null) {
            return null;
        }
        if (!this.f24335f) {
            return c().edit();
        }
        if (this.f24334e == null) {
            this.f24334e = c().edit();
        }
        return this.f24334e;
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = this.f24331b;
            this.f24331b = 1 + j;
        }
        return j;
    }

    public final SharedPreferences c() {
        if (this.f24333d != null) {
            return null;
        }
        if (this.f24332c == null) {
            this.f24332c = this.f24330a.getSharedPreferences(this.g, 0);
        }
        return this.f24332c;
    }
}
