package p207v2;

import A.C0029l;
import A.K;
import F2.t;
import F4.f;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import K9.c0;
import M9.e;
import N9.AbstractC0419l;
import N9.C0424q;
import N9.InterfaceC0415h;
import X.C0641m;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p017b7.d;
import p110k9.y;
import p120l9.m;
import p150o9.c;
import p151p.C1256n;
import p161p9.a;
import p185s8.u0;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f23134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f23135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0415h f23136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1256n f23137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f23138f;
    public final e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H f23139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f23140i;
    public final C0424q j;

    public G(Object obj, f fVar, d dVar, C4.e eVar, b0 b0Var, t tVar) {
        j.e(fVar, "pagingSource");
        j.e(eVar, "retryFlow");
        this.f23133a = obj;
        this.f23134b = fVar;
        this.f23135c = dVar;
        this.f23136d = eVar;
        this.f23137e = new C1256n(8);
        this.f23138f = new AtomicBoolean(false);
        c cVar = null;
        this.g = u0.a(-2, 6, null);
        this.f23139h = new H(dVar);
        c0 c0VarC = AbstractC0405x.c();
        this.f23140i = c0VarC;
        this.j = new C0424q(new C0029l(this, cVar, 13), AbstractC1367e.b(new C0641m(c0VarC, new C0029l(this, cVar, 12), (c) null)));
    }

    public static final Object a(G g, C0424q c0424q, EnumC1375m enumC1375m, i iVar) {
        g.getClass();
        c cVar = null;
        InterfaceC0415h interfaceC0415hB = AbstractC1367e.b(new C0641m(c0424q, new C1383v(null, g, enumC1375m), (c) null));
        L3.f fVar = new L3.f(enumC1375m, cVar, 1);
        j.e(interfaceC0415hB, "<this>");
        Object objD = AbstractC0419l.g(new C4.e(new C0641m(interfaceC0415hB, fVar, cVar, 10)), -1).d(new C1384w(0, g, enumC1375m), iVar);
        return objD == a.f21156r ? objD : y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0399  */
    /* JADX WARN: Code duplicated, block: B:106:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:164:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0511  */
    /* JADX WARN: Code duplicated, block: B:168:0x0514  */
    /* JADX WARN: Code duplicated, block: B:172:0x053f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0578 A[Catch: all -> 0x0582, TryCatch #2 {all -> 0x0582, blocks: (B:173:0x0545, B:174:0x055e, B:176:0x0578, B:178:0x057f, B:182:0x0588, B:181:0x0586, B:183:0x058b), top: B:208:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x057f A[Catch: all -> 0x0582, TryCatch #2 {all -> 0x0582, blocks: (B:173:0x0545, B:174:0x055e, B:176:0x0578, B:178:0x057f, B:182:0x0588, B:181:0x0586, B:183:0x058b), top: B:208:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0586 A[Catch: all -> 0x0582, TryCatch #2 {all -> 0x0582, blocks: (B:173:0x0545, B:174:0x055e, B:176:0x0578, B:178:0x057f, B:182:0x0588, B:181:0x0586, B:183:0x058b), top: B:208:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:189:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:192:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:193:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v70, types: [v2.G] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Enum, v2.m] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80, types: [v2.m] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Enum, v2.m] */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v23, types: [v2.m] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v44, types: [v2.G] */
    /* JADX WARN: Type inference failed for: r13v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v47, types: [v2.G] */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r14v12, types: [v2.G] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.Object, v2.m] */
    /* JADX WARN: Type inference failed for: r14v36, types: [v2.m] */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [S9.a, v2.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Enum, v2.m] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v36, types: [v2.m] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46, types: [v2.J] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42, types: [v2.J] */
    /* JADX WARN: Type inference failed for: r2v59, types: [v2.G] */
    /* JADX WARN: Type inference failed for: r2v61, types: [v2.G] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v1, types: [v2.n0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [v2.n0] */
    /* JADX WARN: Type inference failed for: r8v8, types: [h0.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p207v2.G r23, p207v2.EnumC1375m r24, p207v2.C1368f r25, p150o9.c r26) {
        /*
            Method dump skipped, instruction units count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p207v2.G.b(v2.G, v2.m, v2.f, o9.c):java.lang.Object");
    }

    public static final Object c(G g, EnumC1375m enumC1375m, n0 n0Var, D d5) throws Throwable {
        g.getClass();
        int i10 = AbstractC1382u.f23298a[enumC1375m.ordinal()];
        y yVar = y.f19095a;
        if (i10 == 1) {
            Object objF = g.f(d5);
            return objF == a.f21156r ? objF : yVar;
        }
        if (n0Var == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        C1256n c1256n = g.f23137e;
        c1256n.getClass();
        if (enumC1375m == EnumC1375m.f23269s || enumC1375m == EnumC1375m.f23270t) {
            ((Aa.a) c1256n.f20747s).C(null, new K(15, enumC1375m, n0Var));
            return yVar;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + enumC1375m).toString());
    }

    public static final void d(G g, InterfaceC0402u interfaceC0402u) {
        d dVar = g.f23135c;
        c cVar = null;
        AbstractC0405x.x(interfaceC0402u, null, new F(g, cVar, 0), 3);
        AbstractC0405x.x(interfaceC0402u, null, new F(g, cVar, 1), 3);
    }

    public static String h(EnumC1375m enumC1375m, Object obj, a0 a0Var) {
        if (a0Var == null) {
            return "End " + enumC1375m + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + enumC1375m + " with loadKey " + obj + ". Returned " + a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q9.c cVar) {
        C1386y c1386y;
        S9.c cVar2;
        G g;
        H h7;
        if (cVar instanceof C1386y) {
            c1386y = (C1386y) cVar;
            int i10 = c1386y.f23317w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1386y.f23317w = i10 - Integer.MIN_VALUE;
            } else {
                c1386y = new C1386y(this, cVar);
            }
        } else {
            c1386y = new C1386y(this, cVar);
        }
        Object obj = c1386y.f23315u;
        int i11 = c1386y.f23317w;
        if (i11 == 0) {
            p110k9.a.e(obj);
            H h10 = this.f23139h;
            cVar2 = h10.f23141a;
            c1386y.f23312r = this;
            c1386y.f23313s = h10;
            c1386y.f23314t = cVar2;
            c1386y.f23317w = 1;
            Object objE = cVar2.e(c1386y);
            a aVar = a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
            g = this;
            h7 = h10;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = c1386y.f23314t;
            h7 = c1386y.f23313s;
            g = c1386y.f23312r;
            p110k9.a.e(obj);
        }
        try {
            return h7.f23142b.a((l0) ((Aa.a) g.f23137e.f20747s).f556t);
        } finally {
            cVar2.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x0175 A[EXC_TOP_SPLITTER, PHI: r0 r3 r12 r14
      0x0175: PHI (r0v12 v2.a0) = (r0v11 v2.a0), (r0v19 v2.a0) binds: [B:69:0x0171, B:41:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r3v16 S9.c) = (r3v14 S9.c), (r3v22 S9.c) binds: [B:69:0x0171, B:41:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r12v8 v2.H) = (r12v7 v2.H), (r12v12 v2.H) binds: [B:69:0x0171, B:41:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r14v6 v2.G) = (r14v4 v2.G), (r14v7 v2.G) binds: [B:69:0x0171, B:41:0x00b4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x019a A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:71:0x0175, B:73:0x019a), top: B:107:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r3v10, types: [F4.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r3v25, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    public final Object f(q9.c cVar) throws Throwable {
        C1387z c1387z;
        H h7;
        S9.a aVar;
        G g;
        J j;
        G g10;
        G g11;
        a0 a0Var;
        H h10;
        S9.c cVar2;
        boolean zB;
        p074h0.i iVar;
        C1372j c1372j;
        H h11;
        S9.c cVar3;
        a0 a0Var2;
        S9.c cVar4;
        e eVar;
        C1377o c1377oC;
        G g12;
        S9.a aVar2;
        if (cVar instanceof C1387z) {
            c1387z = (C1387z) cVar;
            int i10 = c1387z.f23324x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1387z.f23324x = i10 - Integer.MIN_VALUE;
            } else {
                c1387z = new C1387z(this, cVar);
            }
        } else {
            c1387z = new C1387z(this, cVar);
        }
        Object objA = c1387z.f23322v;
        ?? r10 = c1387z.f23324x;
        y yVar = y.f19095a;
        EnumC1375m enumC1375m = EnumC1375m.f23268r;
        a aVar3 = a.f21156r;
        try {
            try {
                switch (r10) {
                    case 0:
                        p110k9.a.e(objA);
                        h7 = this.f23139h;
                        S9.c cVar5 = h7.f23141a;
                        c1387z.f23318r = this;
                        c1387z.f23319s = h7;
                        c1387z.f23320t = cVar5;
                        c1387z.f23324x = 1;
                        if (cVar5.e(c1387z) != aVar3) {
                            aVar = cVar5;
                            g = this;
                            j = h7.f23142b;
                            c1387z.f23318r = g;
                            c1387z.f23319s = aVar;
                            c1387z.f23320t = null;
                            c1387z.f23324x = 2;
                            if (g.j(j, enumC1375m, c1387z) != aVar3) {
                                g10 = g;
                                aVar.b(null);
                                Object obj = g10.f23133a;
                                r10 = g10.f23134b;
                                Y yG = g10.g(enumC1375m, obj);
                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                    String str = "Start REFRESH with loadKey " + g10.f23133a + " on " + r10;
                                    j.e(str, "message");
                                    Log.d("Paging", str, null);
                                }
                                c1387z.f23318r = g10;
                                c1387z.f23319s = null;
                                c1387z.f23324x = 3;
                                objA = r10.a(yG, c1387z);
                                if (objA != aVar3) {
                                    g11 = g10;
                                    a0Var = (a0) objA;
                                    if (a0Var instanceof Z) {
                                        return yVar;
                                    }
                                    h10 = g11.f23139h;
                                    cVar2 = h10.f23141a;
                                    c1387z.f23318r = g11;
                                    c1387z.f23319s = a0Var;
                                    c1387z.f23320t = h10;
                                    c1387z.f23321u = cVar2;
                                    c1387z.f23324x = 4;
                                    if (cVar2.e(c1387z) != aVar3) {
                                        try {
                                            J j10 = h10.f23142b;
                                            zB = j10.b(0, enumC1375m, (Z) a0Var);
                                            iVar = j10.j;
                                            iVar.F(enumC1375m, C1372j.f23256c);
                                            ((Z) a0Var).getClass();
                                            EnumC1375m enumC1375m2 = EnumC1375m.f23269s;
                                            c1372j = C1372j.f23255b;
                                            iVar.F(enumC1375m2, c1372j);
                                            if (((Z) a0Var).f23196s == null) {
                                                iVar.F(EnumC1375m.f23270t, c1372j);
                                                break;
                                            }
                                            cVar2.b(null);
                                            if (zB) {
                                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                    String strH = h(enumC1375m, g11.f23133a, a0Var);
                                                    j.e(strH, "message");
                                                    Log.d("Paging", strH, null);
                                                }
                                                h11 = g11.f23139h;
                                                cVar3 = h11.f23141a;
                                                c1387z.f23318r = g11;
                                                c1387z.f23319s = a0Var;
                                                c1387z.f23320t = h11;
                                                c1387z.f23321u = cVar3;
                                                c1387z.f23324x = 5;
                                                if (cVar3.e(c1387z) != aVar3) {
                                                    a0Var2 = a0Var;
                                                    cVar4 = cVar3;
                                                    J j11 = h11.f23142b;
                                                    eVar = g11.g;
                                                    c1377oC = j11.c((Z) a0Var2, enumC1375m);
                                                    c1387z.f23318r = g11;
                                                    c1387z.f23319s = a0Var2;
                                                    c1387z.f23320t = cVar4;
                                                    c1387z.f23321u = null;
                                                    c1387z.f23324x = 6;
                                                    if (eVar.d(c1377oC, c1387z) != aVar3) {
                                                        g12 = g11;
                                                        r10 = cVar4;
                                                        r10.b(null);
                                                        g11 = g12;
                                                    }
                                                }
                                                break;
                                            } else if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                String strH2 = h(enumC1375m, g11.f23133a, null);
                                                j.e(strH2, "message");
                                                Log.v("Paging", strH2, null);
                                            }
                                            g11.getClass();
                                            return yVar;
                                        } catch (Throwable th) {
                                            cVar2.b(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar3;
                    case 1:
                        aVar = (S9.a) c1387z.f23320t;
                        h7 = (H) c1387z.f23319s;
                        g = c1387z.f23318r;
                        p110k9.a.e(objA);
                        j = h7.f23142b;
                        c1387z.f23318r = g;
                        c1387z.f23319s = aVar;
                        c1387z.f23320t = null;
                        c1387z.f23324x = 2;
                        if (g.j(j, enumC1375m, c1387z) != aVar3) {
                            g10 = g;
                            aVar.b(null);
                            Object obj2 = g10.f23133a;
                            r10 = g10.f23134b;
                            Y yG2 = g10.g(enumC1375m, obj2);
                            if (Build.ID != null) {
                                String str2 = "Start REFRESH with loadKey " + g10.f23133a + " on " + r10;
                                j.e(str2, "message");
                                Log.d("Paging", str2, null);
                            }
                            c1387z.f23318r = g10;
                            c1387z.f23319s = null;
                            c1387z.f23324x = 3;
                            objA = r10.a(yG2, c1387z);
                            if (objA != aVar3) {
                                g11 = g10;
                                a0Var = (a0) objA;
                                if (a0Var instanceof Z) {
                                    return yVar;
                                }
                                h10 = g11.f23139h;
                                cVar2 = h10.f23141a;
                                c1387z.f23318r = g11;
                                c1387z.f23319s = a0Var;
                                c1387z.f23320t = h10;
                                c1387z.f23321u = cVar2;
                                c1387z.f23324x = 4;
                                if (cVar2.e(c1387z) != aVar3) {
                                    J j12 = h10.f23142b;
                                    zB = j12.b(0, enumC1375m, (Z) a0Var);
                                    iVar = j12.j;
                                    iVar.F(enumC1375m, C1372j.f23256c);
                                    ((Z) a0Var).getClass();
                                    EnumC1375m enumC1375m3 = EnumC1375m.f23269s;
                                    c1372j = C1372j.f23255b;
                                    iVar.F(enumC1375m3, c1372j);
                                    if (((Z) a0Var).f23196s == null) {
                                        iVar.F(EnumC1375m.f23270t, c1372j);
                                        break;
                                    }
                                    cVar2.b(null);
                                    if (zB) {
                                        if (Build.ID != null) {
                                            String strH3 = h(enumC1375m, g11.f23133a, a0Var);
                                            j.e(strH3, "message");
                                            Log.d("Paging", strH3, null);
                                        }
                                        h11 = g11.f23139h;
                                        cVar3 = h11.f23141a;
                                        c1387z.f23318r = g11;
                                        c1387z.f23319s = a0Var;
                                        c1387z.f23320t = h11;
                                        c1387z.f23321u = cVar3;
                                        c1387z.f23324x = 5;
                                        if (cVar3.e(c1387z) != aVar3) {
                                            a0Var2 = a0Var;
                                            cVar4 = cVar3;
                                            J j13 = h11.f23142b;
                                            eVar = g11.g;
                                            c1377oC = j13.c((Z) a0Var2, enumC1375m);
                                            c1387z.f23318r = g11;
                                            c1387z.f23319s = a0Var2;
                                            c1387z.f23320t = cVar4;
                                            c1387z.f23321u = null;
                                            c1387z.f23324x = 6;
                                            if (eVar.d(c1377oC, c1387z) != aVar3) {
                                                g12 = g11;
                                                r10 = cVar4;
                                                r10.b(null);
                                                g11 = g12;
                                            }
                                        }
                                        break;
                                    } else if (Build.ID != null) {
                                        String strH4 = h(enumC1375m, g11.f23133a, null);
                                        j.e(strH4, "message");
                                        Log.v("Paging", strH4, null);
                                    }
                                    g11.getClass();
                                    return yVar;
                                }
                            }
                        }
                        return aVar3;
                    case 2:
                        aVar = (S9.a) c1387z.f23319s;
                        g10 = c1387z.f23318r;
                        p110k9.a.e(objA);
                        aVar.b(null);
                        Object obj3 = g10.f23133a;
                        r10 = g10.f23134b;
                        Y yG3 = g10.g(enumC1375m, obj3);
                        if (Build.ID != null) {
                            String str3 = "Start REFRESH with loadKey " + g10.f23133a + " on " + r10;
                            j.e(str3, "message");
                            Log.d("Paging", str3, null);
                        }
                        c1387z.f23318r = g10;
                        c1387z.f23319s = null;
                        c1387z.f23324x = 3;
                        objA = r10.a(yG3, c1387z);
                        if (objA != aVar3) {
                            g11 = g10;
                            a0Var = (a0) objA;
                            if (a0Var instanceof Z) {
                                return yVar;
                            }
                            h10 = g11.f23139h;
                            cVar2 = h10.f23141a;
                            c1387z.f23318r = g11;
                            c1387z.f23319s = a0Var;
                            c1387z.f23320t = h10;
                            c1387z.f23321u = cVar2;
                            c1387z.f23324x = 4;
                            if (cVar2.e(c1387z) != aVar3) {
                                J j14 = h10.f23142b;
                                zB = j14.b(0, enumC1375m, (Z) a0Var);
                                iVar = j14.j;
                                iVar.F(enumC1375m, C1372j.f23256c);
                                ((Z) a0Var).getClass();
                                EnumC1375m enumC1375m4 = EnumC1375m.f23269s;
                                c1372j = C1372j.f23255b;
                                iVar.F(enumC1375m4, c1372j);
                                if (((Z) a0Var).f23196s == null) {
                                    iVar.F(EnumC1375m.f23270t, c1372j);
                                    break;
                                }
                                cVar2.b(null);
                                if (zB) {
                                    if (Build.ID != null) {
                                        String strH5 = h(enumC1375m, g11.f23133a, a0Var);
                                        j.e(strH5, "message");
                                        Log.d("Paging", strH5, null);
                                    }
                                    h11 = g11.f23139h;
                                    cVar3 = h11.f23141a;
                                    c1387z.f23318r = g11;
                                    c1387z.f23319s = a0Var;
                                    c1387z.f23320t = h11;
                                    c1387z.f23321u = cVar3;
                                    c1387z.f23324x = 5;
                                    if (cVar3.e(c1387z) != aVar3) {
                                        a0Var2 = a0Var;
                                        cVar4 = cVar3;
                                        J j15 = h11.f23142b;
                                        eVar = g11.g;
                                        c1377oC = j15.c((Z) a0Var2, enumC1375m);
                                        c1387z.f23318r = g11;
                                        c1387z.f23319s = a0Var2;
                                        c1387z.f23320t = cVar4;
                                        c1387z.f23321u = null;
                                        c1387z.f23324x = 6;
                                        if (eVar.d(c1377oC, c1387z) != aVar3) {
                                            g12 = g11;
                                            r10 = cVar4;
                                            r10.b(null);
                                            g11 = g12;
                                        }
                                    }
                                    break;
                                } else if (Build.ID != null) {
                                    String strH6 = h(enumC1375m, g11.f23133a, null);
                                    j.e(strH6, "message");
                                    Log.v("Paging", strH6, null);
                                }
                                g11.getClass();
                                return yVar;
                            }
                        }
                        return aVar3;
                    case 3:
                        G g13 = c1387z.f23318r;
                        p110k9.a.e(objA);
                        g11 = g13;
                        a0Var = (a0) objA;
                        if (a0Var instanceof Z) {
                            return yVar;
                        }
                        h10 = g11.f23139h;
                        cVar2 = h10.f23141a;
                        c1387z.f23318r = g11;
                        c1387z.f23319s = a0Var;
                        c1387z.f23320t = h10;
                        c1387z.f23321u = cVar2;
                        c1387z.f23324x = 4;
                        if (cVar2.e(c1387z) != aVar3) {
                            J j16 = h10.f23142b;
                            zB = j16.b(0, enumC1375m, (Z) a0Var);
                            iVar = j16.j;
                            iVar.F(enumC1375m, C1372j.f23256c);
                            ((Z) a0Var).getClass();
                            EnumC1375m enumC1375m5 = EnumC1375m.f23269s;
                            c1372j = C1372j.f23255b;
                            iVar.F(enumC1375m5, c1372j);
                            if (((Z) a0Var).f23196s == null) {
                                iVar.F(EnumC1375m.f23270t, c1372j);
                                break;
                            }
                            cVar2.b(null);
                            if (zB) {
                                if (Build.ID != null) {
                                    String strH7 = h(enumC1375m, g11.f23133a, a0Var);
                                    j.e(strH7, "message");
                                    Log.d("Paging", strH7, null);
                                }
                                h11 = g11.f23139h;
                                cVar3 = h11.f23141a;
                                c1387z.f23318r = g11;
                                c1387z.f23319s = a0Var;
                                c1387z.f23320t = h11;
                                c1387z.f23321u = cVar3;
                                c1387z.f23324x = 5;
                                if (cVar3.e(c1387z) != aVar3) {
                                    a0Var2 = a0Var;
                                    cVar4 = cVar3;
                                    J j17 = h11.f23142b;
                                    eVar = g11.g;
                                    c1377oC = j17.c((Z) a0Var2, enumC1375m);
                                    c1387z.f23318r = g11;
                                    c1387z.f23319s = a0Var2;
                                    c1387z.f23320t = cVar4;
                                    c1387z.f23321u = null;
                                    c1387z.f23324x = 6;
                                    if (eVar.d(c1377oC, c1387z) != aVar3) {
                                        g12 = g11;
                                        r10 = cVar4;
                                        r10.b(null);
                                        g11 = g12;
                                    }
                                }
                                break;
                            } else if (Build.ID != null) {
                                String strH8 = h(enumC1375m, g11.f23133a, null);
                                j.e(strH8, "message");
                                Log.v("Paging", strH8, null);
                            }
                            g11.getClass();
                            return yVar;
                        }
                        return aVar3;
                    case 4:
                        cVar2 = c1387z.f23321u;
                        h10 = (H) c1387z.f23320t;
                        a0 a0Var3 = (a0) c1387z.f23319s;
                        g11 = c1387z.f23318r;
                        p110k9.a.e(objA);
                        a0Var = a0Var3;
                        J j18 = h10.f23142b;
                        zB = j18.b(0, enumC1375m, (Z) a0Var);
                        iVar = j18.j;
                        iVar.F(enumC1375m, C1372j.f23256c);
                        ((Z) a0Var).getClass();
                        EnumC1375m enumC1375m6 = EnumC1375m.f23269s;
                        c1372j = C1372j.f23255b;
                        iVar.F(enumC1375m6, c1372j);
                        if (((Z) a0Var).f23196s == null) {
                            iVar.F(EnumC1375m.f23270t, c1372j);
                            break;
                        }
                        cVar2.b(null);
                        if (zB) {
                            if (Build.ID != null) {
                                String strH9 = h(enumC1375m, g11.f23133a, a0Var);
                                j.e(strH9, "message");
                                Log.d("Paging", strH9, null);
                            }
                            h11 = g11.f23139h;
                            cVar3 = h11.f23141a;
                            c1387z.f23318r = g11;
                            c1387z.f23319s = a0Var;
                            c1387z.f23320t = h11;
                            c1387z.f23321u = cVar3;
                            c1387z.f23324x = 5;
                            if (cVar3.e(c1387z) != aVar3) {
                                a0Var2 = a0Var;
                                cVar4 = cVar3;
                                J j19 = h11.f23142b;
                                eVar = g11.g;
                                c1377oC = j19.c((Z) a0Var2, enumC1375m);
                                c1387z.f23318r = g11;
                                c1387z.f23319s = a0Var2;
                                c1387z.f23320t = cVar4;
                                c1387z.f23321u = null;
                                c1387z.f23324x = 6;
                                if (eVar.d(c1377oC, c1387z) != aVar3) {
                                    g12 = g11;
                                    r10 = cVar4;
                                    r10.b(null);
                                    g11 = g12;
                                }
                                break;
                            }
                            return aVar3;
                        }
                        if (Build.ID != null) {
                            String strH10 = h(enumC1375m, g11.f23133a, null);
                            j.e(strH10, "message");
                            Log.v("Paging", strH10, null);
                        }
                        g11.getClass();
                        return yVar;
                    case 5:
                        S9.c cVar6 = c1387z.f23321u;
                        h11 = (H) c1387z.f23320t;
                        a0Var2 = (a0) c1387z.f23319s;
                        G g14 = c1387z.f23318r;
                        p110k9.a.e(objA);
                        g11 = g14;
                        cVar4 = cVar6;
                        J j110 = h11.f23142b;
                        eVar = g11.g;
                        c1377oC = j110.c((Z) a0Var2, enumC1375m);
                        c1387z.f23318r = g11;
                        c1387z.f23319s = a0Var2;
                        c1387z.f23320t = cVar4;
                        c1387z.f23321u = null;
                        c1387z.f23324x = 6;
                        if (eVar.d(c1377oC, c1387z) != aVar3) {
                            g12 = g11;
                            r10 = cVar4;
                            r10.b(null);
                            g11 = g12;
                            g11.getClass();
                            return yVar;
                        }
                        return aVar3;
                    case 6:
                        S9.a aVar4 = (S9.a) c1387z.f23320t;
                        g12 = c1387z.f23318r;
                        p110k9.a.e(objA);
                        r10 = aVar4;
                        r10.b(null);
                        g11 = g12;
                        g11.getClass();
                        return yVar;
                    case 7:
                        S9.c cVar7 = c1387z.f23321u;
                        H h12 = (H) c1387z.f23320t;
                        a0 a0Var4 = (a0) c1387z.f23319s;
                        G g15 = c1387z.f23318r;
                        p110k9.a.e(objA);
                        try {
                            h12.f23142b.a((l0) ((Aa.a) g15.f23137e.f20747s).f556t);
                            cVar7.b(null);
                            ((Z) a0Var4).getClass();
                            throw null;
                        } catch (Throwable th2) {
                            cVar7.b(null);
                            throw th2;
                        }
                    case 8:
                        S9.c cVar8 = c1387z.f23321u;
                        H h13 = (H) c1387z.f23320t;
                        a0 a0Var5 = (a0) c1387z.f23319s;
                        p110k9.a.e(objA);
                        try {
                            J j20 = h13.f23142b;
                            if (a0Var5 == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = cVar8;
                            aVar2.b(null);
                            throw th;
                        }
                    case 9:
                        aVar2 = (S9.a) c1387z.f23318r;
                        try {
                            p110k9.a.e(objA);
                            aVar2.b(null);
                            return yVar;
                        } catch (Throwable th4) {
                            th = th4;
                            aVar2.b(null);
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th5) {
                r10.b(null);
                throw th5;
            }
        } catch (Throwable th6) {
            r10.b(null);
            throw th6;
        }
    }

    public final Y g(EnumC1375m enumC1375m, Object obj) {
        EnumC1375m enumC1375m2 = EnumC1375m.f23268r;
        d dVar = this.f23135c;
        int i10 = enumC1375m == enumC1375m2 ? dVar.f13310c : dVar.f13308a;
        j.e(enumC1375m, "loadType");
        int iOrdinal = enumC1375m.ordinal();
        if (iOrdinal == 0) {
            return new X(i10, obj);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new W(i10, obj);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new A6.a();
        }
        if (obj != null) {
            return new V(i10, obj);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    public final Object i(J j, EnumC1375m enumC1375m, int i10, int i11) {
        j.getClass();
        ArrayList arrayList = j.f23147c;
        int iOrdinal = enumC1375m.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new A6.a();
        }
        if (i10 == 0) {
            j.j.o(enumC1375m);
            if (i11 < this.f23135c.f13309b) {
                if (enumC1375m != EnumC1375m.f23269s) {
                    return ((Z) m.m0(arrayList)).f23196s;
                }
                ((Z) m.f0(arrayList)).getClass();
                return null;
            }
        }
        return null;
    }

    public final Object j(J j, EnumC1375m enumC1375m, q9.c cVar) {
        p074h0.i iVar = j.j;
        AbstractC1373k abstractC1373kO = iVar.o(enumC1375m);
        C1371i c1371i = C1371i.f23250b;
        if (!j.a(abstractC1373kO, c1371i)) {
            iVar.F(enumC1375m, c1371i);
            Object objD = this.g.d(new C1378p(iVar.K(), null), cVar);
            if (objD == a.f21156r) {
                return objD;
            }
        }
        return y.f19095a;
    }
}
