package V1;

import android.content.SharedPreferences;
import java.util.Set;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8413b;

    public e(SharedPreferences sharedPreferences, Set set) {
        j.e(sharedPreferences, "prefs");
        this.f8412a = sharedPreferences;
        this.f8413b = set;
    }
}
