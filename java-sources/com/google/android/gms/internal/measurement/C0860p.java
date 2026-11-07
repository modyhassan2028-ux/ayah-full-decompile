package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0860p implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14380s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14381t;

    public /* synthetic */ C0860p(int i10, Object obj) {
        this.f14379r = i10;
        this.f14381t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14379r) {
            case 0:
                return this.f14380s < ((C0865q) this.f14381t).f14388r.length();
            case 1:
                return this.f14380s < ((C0865q) this.f14381t).f14388r.length();
            default:
                return this.f14380s < ((C0800d) this.f14381t).o();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f14379r) {
            case 0:
                String str = ((C0865q) this.f14381t).f14388r;
                int i10 = this.f14380s;
                if (i10 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f14380s = i10 + 1;
                return new C0865q(String.valueOf(i10));
            case 1:
                C0865q c0865q = (C0865q) this.f14381t;
                String str2 = c0865q.f14388r;
                int i11 = this.f14380s;
                if (i11 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f14380s = i11 + 1;
                return new C0865q(String.valueOf(c0865q.f14388r.charAt(i11)));
            default:
                C0800d c0800d = (C0800d) this.f14381t;
                if (this.f14380s < c0800d.o()) {
                    int i12 = this.f14380s;
                    this.f14380s = i12 + 1;
                    return c0800d.p(i12);
                }
                int i13 = this.f14380s;
                StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i13);
                throw new NoSuchElementException(sb.toString());
        }
    }
}
