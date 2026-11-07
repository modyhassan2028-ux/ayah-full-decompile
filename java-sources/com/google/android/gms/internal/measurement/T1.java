package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class T1 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = AbstractC0863p2.f14382a;
        iterable.getClass();
        if (iterable instanceof InterfaceC0882t2) {
            List listA = ((InterfaceC0882t2) iterable).a();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof Z1) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                Z1.e(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof G2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof I2) {
                I2 i10 = (I2) list;
                int i11 = i10.f14050t + size;
                int length = i10.f14049s.length;
                if (i11 > length) {
                    if (length != 0) {
                        while (length < i11) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        i10.f14049s = Arrays.copyOf(i10.f14049s, length);
                    } else {
                        i10.f14049s = new Object[Math.max(i11, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC0823h2.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list2.get(i12);
            if (obj2 == null) {
                AbstractC0823h2.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) this;
            int iK = abstractC0828i2.k();
            byte[] bArr = new byte[iK];
            C0788a2 c0788a2 = new C0788a2(iK, bArr);
            abstractC0828i2.d(c0788a2);
            if (iK - c0788a2.f14198i == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e10);
        }
    }

    public abstract int b(K2 k7);
}
