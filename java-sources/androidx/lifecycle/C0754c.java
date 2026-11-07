package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f12650b;

    public C0754c(int i10, Method method) {
        this.f12649a = i10;
        this.f12650b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0754c)) {
            return false;
        }
        C0754c c0754c = (C0754c) obj;
        return this.f12649a == c0754c.f12649a && this.f12650b.getName().equals(c0754c.f12650b.getName());
    }

    public final int hashCode() {
        return this.f12650b.getName().hashCode() + (this.f12649a * 31);
    }
}
