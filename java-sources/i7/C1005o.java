package i7;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* JADX INFO: renamed from: i7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1005o f17489f = new C1005o((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f17492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f17494e;

    public C1005o(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(G0.class);
        this.f17494e = enumMap;
        enumMap.put(G0.f16991u, bool == null ? E0.f16862s : bool.booleanValue() ? E0.f16865v : E0.f16864u);
        this.f17490a = i10;
        this.f17491b = d();
        this.f17492c = bool2;
        this.f17493d = str;
    }

    public static C1005o b(String str) {
        if (str == null || str.length() <= 0) {
            return f17489f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(G0.class);
        G0[] g0Arr = F0.DMA.f16878r;
        int length = g0Arr.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(g0Arr[i12], H0.e(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C1005o(enumMap, i10, (Boolean) null, (String) null);
    }

    public static C1005o c(int i10, Bundle bundle) {
        if (bundle == null) {
            return new C1005o((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(G0.class);
        for (G0 g10 : F0.DMA.f16878r) {
            enumMap.put(g10, H0.d(bundle.getString(g10.f16994r)));
        }
        return new C1005o(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final E0 a() {
        E0 e10 = (E0) this.f17494e.get(G0.f16991u);
        return e10 == null ? E0.f16862s : e10;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17490a);
        for (G0 g10 : F0.DMA.f16878r) {
            sb.append(":");
            sb.append(H0.h((E0) this.f17494e.get(g10)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1005o)) {
            return false;
        }
        C1005o c1005o = (C1005o) obj;
        if (this.f17491b.equalsIgnoreCase(c1005o.f17491b) && Objects.equals(this.f17492c, c1005o.f17492c)) {
            return Objects.equals(this.f17493d, c1005o.f17493d);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f17492c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f17493d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f17491b.hashCode() + (i10 * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(H0.a(this.f17490a));
        for (G0 g10 : F0.DMA.f16878r) {
            sb.append(",");
            sb.append(g10.f16994r);
            sb.append("=");
            E0 e10 = (E0) this.f17494e.get(g10);
            if (e10 == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = e10.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f17492c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f17493d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C1005o(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(G0.class);
        this.f17494e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17490a = i10;
        this.f17491b = d();
        this.f17492c = bool;
        this.f17493d = str;
    }
}
