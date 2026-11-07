package W;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0.U f9326t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(ArrayList arrayList, H0.U u8, int i10) {
        super(1);
        this.f9324r = i10;
        this.f9325s = arrayList;
        this.f9326t = u8;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f9324r) {
            case 0:
                H0.T t2 = (H0.T) obj;
                ArrayList arrayList = this.f9325s;
                t2.d((H0.U) arrayList.get(0), 0, 0, 0.0f);
                t2.d((H0.U) arrayList.get(1), ((H0.U) arrayList.get(0)).f3168r, 0, 0.0f);
                int i10 = ((H0.U) arrayList.get(0)).f3168r;
                H0.U u8 = this.f9326t;
                t2.d(u8, i10 - (u8.f3168r / 2), 0, 0.0f);
                break;
            default:
                H0.T t10 = (H0.T) obj;
                ArrayList arrayList2 = this.f9325s;
                t10.d((H0.U) arrayList2.get(0), 0, 0, 0.0f);
                t10.d((H0.U) arrayList2.get(1), 0, ((H0.U) arrayList2.get(0)).f3169s, 0.0f);
                int i11 = ((H0.U) arrayList2.get(0)).f3169s;
                H0.U u10 = this.f9326t;
                t10.d(u10, 0, i11 - (u10.f3169s / 2), 0.0f);
                break;
        }
        return p110k9.y.f19095a;
    }
}
