package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0835k implements InterfaceC0850n, InterfaceC0830j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f14346r = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final InterfaceC0850n c(String str) {
        HashMap map = this.f14346r;
        return map.containsKey(str) ? (InterfaceC0850n) map.get(str) : InterfaceC0850n.f14367i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final boolean e(String str) {
        return this.f14346r.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0835k) {
            return this.f14346r.equals(((C0835k) obj).f14346r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return new C0825i(this.f14346r.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        return "toString".equals(str) ? new C0865q(toString()) : android.support.v4.media.session.p.J(this, new C0865q(str), aVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f14346r.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final void j(String str, InterfaceC0850n interfaceC0850n) {
        HashMap map = this.f14346r;
        if (interfaceC0850n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0850n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        C0835k c0835k = new C0835k();
        for (Map.Entry entry : this.f14346r.entrySet()) {
            boolean z10 = entry.getValue() instanceof InterfaceC0830j;
            HashMap map = c0835k.f14346r;
            if (z10) {
                map.put((String) entry.getKey(), (InterfaceC0850n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC0850n) entry.getValue()).l());
            }
        }
        return c0835k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f14346r;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
