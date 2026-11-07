package p071g9;

import Aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f16343a;

    public static void a(c cVar, p241y9.c cVar2, int i10) {
        boolean z10 = (i10 & 1) == 0;
        boolean z11 = (i10 & 2) == 0;
        boolean z12 = (i10 & 4) == 0;
        boolean z13 = (i10 & 8) == 0;
        cVar.getClass();
        int i11 = z10 ? 8 : 0;
        if (z11) {
            i11 |= 2;
        }
        if (z12) {
            i11 |= 1;
        }
        if (z13) {
            i11 |= 16;
        }
        int i12 = i11 | 128;
        if (i12 == 0) {
            throw new IllegalArgumentException("A type is required");
        }
        b bVar = new b(i12, cVar.f16343a);
        cVar2.e(bVar);
        cVar.f16343a = bVar.f16342b;
    }
}
