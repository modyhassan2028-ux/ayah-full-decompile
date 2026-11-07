package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0820h implements InterfaceC0850n, InterfaceC0830j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f14326s = new HashMap();

    public AbstractC0820h(String str) {
        this.f14325r = str;
    }

    public abstract InterfaceC0850n a(Aa.a aVar, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final InterfaceC0850n c(String str) {
        HashMap map = this.f14326s;
        return map.containsKey(str) ? (InterfaceC0850n) map.get(str) : InterfaceC0850n.f14367i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final boolean e(String str) {
        return this.f14326s.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0820h)) {
            return false;
        }
        AbstractC0820h abstractC0820h = (AbstractC0820h) obj;
        String str = this.f14325r;
        if (str != null) {
            return str.equals(abstractC0820h.f14325r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return new C0825i(this.f14326s.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        return "toString".equals(str) ? new C0865q(this.f14325r) : android.support.v4.media.session.p.J(this, new C0865q(str), aVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        return this.f14325r;
    }

    public final int hashCode() {
        String str = this.f14325r;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final void j(String str, InterfaceC0850n interfaceC0850n) {
        HashMap map = this.f14326s;
        if (interfaceC0850n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0850n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public InterfaceC0850n l() {
        return this;
    }
}
