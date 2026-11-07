package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t f15506z = new t();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v f15513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public v f15514y;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15510u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15511v = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Comparator f15507r = f15506z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f15509t = new w();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w[] f15508s = new w[16];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15512w = 12;

    public final w a(Object obj, boolean z10) {
        int iCompareTo;
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        w wVar5;
        w wVar6;
        w[] wVarArr = this.f15508s;
        int iHashCode = obj.hashCode();
        int i10 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i11 = ((i10 >>> 7) ^ i10) ^ (i10 >>> 4);
        boolean z11 = true;
        int length = i11 & (wVarArr.length - 1);
        w wVar7 = wVarArr[length];
        t tVar = f15506z;
        w wVar8 = null;
        Comparator comparator = this.f15507r;
        if (wVar7 != null) {
            Comparable comparable = comparator == tVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = wVar7.f15502w;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return wVar7;
                }
                w wVar9 = iCompareTo < 0 ? wVar7.f15498s : wVar7.f15499t;
                if (wVar9 == null) {
                    break;
                }
                wVar7 = wVar9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        w wVar10 = this.f15509t;
        if (wVar7 != null) {
            w wVar11 = wVar7;
            wVar = new w(wVar11, obj, i11, wVar10, wVar10.f15501v);
            if (iCompareTo < 0) {
                wVar11.f15498s = wVar;
            } else {
                wVar11.f15499t = wVar;
            }
            b(wVar11, true);
        } else {
            if (comparator == tVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            wVar = new w(wVar7, obj, i11, wVar10, wVar10.f15501v);
            wVarArr[length] = wVar;
        }
        int i12 = this.f15510u;
        this.f15510u = i12 + 1;
        if (i12 > this.f15512w) {
            w[] wVarArr2 = this.f15508s;
            int length2 = wVarArr2.length;
            int i13 = length2 * 2;
            w[] wVarArr3 = new w[i13];
            E2.A a9 = new E2.A(5);
            E2.A a10 = new E2.A(5);
            int i14 = 0;
            while (i14 < length2) {
                w wVar12 = wVarArr2[i14];
                if (wVar12 == null) {
                    z11 = z11;
                    wVar3 = wVar8;
                } else {
                    w wVar13 = wVar8;
                    for (w wVar14 = wVar12; wVar14 != null; wVar14 = wVar14.f15498s) {
                        wVar14.f15497r = wVar13;
                        wVar13 = wVar14;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (wVar13 != null) {
                            w wVar15 = wVar13.f15497r;
                            wVar13.f15497r = wVar8;
                            w wVar16 = wVar13.f15499t;
                            while (true) {
                                w wVar17 = wVar16;
                                wVar2 = wVar15;
                                wVar15 = wVar17;
                                if (wVar15 == null) {
                                    break;
                                }
                                wVar15.f15497r = wVar2;
                                wVar16 = wVar15.f15498s;
                            }
                        } else {
                            w wVar18 = wVar13;
                            wVar13 = wVar8;
                            wVar2 = wVar18;
                        }
                        if (wVar13 == null) {
                            break;
                        }
                        if ((wVar13.f15503x & length2) == 0) {
                            i15++;
                        } else {
                            i16++;
                        }
                        wVar13 = wVar2;
                        z11 = z11;
                        wVar8 = null;
                    }
                    a9.f1434b = ((Integer.highestOneBit(i15) * 2) - 1) - i15;
                    a9.f1436d = 0;
                    a9.f1435c = 0;
                    wVar3 = null;
                    a9.f1437e = null;
                    a10.f1434b = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    a10.f1436d = 0;
                    a10.f1435c = 0;
                    a10.f1437e = null;
                    w wVar19 = null;
                    while (wVar12 != null) {
                        wVar12.f15497r = wVar19;
                        w wVar20 = wVar12;
                        wVar12 = wVar12.f15498s;
                        wVar19 = wVar20;
                    }
                    while (true) {
                        if (wVar19 != null) {
                            w wVar21 = wVar19.f15497r;
                            wVar19.f15497r = null;
                            w wVar22 = wVar19.f15499t;
                            while (true) {
                                w wVar23 = wVar22;
                                wVar4 = wVar21;
                                wVar21 = wVar23;
                                if (wVar21 == null) {
                                    break;
                                }
                                wVar21.f15497r = wVar4;
                                wVar22 = wVar21.f15498s;
                            }
                        } else {
                            wVar4 = wVar19;
                            wVar19 = null;
                        }
                        if (wVar19 == null) {
                            break;
                        }
                        if ((wVar19.f15503x & length2) == 0) {
                            a9.a(wVar19);
                        } else {
                            a10.a(wVar19);
                        }
                        wVar19 = wVar4;
                    }
                    if (i15 > 0) {
                        wVar5 = (w) a9.f1437e;
                        if (wVar5.f15497r != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        wVar5 = null;
                    }
                    wVarArr3[i14] = wVar5;
                    int i17 = i14 + length2;
                    if (i16 > 0) {
                        wVar6 = (w) a10.f1437e;
                        if (wVar6.f15497r != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        wVar6 = null;
                    }
                    wVarArr3[i17] = wVar6;
                }
                i14++;
                wVar8 = wVar3;
                z11 = z11;
            }
            this.f15508s = wVarArr3;
            this.f15512w = (i13 / 4) + (i13 / 2);
        }
        this.f15511v++;
        return wVar;
    }

    public final void b(w wVar, boolean z10) {
        while (wVar != null) {
            w wVar2 = wVar.f15498s;
            w wVar3 = wVar.f15499t;
            int i10 = wVar2 != null ? wVar2.f15505z : 0;
            int i11 = wVar3 != null ? wVar3.f15505z : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                w wVar4 = wVar3.f15498s;
                w wVar5 = wVar3.f15499t;
                int i13 = (wVar4 != null ? wVar4.f15505z : 0) - (wVar5 != null ? wVar5.f15505z : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    f(wVar3);
                }
                e(wVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                w wVar6 = wVar2.f15498s;
                w wVar7 = wVar2.f15499t;
                int i14 = (wVar6 != null ? wVar6.f15505z : 0) - (wVar7 != null ? wVar7.f15505z : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    e(wVar2);
                }
                f(wVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                wVar.f15505z = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                wVar.f15505z = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            wVar = wVar.f15497r;
        }
    }

    public final void c(w wVar, boolean z10) {
        w wVar2;
        w wVar3;
        int i10;
        if (z10) {
            w wVar4 = wVar.f15501v;
            wVar4.f15500u = wVar.f15500u;
            wVar.f15500u.f15501v = wVar4;
            wVar.f15501v = null;
            wVar.f15500u = null;
        }
        w wVar5 = wVar.f15498s;
        w wVar6 = wVar.f15499t;
        w wVar7 = wVar.f15497r;
        int i11 = 0;
        if (wVar5 == null || wVar6 == null) {
            if (wVar5 != null) {
                d(wVar, wVar5);
                wVar.f15498s = null;
            } else if (wVar6 != null) {
                d(wVar, wVar6);
                wVar.f15499t = null;
            } else {
                d(wVar, null);
            }
            b(wVar7, false);
            this.f15510u--;
            this.f15511v++;
            return;
        }
        if (wVar5.f15505z > wVar6.f15505z) {
            w wVar8 = wVar5.f15499t;
            while (true) {
                w wVar9 = wVar8;
                wVar3 = wVar5;
                wVar5 = wVar9;
                if (wVar5 == null) {
                    break;
                } else {
                    wVar8 = wVar5.f15499t;
                }
            }
        } else {
            w wVar10 = wVar6.f15498s;
            while (true) {
                wVar2 = wVar6;
                wVar6 = wVar10;
                if (wVar6 == null) {
                    break;
                } else {
                    wVar10 = wVar6.f15498s;
                }
            }
            wVar3 = wVar2;
        }
        c(wVar3, false);
        w wVar11 = wVar.f15498s;
        if (wVar11 != null) {
            i10 = wVar11.f15505z;
            wVar3.f15498s = wVar11;
            wVar11.f15497r = wVar3;
            wVar.f15498s = null;
        } else {
            i10 = 0;
        }
        w wVar12 = wVar.f15499t;
        if (wVar12 != null) {
            i11 = wVar12.f15505z;
            wVar3.f15499t = wVar12;
            wVar12.f15497r = wVar3;
            wVar.f15499t = null;
        }
        wVar3.f15505z = Math.max(i10, i11) + 1;
        d(wVar, wVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f15508s, (Object) null);
        this.f15510u = 0;
        this.f15511v++;
        w wVar = this.f15509t;
        w wVar2 = wVar.f15500u;
        while (wVar2 != wVar) {
            w wVar3 = wVar2.f15500u;
            wVar2.f15501v = null;
            wVar2.f15500u = null;
            wVar2 = wVar3;
        }
        wVar.f15501v = wVar;
        wVar.f15500u = wVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        w wVarA = null;
        if (obj != null) {
            try {
                wVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return wVarA != null;
    }

    public final void d(w wVar, w wVar2) {
        w wVar3 = wVar.f15497r;
        wVar.f15497r = null;
        if (wVar2 != null) {
            wVar2.f15497r = wVar3;
        }
        if (wVar3 == null) {
            int i10 = wVar.f15503x;
            w[] wVarArr = this.f15508s;
            wVarArr[i10 & (wVarArr.length - 1)] = wVar2;
        } else if (wVar3.f15498s == wVar) {
            wVar3.f15498s = wVar2;
        } else {
            wVar3.f15499t = wVar2;
        }
    }

    public final void e(w wVar) {
        w wVar2 = wVar.f15498s;
        w wVar3 = wVar.f15499t;
        w wVar4 = wVar3.f15498s;
        w wVar5 = wVar3.f15499t;
        wVar.f15499t = wVar4;
        if (wVar4 != null) {
            wVar4.f15497r = wVar;
        }
        d(wVar, wVar3);
        wVar3.f15498s = wVar;
        wVar.f15497r = wVar3;
        int iMax = Math.max(wVar2 != null ? wVar2.f15505z : 0, wVar4 != null ? wVar4.f15505z : 0) + 1;
        wVar.f15505z = iMax;
        wVar3.f15505z = Math.max(iMax, wVar5 != null ? wVar5.f15505z : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        v vVar = this.f15513x;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this, 0);
        this.f15513x = vVar2;
        return vVar2;
    }

    public final void f(w wVar) {
        w wVar2 = wVar.f15498s;
        w wVar3 = wVar.f15499t;
        w wVar4 = wVar2.f15498s;
        w wVar5 = wVar2.f15499t;
        wVar.f15498s = wVar5;
        if (wVar5 != null) {
            wVar5.f15497r = wVar;
        }
        d(wVar, wVar2);
        wVar2.f15499t = wVar;
        wVar.f15497r = wVar2;
        int iMax = Math.max(wVar3 != null ? wVar3.f15505z : 0, wVar5 != null ? wVar5.f15505z : 0) + 1;
        wVar.f15505z = iMax;
        wVar2.f15505z = Math.max(iMax, wVar4 != null ? wVar4.f15505z : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        w wVarA;
        if (obj != null) {
            try {
                wVarA = a(obj, false);
            } catch (ClassCastException unused) {
                wVarA = null;
            }
        } else {
            wVarA = null;
        }
        if (wVarA != null) {
            return wVarA.f15504y;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        v vVar = this.f15514y;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this, 1);
        this.f15514y = vVar2;
        return vVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        w wVarA = a(obj, true);
        Object obj3 = wVarA.f15504y;
        wVarA.f15504y = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        w wVarA;
        if (obj != null) {
            try {
                wVarA = a(obj, false);
            } catch (ClassCastException unused) {
                wVarA = null;
            }
        } else {
            wVarA = null;
        }
        if (wVarA != null) {
            c(wVarA, true);
        }
        if (wVarA != null) {
            return wVarA.f15504y;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15510u;
    }
}
