package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0790b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p029c8.g f14202d = p029c8.g.h(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14205c;

    public C0790b(String str, long j, HashMap map) {
        this.f14203a = str;
        this.f14204b = j;
        HashMap map2 = new HashMap();
        this.f14205c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f14202d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0790b clone() {
        return new C0790b(this.f14203a, this.f14204b, new HashMap(this.f14205c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0790b)) {
            return false;
        }
        C0790b c0790b = (C0790b) obj;
        if (this.f14204b == c0790b.f14204b && this.f14203a.equals(c0790b.f14203a)) {
            return this.f14205c.equals(c0790b.f14205c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14203a.hashCode() * 31;
        long j = this.f14204b;
        return this.f14205c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f14203a;
        String string = this.f14205c.toString();
        int length = String.valueOf(str).length();
        long j = this.f14204b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
