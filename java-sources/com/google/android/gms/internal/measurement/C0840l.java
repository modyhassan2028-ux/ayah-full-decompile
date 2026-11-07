package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0840l implements InterfaceC0850n {
    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C0840l;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        return "null";
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return InterfaceC0850n.j;
    }
}
