package androidx.datastore.preferences.protobuf;

import io.realm.RealmFieldTypeConstants;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0742p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12490c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f12491a = Y.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12492b;

    static {
        new C0742p(0);
    }

    public C0742p() {
    }

    public static void b(C0737k c0737k, r0 r0Var, int i10, Object obj) {
        if (r0Var == r0.f12501u) {
            c0737k.s0(i10, 3);
            ((AbstractC0727a) obj).b(c0737k);
            c0737k.s0(i10, 4);
        }
        c0737k.s0(i10, r0Var.f12505s);
        switch (r0Var.ordinal()) {
            case 0:
                c0737k.m0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0737k.k0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0737k.w0(((Long) obj).longValue());
                break;
            case 3:
                c0737k.w0(((Long) obj).longValue());
                break;
            case 4:
                c0737k.o0(((Integer) obj).intValue());
                break;
            case 5:
                c0737k.m0(((Long) obj).longValue());
                break;
            case 6:
                c0737k.k0(((Integer) obj).intValue());
                break;
            case 7:
                c0737k.e0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0733g)) {
                    c0737k.r0((String) obj);
                } else {
                    c0737k.i0((C0733g) obj);
                }
                break;
            case 9:
                ((AbstractC0727a) obj).b(c0737k);
                break;
            case 10:
                AbstractC0727a abstractC0727a = (AbstractC0727a) obj;
                c0737k.getClass();
                c0737k.u0(((AbstractC0746u) abstractC0727a).a(null));
                abstractC0727a.b(c0737k);
                break;
            case 11:
                if (!(obj instanceof C0733g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0737k.u0(length);
                    c0737k.f0(bArr, 0, length);
                } else {
                    c0737k.i0((C0733g) obj);
                }
                break;
            case 12:
                c0737k.u0(((Integer) obj).intValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                c0737k.o0(((Integer) obj).intValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                c0737k.k0(((Integer) obj).intValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                c0737k.m0(((Long) obj).longValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                c0737k.u0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0737k.w0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f12492b) {
            return;
        }
        Y y10 = this.f12491a;
        int size = y10.f12420r.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry entryC = y10.c(i10);
            if (entryC.getValue() instanceof AbstractC0746u) {
                AbstractC0746u abstractC0746u = (AbstractC0746u) entryC.getValue();
                abstractC0746u.getClass();
                T t2 = T.f12406c;
                t2.getClass();
                t2.a(abstractC0746u.getClass()).e(abstractC0746u);
                abstractC0746u.h();
            }
        }
        if (!y10.f12422t) {
            if (y10.f12420r.size() > 0) {
                y10.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y10.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y10.f12422t) {
            y10.f12421s = y10.f12421s.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(y10.f12421s);
            y10.f12424v = y10.f12424v.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(y10.f12424v);
            y10.f12422t = true;
        }
        this.f12492b = true;
    }

    public final Object clone() {
        C0742p c0742p = new C0742p();
        Y y10 = this.f12491a;
        if (y10.f12420r.size() > 0) {
            Map.Entry entryC = y10.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = y10.d().iterator();
        if (!it.hasNext()) {
            return c0742p;
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
        if (obj instanceof C0742p) {
            return this.f12491a.equals(((C0742p) obj).f12491a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12491a.hashCode();
    }

    public C0742p(int i10) {
        a();
        a();
    }
}
