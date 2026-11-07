package Ga;

import D0.C0086d;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.A f2997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0402u f2998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0086d f2999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K9.A f3000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M9.e f3001e = u0.a(-1, 6, null);

    public J(F.A a9, InterfaceC0402u interfaceC0402u, C0086d c0086d) {
        this.f2997a = a9;
        this.f2998b = interfaceC0402u;
        this.f2999c = c0086d;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [q9.i, y9.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [y9.a] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(Ga.J r18, q9.c r19) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ga.J.a(Ga.J, q9.c):java.lang.Object");
    }

    public final boolean b(C c10, float f3, p241y9.a aVar, p241y9.c cVar) {
        boolean zB;
        int iOrdinal = c10.ordinal();
        F.A a9 = this.f2997a;
        if (iOrdinal == 0) {
            zB = a9.b();
        } else {
            if (iOrdinal != 1) {
                throw new A6.a();
            }
            zB = a9.d();
        }
        if (!zB) {
            return false;
        }
        if (this.f3000d == null) {
            this.f3000d = AbstractC0405x.x(this.f2998b, null, new H(this, null, 0), 3);
        }
        this.f3001e.k(new F(c10, f3, aVar, cVar));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(q9.c cVar) {
        I i10;
        J j;
        J j10;
        if (cVar instanceof I) {
            i10 = (I) cVar;
            int i11 = i10.f2996u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i10.f2996u = i11 - Integer.MIN_VALUE;
            } else {
                i10 = new I(this, cVar);
            }
        } else {
            i10 = new I(this, cVar);
        }
        Object obj = i10.f2994s;
        int i12 = i10.f2996u;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i12 == 0) {
            p110k9.a.e(obj);
            F f3 = F.f2977e;
            i10.f2993r = this;
            i10.f2996u = 1;
            if (this.f3001e.d(f3, i10) != aVar) {
                j = this;
            }
            return aVar;
        }
        if (i12 == 1) {
            j = i10.f2993r;
            p110k9.a.e(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = i10.f2993r;
            p110k9.a.e(obj);
        }
        j = j10;
        j.f3000d = null;
        return p110k9.y.f19095a;
        K9.A a9 = j.f3000d;
        if (a9 != null) {
            i10.f2993r = j;
            i10.f2996u = 2;
            if (AbstractC0405x.i(a9, i10) != aVar) {
                j10 = j;
                j = j10;
            }
            return aVar;
        }
        j.f3000d = null;
        return p110k9.y.f19095a;
    }
}
