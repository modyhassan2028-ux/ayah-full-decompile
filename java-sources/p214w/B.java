package p214w;

import java.util.LinkedHashMap;
import p063g1.j;
import p063g1.l;
import p181s2.t;
import p223x.AbstractC1413d;
import p223x.C1408a0;
import p223x.InterfaceC1435y;
import p223x.u0;
import p223x.v0;
import p223x.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f23415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1408a0 f23416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1408a0 f23417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1408a0 f23418d;

    static {
        C1390c c1390c = C1390c.f23483y;
        C1390c c1390c2 = C1390c.f23484z;
        v0 v0Var = w0.f24113a;
        f23415a = new v0(c1390c, c1390c2);
        f23416b = AbstractC1413d.p(400.0f, 5, null);
        long j = 1;
        long j10 = (j & 4294967295L) | (j << 32);
        f23417c = AbstractC1413d.p(400.0f, 1, new j(j10));
        f23418d = AbstractC1413d.p(400.0f, 1, new l(j10));
    }

    public static G a(u0 u0Var, int i10) {
        InterfaceC1435y interfaceC1435yP = u0Var;
        if ((i10 & 1) != 0) {
            interfaceC1435yP = AbstractC1413d.p(400.0f, 5, null);
        }
        return new G(new T(new I(interfaceC1435yP), (Q) null, (C1406t) null, (t) null, (LinkedHashMap) null, 62));
    }

    public static H b(u0 u0Var, int i10) {
        InterfaceC1435y interfaceC1435yP = u0Var;
        if ((i10 & 1) != 0) {
            interfaceC1435yP = AbstractC1413d.p(400.0f, 5, null);
        }
        return new H(new T(new I(interfaceC1435yP), (Q) null, (C1406t) null, (t) null, (LinkedHashMap) null, 62));
    }
}
