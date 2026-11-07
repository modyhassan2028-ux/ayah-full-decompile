package W;

import java.util.ArrayList;

/* JADX INFO: renamed from: W.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0558f2 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H0.U f9074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0.U f9076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f9077u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f9078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f9079w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558f2(H0.U u8, ArrayList arrayList, H0.U u10, long j, float f3, float f7) {
        super(1);
        this.f9074r = u8;
        this.f9075s = arrayList;
        this.f9076t = u10;
        this.f9077u = j;
        this.f9078v = f3;
        this.f9079w = f7;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long j;
        H0.T t2 = (H0.T) obj;
        int i10 = 0;
        H0.U u8 = this.f9074r;
        if (u8 != null) {
            t2.d(u8, 0, 0, 0.0f);
        }
        ArrayList arrayList = this.f9075s;
        int size = arrayList.size();
        while (true) {
            j = this.f9077u;
            if (i10 >= size) {
                break;
            }
            H0.U u10 = (H0.U) arrayList.get(i10);
            int iH = (p063g1.a.h(j) / 2) - (u10.f3168r / 2);
            int iG = (p063g1.a.g(j) / 2) - (u10.f3169s / 2);
            double d5 = this.f9078v;
            double d9 = ((double) (this.f9079w * i10)) - 1.5707963267948966d;
            t2.d(u10, B9.a.U((Math.cos(d9) * d5) + ((double) iH)), B9.a.U((Math.sin(d9) * d5) + ((double) iG)), 0.0f);
            i10++;
            arrayList = arrayList;
        }
        H0.U u11 = this.f9076t;
        if (u11 != null) {
            t2.d(u11, (p063g1.a.j(j) - u11.f3168r) / 2, (p063g1.a.i(j) - u11.f3169s) / 2, 0.0f);
        }
        return p110k9.y.f19095a;
    }
}
