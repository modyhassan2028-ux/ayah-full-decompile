package H0;

import J0.InterfaceC0276b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3167a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(T t2, U u8) {
        t2.getClass();
        if (u8 instanceof InterfaceC0276b0) {
            ((InterfaceC0276b0) u8).l(t2.f3167a);
        }
    }

    public static void f(T t2, U u8, long j) {
        t2.getClass();
        a(t2, u8);
        u8.Y(p063g1.j.c(j, u8.f3172v), 0.0f, null);
    }

    public static void g(T t2, U u8, int i10, int i11) {
        long j = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (t2.b() == p063g1.m.f16261r || t2.c() == 0) {
            a(t2, u8);
            u8.Y(p063g1.j.c(j, u8.f3172v), 0.0f, null);
        } else {
            int iC = (t2.c() - u8.f3168r) - ((int) (j >> 32));
            a(t2, u8);
            u8.Y(p063g1.j.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), u8.f3172v), 0.0f, null);
        }
    }

    public static void h(T t2, U u8, int i10, int i11) {
        int i12 = W.f3177b;
        V v10 = V.f3173s;
        long j = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (t2.b() == p063g1.m.f16261r || t2.c() == 0) {
            a(t2, u8);
            u8.Y(p063g1.j.c(j, u8.f3172v), 0.0f, v10);
        } else {
            int iC = (t2.c() - u8.f3168r) - ((int) (j >> 32));
            a(t2, u8);
            u8.Y(p063g1.j.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), u8.f3172v), 0.0f, v10);
        }
    }

    public static void i(T t2, U u8, p241y9.c cVar) {
        t2.getClass();
        long j = 0;
        a(t2, u8);
        u8.Y(p063g1.j.c((j & 4294967295L) | (j << 32), u8.f3172v), 0.0f, cVar);
    }

    public abstract p063g1.m b();

    public abstract int c();

    public final void d(U u8, int i10, int i11, float f3) {
        a(this, u8);
        u8.Y(p063g1.j.c((((long) i11) & 4294967295L) | (((long) i10) << 32), u8.f3172v), f3, null);
    }
}
