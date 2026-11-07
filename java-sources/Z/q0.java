package Z;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f10765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u.F f10766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u.F f10767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f10768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f10769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u.F f10770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f10771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u.F f10772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Set f10773z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, u.F f3, u.F f7, List list, List list2, u.F f10, List list3, u.F f11, Set set) {
        super(1);
        this.f10765r = s0Var;
        this.f10766s = f3;
        this.f10767t = f7;
        this.f10768u = list;
        this.f10769v = list2;
        this.f10770w = f10;
        this.f10771x = list3;
        this.f10772y = f11;
        this.f10773z = set;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a1 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:11:0x0041, B:12:0x0046, B:19:0x0062, B:20:0x0063, B:21:0x0069, B:23:0x0070, B:26:0x0078, B:37:0x00a6, B:47:0x00c0, B:69:0x0121, B:77:0x0138, B:99:0x018d, B:106:0x01a1, B:107:0x01a3, B:109:0x01a7, B:110:0x01a8, B:112:0x01bb, B:113:0x01bc, B:102:0x0197, B:104:0x019d, B:105:0x01a0, B:72:0x012b, B:74:0x0130, B:75:0x0133, B:42:0x00b3, B:45:0x00bc, B:46:0x00bf, B:123:0x01de, B:125:0x01e7, B:151:0x024f, B:165:0x0282, B:127:0x01ed, B:128:0x01ef, B:150:0x024e, B:166:0x028a, B:167:0x028b, B:169:0x0292, B:174:0x029b, B:175:0x029e, B:176:0x029f, B:177:0x02a0, B:50:0x00cd, B:53:0x00de, B:55:0x00ee, B:57:0x00f8, B:59:0x00fe, B:71:0x0125, B:129:0x01f0, B:131:0x01fb, B:133:0x0207, B:135:0x020d, B:138:0x0214, B:139:0x0217, B:141:0x021f, B:143:0x022b, B:145:0x0231, B:148:0x0241, B:147:0x0239, B:149:0x0244, B:28:0x007e, B:30:0x0085, B:33:0x0093, B:35:0x009a, B:114:0x01bd, B:116:0x01c4, B:118:0x01d0, B:121:0x01d8, B:79:0x013e, B:82:0x0148, B:84:0x0157, B:86:0x0163, B:88:0x0169, B:168:0x028c, B:108:0x01a4, B:13:0x0047, B:15:0x0050, B:18:0x005d, B:153:0x0255, B:154:0x0258, B:156:0x025e, B:157:0x0269, B:159:0x026f, B:160:0x0277, B:41:0x00ad, B:101:0x0191), top: B:184:0x0041, inners: #1, #3, #4, #5, #6, #7, #8, #9, #10, #11, #12, #13 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x018d A[EDGE_INSN: B:211:0x018d->B:99:0x018d BREAK  A[LOOP:2: B:82:0x0148->B:98:0x0187], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x018d A[EDGE_INSN: B:212:0x018d->B:99:0x018d BREAK  A[LOOP:2: B:82:0x0148->B:98:0x0187], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0121 A[EDGE_INSN: B:214:0x0121->B:69:0x0121 BREAK  A[LOOP:4: B:53:0x00de->B:67:0x0118], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0121 A[EDGE_INSN: B:215:0x0121->B:69:0x0121 BREAK  A[LOOP:4: B:53:0x00de->B:67:0x0118], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee A[Catch: all -> 0x010a, TryCatch #1 {all -> 0x010a, blocks: (B:50:0x00cd, B:53:0x00de, B:55:0x00ee, B:57:0x00f8, B:59:0x00fe), top: B:182:0x00cd, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8 A[Catch: all -> 0x010a, TryCatch #1 {all -> 0x010a, blocks: (B:50:0x00cd, B:53:0x00de, B:55:0x00ee, B:57:0x00f8, B:59:0x00fe), top: B:182:0x00cd, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #1 {all -> 0x010a, blocks: (B:50:0x00cd, B:53:0x00de, B:55:0x00ee, B:57:0x00f8, B:59:0x00fe), top: B:182:0x00cd, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0118 A[LOOP:4: B:53:0x00de->B:67:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157 A[Catch: all -> 0x0177, TryCatch #7 {all -> 0x0177, blocks: (B:79:0x013e, B:82:0x0148, B:84:0x0157, B:86:0x0163, B:88:0x0169), top: B:193:0x013e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0163 A[Catch: all -> 0x0177, TryCatch #7 {all -> 0x0177, blocks: (B:79:0x013e, B:82:0x0148, B:84:0x0157, B:86:0x0163, B:88:0x0169), top: B:193:0x013e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0169 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #7 {all -> 0x0177, blocks: (B:79:0x013e, B:82:0x0148, B:84:0x0157, B:86:0x0163, B:88:0x0169), top: B:193:0x013e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187 A[LOOP:2: B:82:0x0148->B:98:0x0187, LOOP_END] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        Object[] objArr;
        char c10;
        long[] jArr;
        int length;
        long j;
        int i10;
        long j10;
        Object[] objArr2;
        int i11;
        int i12;
        Object[] objArr3;
        long[] jArr2;
        int length2;
        int i13;
        long j11;
        Object[] objArr4;
        long[] jArr3;
        int i14;
        int i15;
        long jLongValue = ((Number) obj).longValue();
        if (s0.s(this.f10765r)) {
            s0 s0Var = this.f10765r;
            Trace.beginSection("Recomposer:animation");
            try {
                s0Var.f10788a.c(jLongValue);
                p093j0.s.h();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        s0 s0Var2 = this.f10765r;
        u.F f3 = this.f10766s;
        u.F f7 = this.f10767t;
        List list = this.f10768u;
        List list2 = this.f10769v;
        u.F f10 = this.f10770w;
        List list3 = this.f10771x;
        u.F f11 = this.f10772y;
        Set set = this.f10773z;
        Trace.beginSection("Recomposer:recompose");
        try {
            s0.u(s0Var2);
            synchronized (s0Var2.f10789b) {
                try {
                    p011b0.e eVar = s0Var2.f10794h;
                    Object[] objArr5 = eVar.f13125r;
                    int i16 = eVar.f13127t;
                    for (int i17 = 0; i17 < i16; i17++) {
                        list.add((C0704u) objArr5[i17]);
                    }
                    s0Var2.f10794h.g();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f3.b();
            f7.b();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    int size = list.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        C0704u c0704u = (C0704u) list.get(i18);
                        C0704u c0704uT = s0.t(s0Var2, c0704u, f3);
                        if (c0704uT != null) {
                            list3.add(c0704uT);
                        }
                        f7.a(c0704u);
                    }
                    list.clear();
                    if (f3.h() || s0Var2.f10794h.f13127t != 0) {
                        synchronized (s0Var2.f10789b) {
                            try {
                                List listB = s0Var2.B();
                                int size2 = listB.size();
                                for (int i19 = 0; i19 < size2; i19++) {
                                    C0704u c0704u2 = (C0704u) listB.get(i19);
                                    if (!f7.c(c0704u2) && c0704u2.u(set)) {
                                        list.add(c0704u2);
                                    }
                                }
                                p011b0.e eVar2 = s0Var2.f10794h;
                                int i20 = eVar2.f13127t;
                                int i21 = 0;
                                for (int i22 = 0; i22 < i20; i22++) {
                                    C0704u c0704u3 = (C0704u) eVar2.f13125r[i22];
                                    if (!f7.c(c0704u3) && !list.contains(c0704u3)) {
                                        list.add(c0704u3);
                                        i21++;
                                    } else if (i21 > 0) {
                                        Object[] objArr6 = eVar2.f13125r;
                                        objArr6[i22 - i21] = objArr6[i22];
                                    }
                                }
                                int i23 = i20 - i21;
                                Arrays.fill(eVar2.f13125r, i23, i20, (Object) null);
                                eVar2.f13127t = i23;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (list.isEmpty()) {
                        try {
                            r0.n(list2, s0Var2);
                            while (!list2.isEmpty()) {
                                List listF = s0Var2.F(list2, f3);
                                f10.getClass();
                                Iterator it = listF.iterator();
                                while (it.hasNext()) {
                                    f10.j(it.next());
                                }
                                r0.n(list2, s0Var2);
                            }
                        } catch (Throwable th4) {
                            s0Var2.G(th4, null);
                            r0.m(s0Var2, list, list2, list3, f10, f11, f3, f7);
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        s0Var2.G(th5, null);
                        r0.m(s0Var2, list, list2, list3, f10, f11, f3, f7);
                        list.clear();
                    } catch (Throwable th6) {
                        list.clear();
                        throw th6;
                    }
                }
                Trace.endSection();
                return p110k9.y.f19095a;
            }
            if (list3.isEmpty()) {
                if (f10.h()) {
                    f11.k(f10);
                    objArr = f10.f22676b;
                    c10 = 7;
                    jArr = f10.f22675a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i10 = 0;
                        j = 128;
                        while (true) {
                            j10 = jArr[i10];
                            objArr2 = objArr;
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                if (i10 != length) {
                                    break;
                                    break;
                                }
                                i10++;
                                objArr = objArr2;
                            } else {
                                i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (i12 = 0; i12 < i11; i12++) {
                                    if ((j10 & 255) < 128) {
                                        ((C0704u) objArr2[(i10 << 3) + i12]).f();
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 == 8) {
                                    break;
                                    break;
                                }
                                if (i10 != length) {
                                    break;
                                    break;
                                }
                                i10++;
                                objArr = objArr2;
                            }
                        }
                    } else {
                        j = 128;
                    }
                    f10.b();
                } else {
                    c10 = 7;
                    j = 128;
                }
                if (f11.h()) {
                    objArr3 = f11.f22676b;
                    jArr2 = f11.f22675a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i13 = 0;
                        while (true) {
                            j11 = jArr2[i13];
                            objArr4 = objArr3;
                            jArr3 = jArr2;
                            if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                i14 = 8 - ((~(i13 - length2)) >>> 31);
                                for (i15 = 0; i15 < i14; i15++) {
                                    if ((j11 & 255) < j) {
                                        ((C0704u) objArr4[(i13 << 3) + i15]).g();
                                    }
                                    j11 >>= 8;
                                }
                                if (i14 == 8) {
                                    break;
                                    break;
                                }
                            }
                            if (i13 != length2) {
                                break;
                                break;
                            }
                            i13++;
                            objArr3 = objArr4;
                            jArr2 = jArr3;
                        }
                    }
                    f11.b();
                    synchronized (s0Var2.f10789b) {
                        s0Var2.y();
                        p093j0.n.k().m();
                        f7.b();
                        f3.b();
                        s0Var2.f10801p = null;
                    }
                } else {
                    synchronized (s0Var2.f10789b) {
                        s0Var2.y();
                        p093j0.n.k().m();
                        f7.b();
                        f3.b();
                        s0Var2.f10801p = null;
                    }
                }
            } else {
                try {
                    int size3 = list3.size();
                    for (int i24 = 0; i24 < size3; i24++) {
                        f11.a((C0704u) list3.get(i24));
                    }
                    int size4 = list3.size();
                    for (int i25 = 0; i25 < size4; i25++) {
                        ((C0704u) list3.get(i25)).d();
                    }
                    list3.clear();
                    if (f10.h()) {
                        try {
                            f11.k(f10);
                            objArr = f10.f22676b;
                            c10 = 7;
                            jArr = f10.f22675a;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i10 = 0;
                                j = 128;
                                while (true) {
                                    j10 = jArr[i10];
                                    objArr2 = objArr;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        if (i10 != length) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                        objArr = objArr2;
                                    } else {
                                        i11 = 8 - ((~(i10 - length)) >>> 31);
                                        while (i12 < i11) {
                                            if ((j10 & 255) < 128) {
                                                ((C0704u) objArr2[(i10 << 3) + i12]).f();
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i11 == 8) {
                                            break;
                                        }
                                        if (i10 != length) {
                                            break;
                                        }
                                        i10++;
                                        objArr = objArr2;
                                    }
                                }
                            } else {
                                j = 128;
                            }
                            f10.b();
                        } catch (Throwable th7) {
                            try {
                                s0Var2.G(th7, null);
                                r0.m(s0Var2, list, list2, list3, f10, f11, f3, f7);
                                f10.b();
                            } catch (Throwable th8) {
                                f10.b();
                                throw th8;
                            }
                        }
                    } else {
                        c10 = 7;
                        j = 128;
                    }
                    if (f11.h()) {
                        try {
                            objArr3 = f11.f22676b;
                            jArr2 = f11.f22675a;
                            length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                i13 = 0;
                                while (true) {
                                    j11 = jArr2[i13];
                                    objArr4 = objArr3;
                                    jArr3 = jArr2;
                                    if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i14 = 8 - ((~(i13 - length2)) >>> 31);
                                        while (i15 < i14) {
                                            if ((j11 & 255) < j) {
                                                ((C0704u) objArr4[(i13 << 3) + i15]).g();
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i14 == 8) {
                                            break;
                                        }
                                    }
                                    if (i13 != length2) {
                                        break;
                                    }
                                    i13++;
                                    objArr3 = objArr4;
                                    jArr2 = jArr3;
                                }
                            }
                            f11.b();
                            synchronized (s0Var2.f10789b) {
                                s0Var2.y();
                            }
                            p093j0.n.k().m();
                            f7.b();
                            f3.b();
                            s0Var2.f10801p = null;
                        } catch (Throwable th9) {
                            try {
                                s0Var2.G(th9, null);
                                r0.m(s0Var2, list, list2, list3, f10, f11, f3, f7);
                                f11.b();
                            } catch (Throwable th10) {
                                f11.b();
                                throw th10;
                            }
                        }
                    } else {
                        synchronized (s0Var2.f10789b) {
                            s0Var2.y();
                            p093j0.n.k().m();
                            f7.b();
                            f3.b();
                            s0Var2.f10801p = null;
                        }
                    }
                } catch (Throwable th11) {
                    try {
                        s0Var2.G(th11, null);
                        r0.m(s0Var2, list, list2, list3, f10, f11, f3, f7);
                        list3.clear();
                    } catch (Throwable th12) {
                        list3.clear();
                        throw th12;
                    }
                }
            }
            Trace.endSection();
            return p110k9.y.f19095a;
        } catch (Throwable th13) {
            Trace.endSection();
            throw th13;
        }
    }
}
