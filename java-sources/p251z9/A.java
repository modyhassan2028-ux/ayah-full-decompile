package p251z9;

import java.util.List;
import p120l9.m;
import p171r0.a;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24860b;

    public A(e eVar, List list) {
        j.e(list, "arguments");
        this.f24859a = eVar;
        this.f24860b = list;
    }

    public final String a(boolean z10) {
        String name;
        String strL0;
        e eVar = this.f24859a;
        Class clsD = a.d(eVar);
        if (!clsD.isArray()) {
            name = (z10 && clsD.isPrimitive()) ? a.e(eVar).getName() : clsD.getName();
        } else if (clsD.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsD.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsD.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsD.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsD.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsD.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsD.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsD.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        if (this.f24860b.isEmpty()) {
            strL0 = "";
        } else {
            strL0 = m.l0(this.f24860b, ", ", "<", ">", new E5.a(23, this), 24);
        }
        return name + strL0 + "";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        return this.f24859a.equals(a9.f24859a) && j.a(this.f24860b, a9.f24860b);
    }

    public final int hashCode() {
        return (this.f24860b.hashCode() + (this.f24859a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
