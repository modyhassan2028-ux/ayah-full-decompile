package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0736j;
import io.realm.RealmFieldTypeConstants;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0803d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f14224c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M2 f14225a = new M2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14226b;

    static {
        new C0803d2(0);
    }

    public C0803d2() {
    }

    public static void b(C0788a2 c0788a2, W2 w9, int i10, Object obj) throws C0736j {
        if (w9 == W2.f14156u) {
            Charset charset = AbstractC0863p2.f14382a;
            c0788a2.h0(i10, 3);
            ((AbstractC0828i2) ((T1) obj)).d(c0788a2);
            c0788a2.h0(i10, 4);
            return;
        }
        c0788a2.h0(i10, w9.f14159s);
        X2 x9 = X2.f14164r;
        switch (w9.ordinal()) {
            case 0:
                c0788a2.t0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0788a2.r0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0788a2.s0(((Long) obj).longValue());
                break;
            case 3:
                c0788a2.s0(((Long) obj).longValue());
                break;
            case 4:
                c0788a2.p0(((Integer) obj).intValue());
                break;
            case 5:
                c0788a2.t0(((Long) obj).longValue());
                break;
            case 6:
                c0788a2.r0(((Integer) obj).intValue());
                break;
            case 7:
                c0788a2.o0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof Z1)) {
                    c0788a2.v0((String) obj);
                } else {
                    c0788a2.n0((Z1) obj);
                }
                break;
            case 9:
                ((AbstractC0828i2) ((T1) obj)).d(c0788a2);
                break;
            case 10:
                c0788a2.getClass();
                AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) ((T1) obj);
                c0788a2.q0(abstractC0828i2.k());
                abstractC0828i2.d(c0788a2);
                break;
            case 11:
                if (!(obj instanceof Z1)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0788a2.q0(length);
                    c0788a2.u0(length, bArr);
                } else {
                    c0788a2.n0((Z1) obj);
                }
                break;
            case 12:
                c0788a2.q0(((Integer) obj).intValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                if (!(obj instanceof InterfaceC0838k2)) {
                    c0788a2.p0(((Integer) obj).intValue());
                } else {
                    c0788a2.p0(((InterfaceC0838k2) obj).a());
                }
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                c0788a2.r0(((Integer) obj).intValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                c0788a2.t0(((Long) obj).longValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                c0788a2.q0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0788a2.s0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f14226b) {
            return;
        }
        M2 m10 = this.f14225a;
        int i10 = m10.f14072s;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = m10.a(i11).f14079s;
            if (obj instanceof AbstractC0828i2) {
                ((AbstractC0828i2) obj).g();
            }
        }
        Iterator it = m10.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC0828i2) {
                ((AbstractC0828i2) value).g();
            }
        }
        if (!m10.f14074u) {
            if (m10.f14072s > 0) {
                m10.a(0).f14078r.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = m10.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!m10.f14074u) {
            m10.f14073t = m10.f14073t.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(m10.f14073t);
            m10.f14076w = m10.f14076w.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(m10.f14076w);
            m10.f14074u = true;
        }
        this.f14226b = true;
    }

    public final Object clone() {
        C0803d2 c0803d2 = new C0803d2();
        M2 m10 = this.f14225a;
        if (m10.f14072s > 0) {
            m10.a(0).f14078r.getClass();
            throw new ClassCastException();
        }
        Iterator it = m10.b().iterator();
        if (!it.hasNext()) {
            return c0803d2;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0803d2) {
            return this.f14225a.equals(((C0803d2) obj).f14225a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14225a.hashCode();
    }

    public C0803d2(int i10) {
        a();
        a();
    }
}
