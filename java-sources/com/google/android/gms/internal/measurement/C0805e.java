package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0805e implements InterfaceC0850n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14230r;

    public C0805e(Boolean bool) {
        this.f14230r = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        return Double.valueOf(true != this.f14230r ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        return Boolean.valueOf(this.f14230r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0805e) && this.f14230r == ((C0805e) obj).f14230r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z10 = this.f14230r;
        if (zEquals) {
            return new C0865q(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(Boolean.toString(z10) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        return Boolean.toString(this.f14230r);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f14230r).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return new C0805e(Boolean.valueOf(this.f14230r));
    }

    public final String toString() {
        return String.valueOf(this.f14230r);
    }
}
