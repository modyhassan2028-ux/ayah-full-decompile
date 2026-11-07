package Z;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ T f10774A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ s0 f10775B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f10776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f10777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f10778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public u.F f10779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u.F f10780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u.F f10781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f10782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u.F f10783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10784z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, p150o9.c cVar) {
        super(3, cVar);
        this.f10775B = s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    public static final void m(s0 s0Var, List list, List list2, List list3, u.F f3, u.F f7, u.F f10, u.F f11) {
        char c10;
        long j;
        long j10;
        synchronized (s0Var.f10789b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0704u c0704u = (C0704u) list3.get(i10);
                    c0704u.a();
                    s0Var.H(c0704u);
                }
                list3.clear();
                Object[] objArr = f3.f22676b;
                long[] jArr = f3.f22675a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    j = 255;
                    while (true) {
                        long j11 = jArr[i11];
                        c10 = 7;
                        j10 = -9187201950435737472L;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j11 & 255) < 128) {
                                    C0704u c0704u2 = (C0704u) objArr[(i11 << 3) + i13];
                                    c0704u2.a();
                                    s0Var.H(c0704u2);
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                } else {
                    c10 = 7;
                    j = 255;
                    j10 = -9187201950435737472L;
                }
                f3.b();
                Object[] objArr2 = f7.f22676b;
                long[] jArr2 = f7.f22675a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr2[i14];
                        if ((((~j12) << c10) & j12 & j10) == j10) {
                            if (i14 != length2) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & j) < 128) {
                                    ((C0704u) objArr2[(i14 << 3) + i16]).g();
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            } else if (i14 != length2) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                f7.b();
                f10.b();
                Object[] objArr3 = f11.f22676b;
                long[] jArr3 = f11.f22675a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j13 = jArr3[i17];
                        if ((((~j13) << c10) & j13 & j10) == j10) {
                            if (i17 != length3) {
                                break;
                                break;
                            }
                            i17++;
                        } else {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j13 & j) < 128) {
                                    C0704u c0704u3 = (C0704u) objArr3[(i17 << 3) + i19];
                                    c0704u3.a();
                                    s0Var.H(c0704u3);
                                }
                                j13 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            } else if (i17 != length3) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                f11.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void n(List list, s0 s0Var) {
        list.clear();
        synchronized (s0Var.f10789b) {
            try {
                ArrayList arrayList = s0Var.j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((W) arrayList.get(i10));
                }
                s0Var.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        r0 r0Var = new r0(this.f10775B, (p150o9.c) obj3);
        r0Var.f10774A = (T) obj2;
        r0Var.invokeSuspend(p110k9.y.f19095a);
        return p161p9.a.f21156r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0091 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e5 -> B:25:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f3 -> B:12:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
