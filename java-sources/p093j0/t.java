package p093j0;

import J0.s0;
import Z.B;
import Z.C;
import Z.C0672b;
import Z.C0696n;
import Z.F0;
import Z.S;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p011b0.e;
import p011b0.h;
import p085i0.f;
import p241y9.a;
import p241y9.c;
import p251z9.j;
import u.E;
import u.F;
import u.z;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f18678c;
    public int j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18679d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E f18680e = g.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f18681f = new E();
    public final F g = new F();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f18682h = new e(new C[16]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0696n f18683i = new C0696n(1, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f18684k = g.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f18685l = new HashMap();

    public t(c cVar) {
        this.f18676a = cVar;
    }

    public final void a(Object obj, f fVar, a aVar) {
        boolean z10;
        int i10;
        int i11;
        Object obj2 = this.f18677b;
        z zVar = this.f18678c;
        int i12 = this.f18679d;
        this.f18677b = obj;
        this.f18678c = (z) this.f18681f.g(obj);
        if (this.f18679d == -1) {
            long jG = n.k().g();
            this.f18679d = (int) (jG ^ (jG >>> 32));
        }
        C0696n c0696n = this.f18683i;
        e eVarN = C0672b.n();
        boolean z11 = true;
        try {
            eVarN.b(c0696n);
            s.e(fVar, aVar);
            eVarN.l(eVarN.f13127t - 1);
            Object obj3 = this.f18677b;
            j.b(obj3);
            int i13 = this.f18679d;
            z zVar2 = this.f18678c;
            if (zVar2 != null) {
                long[] jArr = zVar2.f22784a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j = jArr[i14];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            z10 = z11;
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j & 255) < 128) {
                                    int i18 = (i14 << 3) + i17;
                                    i11 = i15;
                                    Object obj4 = zVar2.f22785b[i18];
                                    i10 = i17;
                                    boolean z12 = zVar2.f22786c[i18] != i13 ? z10 : false;
                                    if (z12) {
                                        d(obj3, obj4);
                                    }
                                    if (z12) {
                                        zVar2.f(i18);
                                    }
                                } else {
                                    i10 = i17;
                                    i11 = i15;
                                }
                                j >>= i11;
                                i17 = i10 + 1;
                                i15 = i11;
                            }
                            if (i16 != i15) {
                                break;
                            }
                        } else {
                            z10 = z11;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        z11 = z10;
                    }
                }
            }
            this.f18677b = obj2;
            this.f18678c = zVar;
            this.f18679d = i12;
        } catch (Throwable th) {
            eVarN.l(eVarN.f13127t - 1);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x027e A[DONT_INVERT, PHI: r13
      0x027e: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x0256, B:117:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0280 A[LOOP:6: B:108:0x024c->B:119:0x0280, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x04a7 A[DONT_INVERT, PHI: r13
      0x04a7: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x047f, B:218:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x04a9 A[LOOP:20: B:209:0x0475->B:220:0x04a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:241:0x0506 A[DONT_INVERT, PHI: r13
      0x0506: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04de, B:240:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x0508 A[LOOP:18: B:231:0x04d4->B:242:0x0508, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x015d A[EDGE_INSN: B:294:0x015d->B:62:0x015d BREAK  A[LOOP:4: B:46:0x00fc->B:58:0x0138], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0287 A[EDGE_INSN: B:299:0x0287->B:121:0x0287 BREAK  A[LOOP:6: B:108:0x024c->B:119:0x0280], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0227 A[EDGE_INSN: B:304:0x0227->B:99:0x0227 BREAK  A[LOOP:8: B:84:0x01dd->B:95:0x0211], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x050f A[EDGE_INSN: B:321:0x050f->B:244:0x050f BREAK  A[LOOP:18: B:231:0x04d4->B:242:0x0508], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x04bb A[EDGE_INSN: B:332:0x04bb->B:224:0x04bb BREAK  A[LOOP:20: B:209:0x0475->B:220:0x04a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[DONT_INVERT, PHI: r33
      0x0136: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x010a, B:56:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0138 A[LOOP:4: B:46:0x00fc->B:58:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:94:0x020f A[DONT_INVERT, PHI: r13
      0x020f: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e7, B:93:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0211 A[LOOP:8: B:84:0x01dd->B:95:0x0211, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    public final boolean b(Set set) {
        char c10;
        long j;
        boolean z10;
        Iterator it;
        String str;
        E e10;
        Object objG;
        Object[] objArr;
        Iterator it2;
        int i10;
        String str2;
        E e11;
        long j10;
        long[] jArr;
        int i11;
        Object[] objArr2;
        int i12;
        z zVar;
        long[] jArr2;
        S s10;
        Object[] objArr3;
        long[] jArr3;
        S s11;
        Object[] objArr4;
        int i13;
        int i14;
        int i15;
        long j11;
        Object obj;
        Object obj2;
        Object obj3;
        int i16;
        int i17;
        long j12;
        int i18;
        S s12 = S.f10643w;
        boolean z11 = set instanceof h;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        e eVar = this.f18682h;
        E e12 = this.f18684k;
        HashMap map = this.f18685l;
        E e13 = this.f18680e;
        F f3 = this.g;
        if (z11) {
            F f7 = ((h) set).f13139r;
            Object[] objArr5 = f7.f22676b;
            long[] jArr4 = f7.f22675a;
            c10 = 7;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i19 = 0;
                z10 = false;
                j = -9187201950435737472L;
                while (true) {
                    int i20 = 8;
                    long j13 = jArr4[i19];
                    int i21 = i19;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j13 & 255) < 128) {
                                jArr3 = jArr4;
                                Object obj4 = objArr5[(i21 << 3) + i23];
                                s11 = s12;
                                if (obj4 instanceof w) {
                                    objArr4 = objArr5;
                                    if (!((w) obj4).e(2)) {
                                    }
                                    i23 = i15 + 1;
                                    i20 = 8;
                                    s12 = s11;
                                    objArr5 = objArr4;
                                    length = i13;
                                    i22 = i14;
                                    j13 = j11 >> 8;
                                    jArr4 = jArr3;
                                } else {
                                    objArr4 = objArr5;
                                }
                                if (e12.c(obj4)) {
                                    Object objG2 = e12.g(obj4);
                                    if (objG2 == null) {
                                        obj2 = obj4;
                                        i13 = length;
                                        i14 = i22;
                                        i15 = i23;
                                        j11 = j13;
                                    } else if (objG2 instanceof F) {
                                        F f10 = (F) objG2;
                                        Object[] objArr6 = f10.f22676b;
                                        long[] jArr5 = f10.f22675a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            i15 = i23;
                                            boolean z12 = z10;
                                            int i24 = 0;
                                            while (true) {
                                                long j14 = jArr5[i24];
                                                j11 = j13;
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                                    int i26 = 0;
                                                    while (i26 < i25) {
                                                        if ((j14 & 255) < 128) {
                                                            j12 = j14;
                                                            C c11 = (C) objArr6[(i24 << 3) + i26];
                                                            j.c(c11, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                            Object obj5 = map.get(c11);
                                                            i18 = i26;
                                                            F0 f11 = c11.f10589t;
                                                            if (f11 == null) {
                                                                f11 = s11;
                                                            }
                                                            if (f11.a(c11.h().f10586f, obj5)) {
                                                                obj3 = obj4;
                                                                i16 = length;
                                                                i17 = i22;
                                                                eVar.b(c11);
                                                            } else {
                                                                Object objG3 = e13.g(c11);
                                                                if (objG3 == null) {
                                                                    obj3 = obj4;
                                                                    i16 = length;
                                                                    i17 = i22;
                                                                } else if (objG3 instanceof F) {
                                                                    F f12 = (F) objG3;
                                                                    Object[] objArr7 = f12.f22676b;
                                                                    long[] jArr6 = f12.f22675a;
                                                                    int length3 = jArr6.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i16 = length;
                                                                        i17 = i22;
                                                                        int i27 = 0;
                                                                        while (true) {
                                                                            long j15 = jArr6[i27];
                                                                            long[] jArr7 = jArr6;
                                                                            obj3 = obj4;
                                                                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i27 != length3) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                                obj4 = obj3;
                                                                                jArr6 = jArr7;
                                                                                i20 = 8;
                                                                            } else {
                                                                                int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                                                                for (int i29 = 0; i29 < i28; i29++) {
                                                                                    if ((j15 & 255) < 128) {
                                                                                        f3.a(objArr7[(i27 << 3) + i29]);
                                                                                        z12 = true;
                                                                                    }
                                                                                    j15 >>= i20;
                                                                                }
                                                                                if (i28 != i20) {
                                                                                    break;
                                                                                }
                                                                                if (i27 != length3) {
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                                obj4 = obj3;
                                                                                jArr6 = jArr7;
                                                                                i20 = 8;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj3 = obj4;
                                                                        i16 = length;
                                                                        i17 = i22;
                                                                    }
                                                                } else {
                                                                    obj3 = obj4;
                                                                    i16 = length;
                                                                    i17 = i22;
                                                                    f3.a(objG3);
                                                                    z12 = true;
                                                                }
                                                            }
                                                        } else {
                                                            obj3 = obj4;
                                                            i16 = length;
                                                            i17 = i22;
                                                            j12 = j14;
                                                            i18 = i26;
                                                        }
                                                        j14 = j12 >> 8;
                                                        i26 = i18 + 1;
                                                        i20 = 8;
                                                        length = i16;
                                                        i22 = i17;
                                                        obj4 = obj3;
                                                    }
                                                    obj2 = obj4;
                                                    i13 = length;
                                                    i14 = i22;
                                                    if (i25 != i20) {
                                                        break;
                                                    }
                                                } else {
                                                    obj2 = obj4;
                                                    i13 = length;
                                                    i14 = i22;
                                                }
                                                if (i24 == length2) {
                                                    break;
                                                }
                                                i24++;
                                                i20 = 8;
                                                j13 = j11;
                                                length = i13;
                                                i22 = i14;
                                                obj4 = obj2;
                                            }
                                            z10 = z12;
                                        } else {
                                            obj2 = obj4;
                                            i13 = length;
                                            i14 = i22;
                                            i15 = i23;
                                            j11 = j13;
                                        }
                                    } else {
                                        obj2 = obj4;
                                        i13 = length;
                                        i14 = i22;
                                        i15 = i23;
                                        j11 = j13;
                                        C c12 = (C) objG2;
                                        Object obj6 = map.get(c12);
                                        F0 f13 = c12.f10589t;
                                        if (f13 == null) {
                                            f13 = s11;
                                        }
                                        if (f13.a(c12.h().f10586f, obj6)) {
                                            eVar.b(c12);
                                        } else {
                                            Object objG4 = e13.g(c12);
                                            if (objG4 != null) {
                                                if (objG4 instanceof F) {
                                                    F f14 = (F) objG4;
                                                    Object[] objArr8 = f14.f22676b;
                                                    long[] jArr8 = f14.f22675a;
                                                    int length4 = jArr8.length - 2;
                                                    if (length4 >= 0) {
                                                        int i30 = 0;
                                                        while (true) {
                                                            long j16 = jArr8[i30];
                                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                if (i30 != length4) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i30++;
                                                            } else {
                                                                int i31 = 8 - ((~(i30 - length4)) >>> 31);
                                                                for (int i32 = 0; i32 < i31; i32++) {
                                                                    if ((j16 & 255) < 128) {
                                                                        f3.a(objArr8[(i30 << 3) + i32]);
                                                                        z10 = true;
                                                                    }
                                                                    j16 >>= 8;
                                                                }
                                                                if (i31 != 8) {
                                                                    break;
                                                                }
                                                                if (i30 != length4) {
                                                                    break;
                                                                }
                                                                i30++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    f3.a(objG4);
                                                    z10 = true;
                                                }
                                            }
                                        }
                                    }
                                    obj = obj2;
                                } else {
                                    i13 = length;
                                    i14 = i22;
                                    i15 = i23;
                                    j11 = j13;
                                    obj = obj4;
                                }
                                Object objG5 = e13.g(obj);
                                if (objG5 != null) {
                                    if (objG5 instanceof F) {
                                        F f15 = (F) objG5;
                                        Object[] objArr9 = f15.f22676b;
                                        long[] jArr9 = f15.f22675a;
                                        int length5 = jArr9.length - 2;
                                        if (length5 >= 0) {
                                            int i33 = 0;
                                            while (true) {
                                                long j17 = jArr9[i33];
                                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i33 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i33++;
                                                } else {
                                                    int i34 = 8 - ((~(i33 - length5)) >>> 31);
                                                    for (int i35 = 0; i35 < i34; i35++) {
                                                        if ((j17 & 255) < 128) {
                                                            f3.a(objArr9[(i33 << 3) + i35]);
                                                            z10 = true;
                                                        }
                                                        j17 >>= 8;
                                                    }
                                                    if (i34 != 8) {
                                                        break;
                                                    }
                                                    if (i33 != length5) {
                                                        break;
                                                    }
                                                    i33++;
                                                }
                                            }
                                        }
                                    } else {
                                        f3.a(objG5);
                                        z10 = true;
                                    }
                                }
                                i23 = i15 + 1;
                                i20 = 8;
                                s12 = s11;
                                objArr5 = objArr4;
                                length = i13;
                                i22 = i14;
                                j13 = j11 >> 8;
                                jArr4 = jArr3;
                            } else {
                                jArr3 = jArr4;
                                s11 = s12;
                                objArr4 = objArr5;
                            }
                            i13 = length;
                            i14 = i22;
                            i15 = i23;
                            j11 = j13;
                            i23 = i15 + 1;
                            i20 = 8;
                            s12 = s11;
                            objArr5 = objArr4;
                            length = i13;
                            i22 = i14;
                            j13 = j11 >> 8;
                            jArr4 = jArr3;
                        }
                        jArr2 = jArr4;
                        s10 = s12;
                        objArr3 = objArr5;
                        int i36 = length;
                        if (i22 != i20) {
                            break;
                        }
                        length = i36;
                    } else {
                        jArr2 = jArr4;
                        s10 = s12;
                        objArr3 = objArr5;
                    }
                    if (i21 == length) {
                        break;
                    }
                    i19 = i21 + 1;
                    s12 = s10;
                    jArr4 = jArr2;
                    objArr5 = objArr3;
                }
            } else {
                j = -9187201950435737472L;
                z10 = false;
            }
        } else {
            c10 = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z10 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof w) || ((w) next).e(2)) {
                    if (!e12.c(next) || (objG = e12.g(next)) == null) {
                        it = it3;
                        str = str3;
                        e10 = e12;
                    } else if (objG instanceof F) {
                        F f16 = (F) objG;
                        Object[] objArr10 = f16.f22676b;
                        long[] jArr10 = f16.f22675a;
                        int length6 = jArr10.length - 2;
                        if (length6 >= 0) {
                            int i37 = 0;
                            while (true) {
                                long j18 = jArr10[i37];
                                long[] jArr11 = jArr10;
                                Object[] objArr11 = objArr10;
                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i38 = 8 - ((~(i37 - length6)) >>> 31);
                                    int i39 = 0;
                                    while (i39 < i38) {
                                        if ((j18 & 255) < 128) {
                                            it2 = it3;
                                            C c13 = (C) objArr11[(i37 << 3) + i39];
                                            j.c(c13, str3);
                                            i10 = i39;
                                            Object obj7 = map.get(c13);
                                            str2 = str3;
                                            F0 f17 = c13.f10589t;
                                            if (f17 == null) {
                                                f17 = s12;
                                            }
                                            e11 = e12;
                                            if (f17.a(c13.h().f10586f, obj7)) {
                                                j10 = j18;
                                                eVar.b(c13);
                                            } else {
                                                Object objG6 = e13.g(c13);
                                                if (objG6 != null) {
                                                    if (objG6 instanceof F) {
                                                        F f18 = (F) objG6;
                                                        Object[] objArr12 = f18.f22676b;
                                                        long[] jArr12 = f18.f22675a;
                                                        int length7 = jArr12.length - 2;
                                                        if (length7 >= 0) {
                                                            boolean z13 = z10;
                                                            int i40 = 0;
                                                            while (true) {
                                                                long j19 = jArr12[i40];
                                                                j10 = j18;
                                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                                                    int i42 = 0;
                                                                    while (i42 < i41) {
                                                                        if ((j19 & 255) < 128) {
                                                                            f3.a(objArr12[(i40 << 3) + i42]);
                                                                            z13 = true;
                                                                        }
                                                                        j19 >>= 8;
                                                                        i42++;
                                                                        jArr12 = jArr12;
                                                                    }
                                                                    jArr = jArr12;
                                                                    if (i41 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr = jArr12;
                                                                }
                                                                if (i40 == length7) {
                                                                    break;
                                                                }
                                                                i40++;
                                                                j18 = j10;
                                                                jArr12 = jArr;
                                                            }
                                                            z10 = z13;
                                                        }
                                                    } else {
                                                        j10 = j18;
                                                        f3.a(objG6);
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                            j18 = j10 >> 8;
                                            str3 = str2;
                                            e12 = e11;
                                            objArr11 = objArr11;
                                            i39 = i10 + 1;
                                            it3 = it2;
                                        } else {
                                            it2 = it3;
                                            i10 = i39;
                                            str2 = str3;
                                            e11 = e12;
                                        }
                                        j10 = j18;
                                        j18 = j10 >> 8;
                                        str3 = str2;
                                        e12 = e11;
                                        objArr11 = objArr11;
                                        i39 = i10 + 1;
                                        it3 = it2;
                                    }
                                    it = it3;
                                    str = str3;
                                    e10 = e12;
                                    objArr = objArr11;
                                    if (i38 != 8) {
                                        break;
                                    }
                                } else {
                                    it = it3;
                                    str = str3;
                                    e10 = e12;
                                    objArr = objArr11;
                                }
                                if (i37 == length6) {
                                    break;
                                }
                                i37++;
                                it3 = it;
                                jArr10 = jArr11;
                                str3 = str;
                                e12 = e10;
                                objArr10 = objArr;
                            }
                        } else {
                            it = it3;
                            str = str3;
                            e10 = e12;
                        }
                    } else {
                        it = it3;
                        str = str3;
                        e10 = e12;
                        C c14 = (C) objG;
                        Object obj8 = map.get(c14);
                        F0 f19 = c14.f10589t;
                        if (f19 == null) {
                            f19 = s12;
                        }
                        if (f19.a(c14.h().f10586f, obj8)) {
                            eVar.b(c14);
                        } else {
                            Object objG7 = e13.g(c14);
                            if (objG7 != null) {
                                if (objG7 instanceof F) {
                                    F f20 = (F) objG7;
                                    Object[] objArr13 = f20.f22676b;
                                    long[] jArr13 = f20.f22675a;
                                    int length8 = jArr13.length - 2;
                                    if (length8 >= 0) {
                                        int i43 = 0;
                                        while (true) {
                                            long j20 = jArr13[i43];
                                            if ((((~j20) << 7) & j20 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i43 != length8) {
                                                    break;
                                                    break;
                                                }
                                                i43++;
                                            } else {
                                                int i44 = 8 - ((~(i43 - length8)) >>> 31);
                                                for (int i45 = 0; i45 < i44; i45++) {
                                                    if ((j20 & 255) < 128) {
                                                        f3.a(objArr13[(i43 << 3) + i45]);
                                                        z10 = true;
                                                    }
                                                    j20 >>= 8;
                                                }
                                                if (i44 != 8) {
                                                    break;
                                                }
                                                if (i43 != length8) {
                                                    break;
                                                }
                                                i43++;
                                            }
                                        }
                                    }
                                } else {
                                    f3.a(objG7);
                                    z10 = true;
                                }
                            }
                        }
                    }
                    Object objG8 = e13.g(next);
                    if (objG8 != null) {
                        if (objG8 instanceof F) {
                            F f21 = (F) objG8;
                            Object[] objArr14 = f21.f22676b;
                            long[] jArr14 = f21.f22675a;
                            int length9 = jArr14.length - 2;
                            if (length9 >= 0) {
                                int i46 = 0;
                                while (true) {
                                    long j21 = jArr14[i46];
                                    if ((((~j21) << 7) & j21 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i46 != length9) {
                                            break;
                                            break;
                                        }
                                        i46++;
                                    } else {
                                        int i47 = 8 - ((~(i46 - length9)) >>> 31);
                                        for (int i48 = 0; i48 < i47; i48++) {
                                            if ((j21 & 255) < 128) {
                                                f3.a(objArr14[(i46 << 3) + i48]);
                                                z10 = true;
                                            }
                                            j21 >>= 8;
                                        }
                                        if (i47 != 8) {
                                            break;
                                        }
                                        if (i46 != length9) {
                                            break;
                                        }
                                        i46++;
                                    }
                                }
                            }
                        } else {
                            f3.a(objG8);
                            z10 = true;
                        }
                    }
                } else {
                    it = it3;
                    str = str3;
                    e10 = e12;
                }
                it3 = it;
                str3 = str;
                e12 = e10;
            }
        }
        int i49 = eVar.f13127t;
        if (i49 == 0) {
            return z10;
        }
        Object[] objArr15 = eVar.f13125r;
        int i50 = 0;
        while (i50 < i49) {
            C c15 = (C) objArr15[i50];
            long jG = n.k().g();
            int i51 = (int) (jG ^ (jG >>> 32));
            Object objG9 = e13.g(c15);
            if (objG9 != null) {
                boolean z14 = objG9 instanceof F;
                E e14 = this.f18681f;
                if (z14) {
                    F f22 = (F) objG9;
                    Object[] objArr16 = f22.f22676b;
                    long[] jArr15 = f22.f22675a;
                    int length10 = jArr15.length - 2;
                    if (length10 >= 0) {
                        int i52 = 0;
                        while (true) {
                            long j22 = jArr15[i52];
                            i11 = i49;
                            objArr2 = objArr15;
                            if ((((~j22) << c10) & j22 & j) != j) {
                                int i53 = 8 - ((~(i52 - length10)) >>> 31);
                                int i54 = 0;
                                while (i54 < i53) {
                                    if ((j22 & 255) < 128) {
                                        Object obj9 = objArr16[(i52 << 3) + i54];
                                        z zVar2 = (z) e14.g(obj9);
                                        if (zVar2 == null) {
                                            zVar = new z();
                                            e14.l(obj9, zVar);
                                        } else {
                                            zVar = zVar2;
                                        }
                                        c(c15, i51, obj9, zVar);
                                    }
                                    j22 >>= 8;
                                    i54++;
                                    i50 = i50;
                                }
                                i12 = i50;
                                if (i53 != 8) {
                                    break;
                                }
                            } else {
                                i12 = i50;
                            }
                            if (i52 == length10) {
                                break;
                            }
                            i52++;
                            i49 = i11;
                            objArr15 = objArr2;
                            i50 = i12;
                        }
                    } else {
                        i11 = i49;
                        objArr2 = objArr15;
                        i12 = i50;
                    }
                } else {
                    i11 = i49;
                    objArr2 = objArr15;
                    i12 = i50;
                    z zVar3 = (z) e14.g(objG9);
                    if (zVar3 == null) {
                        zVar3 = new z();
                        e14.l(objG9, zVar3);
                    }
                    c(c15, i51, objG9, zVar3);
                }
            } else {
                i11 = i49;
                objArr2 = objArr15;
                i12 = i50;
            }
            i50 = i12 + 1;
            i49 = i11;
            objArr15 = objArr2;
        }
        eVar.g();
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void c(Object obj, int i10, Object obj2, z zVar) {
        int i11;
        if (this.j > 0) {
            return;
        }
        int iC = zVar.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i11 = -1;
        } else {
            i11 = zVar.f22786c[iC];
        }
        zVar.f22785b[iC] = obj;
        zVar.f22786c[iC] = i10;
        if ((obj instanceof C) && i11 != i10) {
            B bH = ((C) obj).h();
            this.f18685l.put(obj, bH.f10586f);
            z zVar2 = bH.f10585e;
            E e10 = this.f18684k;
            g.J(e10, obj);
            Object[] objArr = zVar2.f22785b;
            long[] jArr = zVar2.f22784a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j = jArr[i12];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j & 255) < 128) {
                                v vVar = (v) objArr[(i12 << 3) + i14];
                                if (vVar instanceof w) {
                                    ((w) vVar).f(2);
                                }
                                g.h(e10, vVar, obj);
                            }
                            j >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof w) {
                ((w) obj).f(2);
            }
            g.h(this.f18680e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        E e10 = this.f18680e;
        g.I(e10, obj2, obj);
        if (!(obj2 instanceof C) || e10.c(obj2)) {
            return;
        }
        g.J(this.f18684k, obj2);
        this.f18685l.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[EDGE_INSN: B:48:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c10;
        long j10;
        int i10;
        boolean z10;
        E e10 = this.f18681f;
        long[] jArr3 = e10.f22669a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr3[i11];
            char c11 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j11 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        c10 = c11;
                        Object obj = e10.f22670b[i15];
                        j10 = j12;
                        z zVar = (z) e10.f22671c[i15];
                        j.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zX = ((s0) obj).x();
                        if (zX) {
                            jArr2 = jArr3;
                            j = j11;
                            z10 = zX;
                        } else {
                            Object[] objArr = zVar.f22785b;
                            int[] iArr = zVar.f22786c;
                            long[] jArr4 = zVar.f22784a;
                            int i16 = i12;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j11;
                                int i17 = 0;
                                while (true) {
                                    long j13 = jArr4[i17];
                                    long[] jArr5 = jArr4;
                                    z10 = zX;
                                    if ((((~j13) << c10) & j13 & j10) == j10) {
                                        if (i17 != length2) {
                                            break;
                                            break;
                                        }
                                        i17++;
                                        zX = z10;
                                        jArr4 = jArr5;
                                        i16 = 8;
                                    } else {
                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((j13 & 255) < 128) {
                                                int i20 = (i17 << 3) + i19;
                                                Object obj2 = objArr[i20];
                                                int i21 = iArr[i20];
                                                d(obj, obj2);
                                            }
                                            j13 >>= i16;
                                        }
                                        if (i18 != i16) {
                                            break;
                                        }
                                        if (i17 != length2) {
                                            break;
                                        }
                                        i17++;
                                        zX = z10;
                                        jArr4 = jArr5;
                                        i16 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j11;
                                z10 = zX;
                            }
                        }
                        if (!z10) {
                            e10.k(i15);
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j11;
                        c10 = c11;
                        j10 = j12;
                        i10 = i12;
                    }
                    i14++;
                    i12 = i10;
                    j11 = j >> i10;
                    c11 = c10;
                    j12 = j10;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i13 != i12) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            jArr3 = jArr;
        }
    }
}
