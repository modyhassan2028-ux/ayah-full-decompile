package p251z9;

import F9.b;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements b, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient b f24869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f24870s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Class f24871t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f24872u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f24873v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f24874w;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f24870s = obj;
        this.f24871t = cls;
        this.f24872u = str;
        this.f24873v = str2;
        this.f24874w = z10;
    }

    public abstract b b();

    public final d c() {
        Class cls = this.f24871t;
        if (cls == null) {
            return null;
        }
        if (!this.f24874w) {
            return w.a(cls);
        }
        w.f24887a.getClass();
        return new n(cls);
    }
}
