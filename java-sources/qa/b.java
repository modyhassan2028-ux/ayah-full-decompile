package qa;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ka.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f21356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f21358x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, n nVar) {
        super(eVar, nVar);
        j.e(nVar, "url");
        this.f21358x = eVar;
        this.f21356v = -1L;
        this.f21357w = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zE;
        if (this.f21354t) {
            return;
        }
        if (this.f21357w) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = la.e.f19451a;
            j.e(timeUnit, "timeUnit");
            try {
                zE = la.e.e(this, 100);
            } catch (IOException unused) {
                zE = false;
            }
            if (!zE) {
                this.f21358x.f21363b.h();
                b(e.g);
            }
        }
        this.f21354t = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r9.f21357w == false) goto L28;
     */
    @Override // qa.a, Da.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(long r10, Da.h r12) throws java.io.IOException {
        /*
            r9 = this;
            qa.e r10 = r9.f21358x
            Da.j r11 = r10.f21364c
            java.lang.String r0 = "sink"
            p251z9.j.e(r12, r0)
            boolean r0 = r9.f21354t
            if (r0 != 0) goto Lb7
            boolean r0 = r9.f21357w
            r1 = -1
            if (r0 != 0) goto L14
            goto L68
        L14:
            long r3 = r9.f21356v
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L20
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L69
        L20:
            java.lang.String r0 = "expected chunk size and optional extensions but was \""
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L29
            r11.u()
        L29:
            long r3 = r11.Y()     // Catch: java.lang.NumberFormatException -> L51
            r9.f21356v = r3     // Catch: java.lang.NumberFormatException -> L51
            java.lang.String r11 = r11.u()     // Catch: java.lang.NumberFormatException -> L51
            java.lang.CharSequence r11 = H9.o.t1(r11)     // Catch: java.lang.NumberFormatException -> L51
            java.lang.String r11 = r11.toString()     // Catch: java.lang.NumberFormatException -> L51
            long r3 = r9.f21356v     // Catch: java.lang.NumberFormatException -> L51
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L91
            int r3 = r11.length()     // Catch: java.lang.NumberFormatException -> L51
            r4 = 0
            if (r3 <= 0) goto L53
            java.lang.String r3 = ";"
            boolean r3 = H9.v.R0(r11, r3, r4)     // Catch: java.lang.NumberFormatException -> L51
            if (r3 == 0) goto L91
            goto L53
        L51:
            r10 = move-exception
            goto Lad
        L53:
            long r7 = r9.f21356v
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L64
            r9.f21357w = r4
            A.o1 r11 = r10.f21367f
            ka.l r11 = r11.i()
            r9.b(r11)
        L64:
            boolean r11 = r9.f21357w
            if (r11 != 0) goto L69
        L68:
            return r1
        L69:
            long r3 = r9.f21356v
            r5 = 8192(0x2000, double:4.0474E-320)
            long r3 = java.lang.Math.min(r5, r3)
            long r11 = super.o(r3, r12)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L7f
            long r0 = r9.f21356v
            long r0 = r0 - r11
            r9.f21356v = r0
            return r11
        L7f:
            pa.c r10 = r10.f21363b
            r10.h()
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "unexpected end of stream"
            r10.<init>(r11)
            ka.l r11 = qa.e.g
            r9.b(r11)
            throw r10
        L91:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L51
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L51
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> L51
            long r0 = r9.f21356v     // Catch: java.lang.NumberFormatException -> L51
            r12.append(r0)     // Catch: java.lang.NumberFormatException -> L51
            r12.append(r11)     // Catch: java.lang.NumberFormatException -> L51
            r11 = 34
            r12.append(r11)     // Catch: java.lang.NumberFormatException -> L51
            java.lang.String r11 = r12.toString()     // Catch: java.lang.NumberFormatException -> L51
            r10.<init>(r11)     // Catch: java.lang.NumberFormatException -> L51
            throw r10     // Catch: java.lang.NumberFormatException -> L51
        Lad:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r10)
            throw r11
        Lb7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.b.o(long, Da.h):long");
    }
}
