package p071g9;

import Aa.a;
import H7.M;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16342b;

    public b(int i10, a aVar) {
        j.e(aVar, "builder");
        this.f16341a = i10;
        this.f16342b = aVar;
    }

    public static void a(b bVar, int i10) {
        char c10 = (i10 & 1) != 0 ? (char) 0 : (char) 1;
        boolean z10 = (i10 & 2) == 0;
        boolean z11 = (i10 & 4) == 0;
        boolean z12 = (i10 & 32) == 0;
        a aVar = bVar.f16342b;
        int i11 = bVar.f16341a;
        int i12 = c10 | ((z10 || z12) ? (char) 2 : (char) 0) | (!z11 ? 0 : 4) | (z12 ? '\b' : (char) 0);
        M m10 = (M) aVar.f555s;
        if ((i12 & 1) != 0) {
            m10.f3458a |= i11;
        }
        if ((i12 & 2) != 0) {
            m10.f3459b |= i11;
        }
        if ((i12 & 4) != 0) {
            m10.f3460c |= i11;
        }
        if ((i12 & 8) != 0) {
            m10.f3461d |= i11;
        } else {
            m10.getClass();
        }
        bVar.f16342b = aVar;
    }
}
