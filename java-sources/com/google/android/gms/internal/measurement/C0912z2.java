package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0912z2 extends LinkedHashMap {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0912z2 f14516s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14517r = true;

    static {
        C0912z2 c0912z2 = new C0912z2();
        f14516s = c0912z2;
        c0912z2.f14517r = false;
    }

    public static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC0838k2) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC0863p2.f14382a;
        int i10 = length;
        for (byte b5 : bArr) {
            i10 = (i10 * 31) + b5;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final C0912z2 a() {
        if (isEmpty()) {
            return new C0912z2();
        }
        C0912z2 c0912z2 = new C0912z2(this);
        c0912z2.f14517r = true;
        return c0912z2;
    }

    public final void c() {
        if (!this.f14517r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = 0;
        for (Map.Entry entry : entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        Charset charset = AbstractC0863p2.f14382a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0863p2.f14382a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
