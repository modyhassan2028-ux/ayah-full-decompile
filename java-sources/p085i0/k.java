package p085i0;

import F9.n;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p074h0.i;
import p120l9.s;
import p241y9.a;
import p241y9.c;
import u.E;
import u.M;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f16729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f16730c;

    public k(Map map, c cVar) {
        E e10;
        this.f16728a = cVar;
        if (map == null || map.isEmpty()) {
            e10 = null;
        } else {
            e10 = new E(map.size());
            for (Map.Entry entry : map.entrySet()) {
                e10.l(entry.getKey(), entry.getValue());
            }
        }
        this.f16729b = e10;
    }

    @Override // p085i0.j
    public final boolean b(Object obj) {
        return ((Boolean) this.f16728a.e(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p085i0.j
    public final Map c() {
        char c10;
        long j;
        long j10;
        long j11;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        E e10 = this.f16729b;
        if (e10 == null && this.f16730c == null) {
            return s.f19441r;
        }
        int i12 = 0;
        int i13 = e10 != null ? e10.f22673e : 0;
        E e11 = this.f16730c;
        HashMap map = new HashMap(i13 + (e11 != null ? e11.f22673e : 0));
        char c11 = 7;
        long j12 = -9187201950435737472L;
        int i14 = 8;
        if (e10 != null) {
            Object[] objArr = e10.f22670b;
            Object[] objArr2 = e10.f22671c;
            long[] jArr3 = e10.f22669a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j10 = 128;
                while (true) {
                    long j13 = jArr3[i15];
                    j11 = 255;
                    if ((((~j13) << c11) & j13 & j12) != j12) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j13 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                map.put((String) objArr[i18], (List) objArr2[i18]);
                            }
                            j13 >>= 8;
                            i17++;
                            c11 = c11;
                            j12 = j12;
                        }
                        c10 = c11;
                        j = j12;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        c10 = c11;
                        j = j12;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    c11 = c10;
                    j12 = j;
                }
            } else {
                c10 = 7;
                j = -9187201950435737472L;
                j10 = 128;
                j11 = 255;
            }
        } else {
            c10 = 7;
            j = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        E e12 = this.f16730c;
        if (e12 != null) {
            Object[] objArr3 = e12.f22670b;
            Object[] objArr4 = e12.f22671c;
            long[] jArr4 = e12.f22669a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                while (true) {
                    long j14 = jArr4[i19];
                    if ((((~j14) << c10) & j14 & j) != j) {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        int i21 = i12;
                        while (i21 < i20) {
                            if ((j14 & j11) < j10) {
                                int i22 = (i19 << 3) + i21;
                                Object obj = objArr3[i22];
                                List list = (List) objArr4[i22];
                                String str = (String) obj;
                                i11 = i14;
                                if (list.size() == 1) {
                                    Object objInvoke = ((a) list.get(i12)).invoke();
                                    if (objInvoke != null) {
                                        if (!b(objInvoke)) {
                                            throw new IllegalStateException(g.t(objInvoke).toString());
                                        }
                                        Object[] objArr5 = new Object[1];
                                        objArr5[i12] = objInvoke;
                                        map.put(str, AbstractC0813f2.m(objArr5));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i12 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((a) list.get(i12)).invoke();
                                        if (objInvoke2 != null && !b(objInvoke2)) {
                                            throw new IllegalStateException(g.t(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i12++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i11 = i14;
                            }
                            j14 >>= i11;
                            i21++;
                            i14 = i11;
                            jArr4 = jArr2;
                            i12 = 0;
                        }
                        jArr = jArr4;
                        i10 = i14;
                        if (i20 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i10 = i14;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i19++;
                    i14 = i10;
                    jArr4 = jArr;
                    i12 = 0;
                }
            }
        }
        return map;
    }

    @Override // p085i0.j
    public final Object d(String str) {
        E e10 = this.f16729b;
        List list = e10 != null ? (List) e10.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && e10 != null) {
            List listSubList = list.subList(1, list.size());
            int iF = e10.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = e10.f22671c;
            Object obj = objArr[iF];
            e10.f22670b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // p085i0.j
    public final i e(String str, a aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!n.I(str.charAt(i10))) {
                E e10 = this.f16730c;
                if (e10 == null) {
                    long[] jArr = M.f22699a;
                    e10 = new E();
                    this.f16730c = e10;
                }
                Object objG = e10.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    e10.l(str, objG);
                }
                ((List) objG).add(aVar);
                return new i(e10, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
