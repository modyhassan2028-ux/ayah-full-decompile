package p030c9;

import X4.c;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p018b9.d;
import p035d3.l;
import p035d3.n;
import p051e9.a;
import p251z9.j;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p051e9.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13580r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13581s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Activity f13582t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13583u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile a f13584v;

    public b(Activity activity) {
        this.f13582t = activity;
        this.f13583u = new b((ComponentActivity) activity);
    }

    private final Object b() {
        if (((l) this.f13584v) == null) {
            synchronized (this.f13581s) {
                try {
                    if (((l) this.f13584v) == null) {
                        this.f13584v = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (l) this.f13584v;
    }

    public static T e(V v10, Context context) {
        d dVar = new d(1, context);
        j.e(v10, "owner");
        return new T(v10.g(), dVar, v10 instanceof InterfaceC0762k ? ((InterfaceC0762k) v10).f() : p105k2.a.f18957b);
    }

    public l a() {
        String str;
        Activity activity = this.f13582t;
        if (activity.getApplication() instanceof p051e9.b) {
            n nVar = (n) ((a) AbstractC0813f2.C((b) this.f13583u, a.class));
            return new l(nVar.f15626a, nVar.f15627b, activity);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // p051e9.b
    public final Object c() {
        switch (this.f13580r) {
            case 0:
                return b();
            default:
                if (((n) this.f13584v) == null) {
                    synchronized (this.f13581s) {
                        try {
                            if (((n) this.f13584v) == null) {
                                this.f13584v = ((d) e((ComponentActivity) this.f13582t, (ComponentActivity) this.f13583u).a(w.a(d.class))).f13585b;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return (n) this.f13584v;
        }
    }

    public c d() {
        b bVar = (b) this.f13583u;
        return ((d) e((ComponentActivity) bVar.f13582t, (ComponentActivity) bVar.f13583u).a(w.a(d.class))).f13586c;
    }

    public b(ComponentActivity componentActivity) {
        this.f13582t = componentActivity;
        this.f13583u = componentActivity;
    }
}
