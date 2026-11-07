package androidx.window.layout;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13058a;

    public A(List list) {
        this.f13058a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !A.class.equals(obj.getClass())) {
            return false;
        }
        return this.f13058a.equals(((A) obj).f13058a);
    }

    public final int hashCode() {
        return this.f13058a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return p120l9.m.l0(this.f13058a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
