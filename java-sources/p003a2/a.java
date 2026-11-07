package p003a2;

import W2.k;
import X4.c;
import android.os.SystemClock;
import android.support.v4.media.session.r;
import android.view.Choreographer;
import java.util.ArrayList;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f11124r;

    public a(r rVar) {
        this.f11124r = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x012d  */
    /* JADX WARN: Code duplicated, block: B:38:0x013a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0155  */
    /* JADX WARN: Code duplicated, block: B:45:0x016a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0181  */
    /* JADX WARN: Code duplicated, block: B:51:0x0183  */
    /* JADX WARN: Code duplicated, block: B:53:0x0185 A[LOOP:1: B:43:0x0164->B:53:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0190  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0199 A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j10;
        long j11;
        int i10;
        float f3;
        f fVar;
        boolean z10;
        ArrayList arrayList;
        ThreadLocal threadLocal;
        b bVar;
        ArrayList arrayList2;
        int iIndexOf;
        int i11;
        int size;
        float f7;
        float f10;
        b bVar2 = (b) ((c) this.f11124r.f11364s).f9953r;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList3 = bVar2.f11127b;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        boolean z11 = false;
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            e eVar = (e) arrayList3.get(i12);
            if (eVar == null) {
                i10 = i12;
            } else {
                O o10 = bVar2.f11126a;
                Long l10 = (Long) o10.get(eVar);
                if (l10 == null) {
                    j10 = eVar.f11147i;
                    if (j10 == 0) {
                        eVar.f11147i = jUptimeMillis;
                        eVar.a(eVar.f11141b);
                        i10 = i12;
                    } else {
                        j11 = jUptimeMillis - j10;
                        eVar.f11147i = jUptimeMillis;
                        if (eVar.f11152o) {
                            f10 = eVar.f11151n;
                            if (f10 != Float.MAX_VALUE) {
                                eVar.f11150m.f11160i = f10;
                                eVar.f11151n = Float.MAX_VALUE;
                            }
                            eVar.f11141b = (float) eVar.f11150m.f11160i;
                            eVar.f11140a = 0.0f;
                            eVar.f11152o = z11;
                            i10 = i12;
                        } else {
                            if (eVar.f11151n != Float.MAX_VALUE) {
                                f fVar2 = eVar.f11150m;
                                double d5 = fVar2.f11160i;
                                i10 = i12;
                                long j12 = j11 / 2;
                                d dVarB = fVar2.b(eVar.f11141b, eVar.f11140a, j12);
                                f fVar3 = eVar.f11150m;
                                fVar3.f11160i = eVar.f11151n;
                                eVar.f11151n = Float.MAX_VALUE;
                                d dVarB2 = fVar3.b(dVarB.f11132a, dVarB.f11133b, j12);
                                eVar.f11141b = dVarB2.f11132a;
                                eVar.f11140a = dVarB2.f11133b;
                            } else {
                                i10 = i12;
                                d dVarB3 = eVar.f11150m.b(eVar.f11141b, eVar.f11140a, j11);
                                eVar.f11141b = dVarB3.f11132a;
                                eVar.f11140a = dVarB3.f11133b;
                            }
                            float fMax = Math.max(eVar.f11141b, eVar.f11146h);
                            eVar.f11141b = fMax;
                            float fMin = Math.min(fMax, eVar.g);
                            eVar.f11141b = fMin;
                            f3 = eVar.f11140a;
                            fVar = eVar.f11150m;
                            fVar.getClass();
                            if (Math.abs(f3) < fVar.f11157e) {
                            }
                            z10 = false;
                            float fMin2 = Math.min(eVar.f11141b, eVar.g);
                            eVar.f11141b = fMin2;
                            float fMax2 = Math.max(fMin2, eVar.f11146h);
                            eVar.f11141b = fMax2;
                            eVar.a(fMax2);
                            if (z10) {
                                arrayList = eVar.f11148k;
                                eVar.f11145f = false;
                                threadLocal = b.f11125f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                bVar = (b) threadLocal.get();
                                bVar.f11126a.remove(eVar);
                                arrayList2 = bVar.f11127b;
                                iIndexOf = arrayList2.indexOf(eVar);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    bVar.f11130e = true;
                                }
                                eVar.f11147i = 0L;
                                eVar.f11142c = false;
                                for (i11 = 0; i11 < arrayList.size(); i11++) {
                                    if (arrayList.get(i11) != null) {
                                        k kVar = (k) arrayList.get(i11);
                                        f7 = eVar.f11141b;
                                        kVar.getClass();
                                        if (f7 < 1.0f) {
                                            throw null;
                                        }
                                        throw null;
                                    }
                                }
                                for (size = arrayList.size() - 1; size >= 0; size--) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z10 = true;
                        float fMin3 = Math.min(eVar.f11141b, eVar.g);
                        eVar.f11141b = fMin3;
                        float fMax3 = Math.max(fMin3, eVar.f11146h);
                        eVar.f11141b = fMax3;
                        eVar.a(fMax3);
                        if (z10) {
                            arrayList = eVar.f11148k;
                            eVar.f11145f = false;
                            threadLocal = b.f11125f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new b());
                            }
                            bVar = (b) threadLocal.get();
                            bVar.f11126a.remove(eVar);
                            arrayList2 = bVar.f11127b;
                            iIndexOf = arrayList2.indexOf(eVar);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                bVar.f11130e = true;
                            }
                            eVar.f11147i = 0L;
                            eVar.f11142c = false;
                            while (i11 < arrayList.size()) {
                                if (arrayList.get(i11) != null) {
                                    k kVar2 = (k) arrayList.get(i11);
                                    f7 = eVar.f11141b;
                                    kVar2.getClass();
                                    if (f7 < 1.0f) {
                                        throw null;
                                    }
                                    throw null;
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (l10.longValue() < jUptimeMillis2) {
                    o10.remove(eVar);
                    j10 = eVar.f11147i;
                    if (j10 == 0) {
                        eVar.f11147i = jUptimeMillis;
                        eVar.a(eVar.f11141b);
                        i10 = i12;
                    } else {
                        j11 = jUptimeMillis - j10;
                        eVar.f11147i = jUptimeMillis;
                        if (eVar.f11152o) {
                            f10 = eVar.f11151n;
                            if (f10 != Float.MAX_VALUE) {
                                eVar.f11150m.f11160i = f10;
                                eVar.f11151n = Float.MAX_VALUE;
                            }
                            eVar.f11141b = (float) eVar.f11150m.f11160i;
                            eVar.f11140a = 0.0f;
                            eVar.f11152o = z11;
                            i10 = i12;
                        } else {
                            if (eVar.f11151n != Float.MAX_VALUE) {
                                f fVar4 = eVar.f11150m;
                                double d9 = fVar4.f11160i;
                                i10 = i12;
                                long j13 = j11 / 2;
                                d dVarB4 = fVar4.b(eVar.f11141b, eVar.f11140a, j13);
                                f fVar5 = eVar.f11150m;
                                fVar5.f11160i = eVar.f11151n;
                                eVar.f11151n = Float.MAX_VALUE;
                                d dVarB5 = fVar5.b(dVarB4.f11132a, dVarB4.f11133b, j13);
                                eVar.f11141b = dVarB5.f11132a;
                                eVar.f11140a = dVarB5.f11133b;
                            } else {
                                i10 = i12;
                                d dVarB6 = eVar.f11150m.b(eVar.f11141b, eVar.f11140a, j11);
                                eVar.f11141b = dVarB6.f11132a;
                                eVar.f11140a = dVarB6.f11133b;
                            }
                            float fMax4 = Math.max(eVar.f11141b, eVar.f11146h);
                            eVar.f11141b = fMax4;
                            float fMin4 = Math.min(fMax4, eVar.g);
                            eVar.f11141b = fMin4;
                            f3 = eVar.f11140a;
                            fVar = eVar.f11150m;
                            fVar.getClass();
                            if (Math.abs(f3) < fVar.f11157e || Math.abs(fMin4 - ((float) fVar.f11160i)) >= fVar.f11156d) {
                                z10 = false;
                            } else {
                                eVar.f11141b = (float) eVar.f11150m.f11160i;
                                eVar.f11140a = 0.0f;
                            }
                            float fMin5 = Math.min(eVar.f11141b, eVar.g);
                            eVar.f11141b = fMin5;
                            float fMax5 = Math.max(fMin5, eVar.f11146h);
                            eVar.f11141b = fMax5;
                            eVar.a(fMax5);
                            if (z10) {
                                arrayList = eVar.f11148k;
                                eVar.f11145f = false;
                                threadLocal = b.f11125f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                bVar = (b) threadLocal.get();
                                bVar.f11126a.remove(eVar);
                                arrayList2 = bVar.f11127b;
                                iIndexOf = arrayList2.indexOf(eVar);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    bVar.f11130e = true;
                                }
                                eVar.f11147i = 0L;
                                eVar.f11142c = false;
                                while (i11 < arrayList.size()) {
                                    if (arrayList.get(i11) != null) {
                                        k kVar3 = (k) arrayList.get(i11);
                                        f7 = eVar.f11141b;
                                        kVar3.getClass();
                                        if (f7 < 1.0f) {
                                            throw null;
                                        }
                                        throw null;
                                    }
                                }
                                while (size >= 0) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z10 = true;
                        float fMin6 = Math.min(eVar.f11141b, eVar.g);
                        eVar.f11141b = fMin6;
                        float fMax6 = Math.max(fMin6, eVar.f11146h);
                        eVar.f11141b = fMax6;
                        eVar.a(fMax6);
                        if (z10) {
                            arrayList = eVar.f11148k;
                            eVar.f11145f = false;
                            threadLocal = b.f11125f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new b());
                            }
                            bVar = (b) threadLocal.get();
                            bVar.f11126a.remove(eVar);
                            arrayList2 = bVar.f11127b;
                            iIndexOf = arrayList2.indexOf(eVar);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                bVar.f11130e = true;
                            }
                            eVar.f11147i = 0L;
                            eVar.f11142c = false;
                            while (i11 < arrayList.size()) {
                                if (arrayList.get(i11) != null) {
                                    k kVar4 = (k) arrayList.get(i11);
                                    f7 = eVar.f11141b;
                                    kVar4.getClass();
                                    if (f7 < 1.0f) {
                                        throw null;
                                    }
                                    throw null;
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    i10 = i12;
                }
            }
            i12 = i10 + 1;
            z11 = false;
        }
        if (bVar2.f11130e) {
            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                if (arrayList3.get(size2) == null) {
                    arrayList3.remove(size2);
                }
            }
            bVar2.f11130e = false;
        }
        if (arrayList3.size() > 0) {
            if (bVar2.f11129d == null) {
                bVar2.f11129d = new r(bVar2.f11128c);
            }
            r rVar = bVar2.f11129d;
            ((Choreographer) rVar.f11365t).postFrameCallback((a) rVar.f11366u);
        }
    }
}
