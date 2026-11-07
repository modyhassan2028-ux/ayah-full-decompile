package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855o implements InterfaceC0850n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f14377s;

    public C0855o(String str, ArrayList arrayList) {
        this.f14376r = str;
        ArrayList arrayList2 = new ArrayList();
        this.f14377s = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0855o)) {
            return false;
        }
        C0855o c0855o = (C0855o) obj;
        String str = c0855o.f14376r;
        String str2 = this.f14376r;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f14377s.equals(c0855o.f14377s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f14376r;
        return this.f14377s.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return this;
    }
}
