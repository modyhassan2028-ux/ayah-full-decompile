package com.squareup.moshi;

import androidx.datastore.preferences.protobuf.C0736j;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f15451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f15452u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15453v;

    public abstract boolean A();

    public abstract double E();

    public abstract int F();

    public abstract void H();

    public abstract String L();

    public abstract int N();

    public final void O(int i10) {
        int i11 = this.f15449r;
        int[] iArr = this.f15450s;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new A6.a("Nesting too deep at " + s());
            }
            this.f15450s = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f15451t;
            this.f15451t = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f15452u;
            this.f15452u = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f15450s;
        int i12 = this.f15449r;
        this.f15449r = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int V(m mVar);

    public abstract int X(m mVar);

    public abstract void b();

    public abstract void b0();

    public abstract void c0();

    public final void d0(String str) throws C0736j {
        throw new C0736j(str + " at path " + s());
    }

    public abstract void e();

    public abstract void i();

    public abstract void n();

    public final String s() {
        return p017b7.g.d0(this.f15449r, this.f15450s, this.f15451t, this.f15452u);
    }

    public abstract boolean w();
}
