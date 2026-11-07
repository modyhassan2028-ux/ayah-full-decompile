package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b8.d f14020b;

    public E1(Context context, b8.d dVar) {
        this.f14019a = context;
        this.f14020b = dVar;
    }

    public final boolean equals(Object obj) {
        b8.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof E1) {
            E1 e10 = (E1) obj;
            b8.d dVar2 = e10.f14020b;
            if (this.f14019a.equals(e10.f14019a) && ((dVar = this.f14020b) != null ? dVar.equals(dVar2) : dVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14019a.hashCode() ^ 1000003;
        b8.d dVar = this.f14020b;
        return (iHashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        String string = this.f14019a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f14020b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        p245z2.a.I(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
