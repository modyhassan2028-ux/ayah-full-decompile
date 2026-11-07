package G3;

import A3.d;
import F9.f;
import O8.c;
import android.content.Context;
import android.content.SharedPreferences;
import p185s8.u0;
import p251z9.j;
import p251z9.p;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f2791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W1.a f2792c;

    static {
        p pVar = new p(a.class);
        w.f24887a.getClass();
        f2791b = new f[]{pVar};
        f2790a = new a();
        f2792c = u0.x("ayah_prefs", new c(new d(27)), new d(28), 8);
    }

    public static SharedPreferences a(Context context) {
        j.e(context, "applicationContext");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        j.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
