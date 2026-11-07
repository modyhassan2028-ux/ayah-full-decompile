package ra;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Logger f21733u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Da.j f21734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f21735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f21736t;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        p251z9.j.d(logger, "getLogger(...)");
        f21733u = logger;
    }

    public t(Da.j jVar) {
        p251z9.j.e(jVar, "source");
        this.f21734r = jVar;
        s sVar = new s(jVar);
        this.f21735s = sVar;
        this.f21736t = new e(sVar);
    }

    public final void A(o oVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i11 & 8) != 0) {
            byte b5 = this.f21734r.readByte();
            byte[] bArr = la.c.f19448a;
            i13 = b5 & 255;
        } else {
            i13 = 0;
        }
        int i14 = this.f21734r.readInt() & Integer.MAX_VALUE;
        List listN = n(r.a(i10 - 4, i11, i13), i13, i11, i12);
        p pVar = oVar.f21694s;
        synchronized (pVar) {
            if (pVar.f21710P.contains(Integer.valueOf(i14))) {
                pVar.E(i14, EnumC1290b.PROTOCOL_ERROR);
                return;
            }
            pVar.f21710P.add(Integer.valueOf(i14));
            na.c.c(pVar.f21719z, pVar.f21713t + '[' + i14 + "] onRequest", new k(pVar, i14, listN));
        }
    }

    public final boolean b(boolean z10, o oVar) throws Exception {
        EnumC1290b enumC1290b;
        int i10 = 0;
        try {
            this.f21734r.S(9L);
            int iK = la.c.k(this.f21734r);
            if (iK > 16384) {
                throw new IOException(p123m2.c.r(iK, "FRAME_SIZE_ERROR: "));
            }
            int i11 = this.f21734r.readByte() & 255;
            byte b5 = this.f21734r.readByte();
            int i12 = b5 & 255;
            int i13 = this.f21734r.readInt();
            int i14 = Integer.MAX_VALUE & i13;
            if (i11 != 8) {
                Logger logger = f21733u;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(true, i14, iK, i11, i12));
                }
            }
            if (z10 && i11 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(i11));
            }
            switch (i11) {
                case 0:
                    e(oVar, iK, i12, i14);
                    return true;
                case 1:
                    s(oVar, iK, i12, i14);
                    return true;
                case 2:
                    if (iK != 5) {
                        throw new IOException(p245z2.a.B(iK, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    Da.j jVar = this.f21734r;
                    jVar.readInt();
                    jVar.readByte();
                    return true;
                case 3:
                    if (iK != 4) {
                        throw new IOException(p245z2.a.B(iK, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i15 = this.f21734r.readInt();
                    EnumC1290b.f21641s.getClass();
                    EnumC1290b[] enumC1290bArrValues = EnumC1290b.values();
                    int length = enumC1290bArrValues.length;
                    while (true) {
                        if (i10 < length) {
                            enumC1290b = enumC1290bArrValues[i10];
                            if (enumC1290b.f21649r != i15) {
                                i10++;
                            }
                        } else {
                            enumC1290b = null;
                        }
                    }
                    if (enumC1290b == null) {
                        throw new IOException(p123m2.c.r(i15, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    p pVar = oVar.f21694s;
                    if (i14 == 0 || (i13 & 1) != 0) {
                        x xVarN = pVar.n(i14);
                        if (xVarN != null) {
                            xVarN.j(enumC1290b);
                        }
                        return true;
                    }
                    na.c.c(pVar.f21719z, pVar.f21713t + '[' + i14 + "] onReset", new G4.g(pVar, i14, enumC1290b));
                    return true;
                case 4:
                    Da.j jVar2 = this.f21734r;
                    if (i14 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b5 & 1) != 0) {
                        if (iK != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iK % 6 != 0) {
                        throw new IOException(p123m2.c.r(iK, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    B b10 = new B();
                    E9.b bVarG0 = B0.c.g0(B0.c.i0(0, iK), 6);
                    int i16 = bVarG0.f1995r;
                    int i17 = bVarG0.f1996s;
                    int i18 = bVarG0.f1997t;
                    if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                        while (true) {
                            short s10 = jVar2.readShort();
                            byte[] bArr = la.c.f19448a;
                            int i19 = s10 & 65535;
                            int i20 = jVar2.readInt();
                            if (i19 != 2) {
                                if (i19 != 4) {
                                    if (i19 == 5 && (i20 < 16384 || i20 > 16777215)) {
                                        throw new IOException(p123m2.c.r(i20, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    }
                                } else if (i20 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (i20 != 0 && i20 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            b10.c(i19, i20);
                            if (i16 != i17) {
                                i16 += i18;
                            }
                        }
                    }
                    p pVar2 = oVar.f21694s;
                    na.c.c(pVar2.f21718y, android.support.v4.media.session.p.B(new StringBuilder(), pVar2.f21713t, " applyAndAckSettings"), new G4.f(25, oVar, b10));
                    return true;
                case 5:
                    A(oVar, iK, i12, i14);
                    return true;
                case 6:
                    w(oVar, iK, i12, i14);
                    return true;
                case 7:
                    i(oVar, iK, i14);
                    return true;
                case 8:
                    try {
                        if (iK != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iK);
                        }
                        long j = 2147483647L & ((long) this.f21734r.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f21733u;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(true, i14, iK, j));
                        }
                        if (i14 == 0) {
                            p pVar3 = oVar.f21694s;
                            synchronized (pVar3) {
                                pVar3.f21706L += j;
                                pVar3.notifyAll();
                            }
                            return true;
                        }
                        x xVarE = oVar.f21694s.e(i14);
                        if (xVarE != null) {
                            synchronized (xVarE) {
                                xVarE.f21752e += j;
                                if (j > 0) {
                                    xVarE.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e10) {
                        f21733u.fine(h.b(true, i14, iK, 8, i12));
                        throw e10;
                    }
                default:
                    this.f21734r.skip(iK);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21734r.close();
    }

    public final void e(o oVar, int i10, int i11, final int i12) throws IOException {
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z13 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i11 & 8) != 0) {
            byte b5 = this.f21734r.readByte();
            byte[] bArr = la.c.f19448a;
            i13 = b5 & 255;
        } else {
            i13 = 0;
        }
        final int iA = r.a(i10, i11, i13);
        Da.j jVar = this.f21734r;
        p251z9.j.e(jVar, "source");
        final p pVar = oVar.f21694s;
        if (i12 == 0 || (i12 & 1) != 0) {
            x xVarE = pVar.e(i12);
            if (xVarE == null) {
                oVar.f21694s.E(i12, EnumC1290b.PROTOCOL_ERROR);
                long j = iA;
                oVar.f21694s.w(j);
                jVar.skip(j);
            } else {
                TimeZone timeZone = la.e.f19451a;
                v vVar = xVarE.f21754h;
                long j10 = iA;
                vVar.getClass();
                long j11 = j10;
                while (true) {
                    if (j11 <= 0) {
                        z10 = z13;
                        x xVar = vVar.f21746w;
                        TimeZone timeZone2 = la.e.f19451a;
                        xVar.f21749b.w(j10);
                        vVar.f21746w.f21749b.f21701G.getClass();
                        break;
                    }
                    synchronized (vVar.f21746w) {
                        z11 = vVar.f21742s;
                        z10 = z13;
                        z12 = vVar.f21744u.f1362s + j11 > vVar.f21741r;
                    }
                    if (z12) {
                        jVar.skip(j11);
                        vVar.f21746w.e(EnumC1290b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z11) {
                        jVar.skip(j11);
                        break;
                    }
                    long jO = jVar.o(j11, vVar.f21743t);
                    if (jO == -1) {
                        throw new EOFException();
                    }
                    j11 -= jO;
                    x xVar2 = vVar.f21746w;
                    synchronized (xVar2) {
                        try {
                            if (vVar.f21745v) {
                                Da.h hVar = vVar.f21743t;
                                hVar.skip(hVar.f1362s);
                            } else {
                                Da.h hVar2 = vVar.f21744u;
                                boolean z14 = hVar2.f1362s == 0;
                                hVar2.W(vVar.f21743t);
                                if (z14) {
                                    xVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z13 = z10;
                }
                if (z10) {
                    xVarE.i(ka.l.f19177s, true);
                }
            }
        } else {
            final Da.h hVar3 = new Da.h();
            long j12 = iA;
            jVar.S(j12);
            jVar.o(j12, hVar3);
            na.c.c(pVar.f21719z, pVar.f21713t + '[' + i12 + "] onData", new p241y9.a(i12, hVar3, iA, z13) { // from class: ra.j

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ int f21682s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Da.h f21683t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f21684u;

                @Override // p241y9.a
                public final Object invoke() {
                    p pVar2 = this.f21681r;
                    int i14 = this.f21682s;
                    Da.h hVar4 = this.f21683t;
                    int i15 = this.f21684u;
                    try {
                        pVar2.f21696B.getClass();
                        hVar4.skip(i15);
                        pVar2.f21708N.A(i14, EnumC1290b.CANCEL);
                        synchronized (pVar2) {
                            pVar2.f21710P.remove(Integer.valueOf(i14));
                        }
                    } catch (IOException unused) {
                    }
                    return p110k9.y.f19095a;
                }
            });
        }
        this.f21734r.skip(i13);
    }

    public final void i(o oVar, int i10, int i11) throws IOException {
        EnumC1290b enumC1290b;
        Object[] array;
        if (i10 < 8) {
            throw new IOException(p123m2.c.r(i10, "TYPE_GOAWAY length < 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i12 = this.f21734r.readInt();
        int i13 = this.f21734r.readInt();
        int i14 = i10 - 8;
        EnumC1290b.f21641s.getClass();
        EnumC1290b[] enumC1290bArrValues = EnumC1290b.values();
        int length = enumC1290bArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                enumC1290b = null;
                break;
            }
            enumC1290b = enumC1290bArrValues[i15];
            if (enumC1290b.f21649r == i13) {
                break;
            } else {
                i15++;
            }
        }
        if (enumC1290b == null) {
            throw new IOException(p123m2.c.r(i13, "TYPE_GOAWAY unexpected error code: "));
        }
        Da.k kVarK = Da.k.f1363u;
        if (i14 > 0) {
            kVarK = this.f21734r.k(i14);
        }
        p251z9.j.e(kVarK, "debugData");
        kVarK.a();
        p pVar = oVar.f21694s;
        synchronized (pVar) {
            array = pVar.f21712s.values().toArray(new x[0]);
            pVar.f21716w = true;
        }
        for (x xVar : (x[]) array) {
            if (xVar.f21748a > i12 && xVar.g()) {
                xVar.j(EnumC1290b.REFUSED_STREAM);
                oVar.f21694s.n(xVar.f21748a);
            }
        }
    }

    public final List n(int i10, int i11, int i12, int i13) throws IOException {
        s sVar = this.f21735s;
        sVar.f21731v = i10;
        sVar.f21728s = i10;
        sVar.f21732w = i11;
        sVar.f21729t = i12;
        sVar.f21730u = i13;
        e eVar = this.f21736t;
        Da.t tVar = eVar.f21661c;
        ArrayList arrayList = eVar.f21660b;
        while (!tVar.y()) {
            byte b5 = tVar.readByte();
            byte[] bArr = la.c.f19448a;
            int i14 = b5 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b5 & 128) == 128) {
                int iE = eVar.e(i14, 127);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    d[] dVarArr = g.f21672a;
                    if (i15 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i15]);
                    }
                }
                int length = eVar.f21663e + 1 + (i15 - g.f21672a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.f21662d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        p251z9.j.b(dVar);
                        arrayList.add(dVar);
                    }
                }
                throw new IOException(p123m2.c.r(iE, "Header index too large "));
            }
            if (i14 == 64) {
                d[] dVarArr3 = g.f21672a;
                Da.k kVarD = eVar.d();
                g.a(kVarD);
                eVar.c(new d(kVarD, eVar.d()));
            } else if ((b5 & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i14, 63) - 1), eVar.d()));
            } else if ((b5 & 32) == 32) {
                int iE2 = eVar.e(i14, 31);
                eVar.f21659a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.f21659a);
                }
                int i16 = eVar.g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        d[] dVarArr4 = eVar.f21662d;
                        p120l9.l.e0(0, dVarArr4.length, null, dVarArr4);
                        eVar.f21663e = eVar.f21662d.length - 1;
                        eVar.f21664f = 0;
                        eVar.g = 0;
                    } else {
                        eVar.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                d[] dVarArr5 = g.f21672a;
                Da.k kVarD2 = eVar.d();
                g.a(kVarD2);
                arrayList.add(new d(kVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i14, 15) - 1), eVar.d()));
            }
        }
        List listC0 = p120l9.m.C0(arrayList);
        arrayList.clear();
        return listC0;
    }

    public final void s(o oVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i13 = 0;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b5 = this.f21734r.readByte();
            byte[] bArr = la.c.f19448a;
            i13 = b5 & 255;
        }
        if ((i11 & 32) != 0) {
            Da.j jVar = this.f21734r;
            jVar.readInt();
            jVar.readByte();
            byte[] bArr2 = la.c.f19448a;
            i10 -= 5;
        }
        List listN = n(r.a(i10, i11, i13), i13, i11, i12);
        p pVar = oVar.f21694s;
        if (i12 != 0 && (i12 & 1) == 0) {
            na.c.c(pVar.f21719z, pVar.f21713t + '[' + i12 + "] onHeaders", new k(pVar, i12, listN, z10));
            return;
        }
        synchronized (pVar) {
            x xVarE = pVar.e(i12);
            if (xVarE != null) {
                xVarE.i(la.e.f(listN), z10);
                return;
            }
            if (pVar.f21716w) {
                return;
            }
            if (i12 <= pVar.f21714u) {
                return;
            }
            if (i12 % 2 == pVar.f21715v % 2) {
                return;
            }
            x xVar = new x(i12, pVar, false, z10, la.e.f(listN));
            pVar.f21714u = i12;
            pVar.f21712s.put(Integer.valueOf(i12), xVar);
            na.c.c(pVar.f21717x.d(), pVar.f21713t + '[' + i12 + "] onStream", new G4.f(24, pVar, xVar));
        }
    }

    public final void w(o oVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException(p123m2.c.r(i10, "TYPE_PING length != 8: "));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        final int i13 = this.f21734r.readInt();
        final int i14 = this.f21734r.readInt();
        if (!((i11 & 1) != 0)) {
            na.c cVar = oVar.f21694s.f21718y;
            String strB = android.support.v4.media.session.p.B(new StringBuilder(), oVar.f21694s.f21713t, " ping");
            final p pVar = oVar.f21694s;
            na.c.c(cVar, strB, new p241y9.a() { // from class: ra.n
                @Override // p241y9.a
                public final Object invoke() {
                    p pVar2 = pVar;
                    try {
                        pVar2.f21708N.w(i13, i14, true);
                    } catch (IOException e10) {
                        EnumC1290b enumC1290b = EnumC1290b.PROTOCOL_ERROR;
                        pVar2.b(enumC1290b, enumC1290b, e10);
                    }
                    return p110k9.y.f19095a;
                }
            });
            return;
        }
        p pVar2 = oVar.f21694s;
        synchronized (pVar2) {
            try {
                if (i13 == 1) {
                    pVar2.f21697C++;
                } else if (i13 == 2) {
                    pVar2.f21699E++;
                } else if (i13 == 3) {
                    pVar2.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
