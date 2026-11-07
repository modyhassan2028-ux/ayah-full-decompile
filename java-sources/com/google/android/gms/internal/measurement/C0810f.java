package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0810f implements InterfaceC0850n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0850n f14241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14242s;

    public C0810f(String str) {
        this.f14241r = InterfaceC0850n.f14367i;
        this.f14242s = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0810f)) {
            return false;
        }
        C0810f c0810f = (C0810f) obj;
        return this.f14242s.equals(c0810f.f14242s) && this.f14241r.equals(c0810f.f14241r);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.f14241r.hashCode() + (this.f14242s.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return new C0810f(this.f14242s, this.f14241r.l());
    }

    public C0810f(String str, InterfaceC0850n interfaceC0850n) {
        this.f14241r = interfaceC0850n;
        this.f14242s = str;
    }
}
