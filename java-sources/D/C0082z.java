package D;

/* JADX INFO: renamed from: D.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0082z extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H0.U f1038s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0082z(H0.U u8, int i10) {
        super(1);
        this.f1037r = i10;
        this.f1038s = u8;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f1037r) {
            case 0:
                H0.T.g((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 1:
                H0.T t2 = (H0.T) obj;
                p063g1.m mVarB = t2.b();
                p063g1.m mVar = p063g1.m.f16261r;
                H0.U u8 = this.f1038s;
                if (mVarB == mVar || t2.c() == 0) {
                    H0.T.a(t2, u8);
                    u8.Y(p063g1.j.c(0L, u8.f3172v), 0.0f, null);
                } else {
                    int i10 = (int) 0;
                    long jC = ((long) ((t2.c() - u8.f3168r) - i10)) << 32;
                    H0.T.a(t2, u8);
                    u8.Y(p063g1.j.c((((long) i10) & 4294967295L) | jC, u8.f3172v), 0.0f, null);
                }
                break;
            case 2:
                H0.T.g((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 3:
                H0.T.g((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 4:
                ((H0.T) obj).d(this.f1038s, 0, 0, 0.0f);
                break;
            case 5:
                H0.T.h((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 6:
                H0.T.g((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 7:
                ((H0.T) obj).d(this.f1038s, 0, 0, 0.0f);
                break;
            case 8:
                ((H0.T) obj).d(this.f1038s, 0, 0, 0.0f);
                break;
            case 9:
                H0.T.g((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 10:
                H0.T.g((H0.T) obj, this.f1038s, 0, 0);
                break;
            case 11:
                ((H0.T) obj).d(this.f1038s, 0, 0, 0.0f);
                break;
            case 12:
                ((H0.T) obj).d(this.f1038s, 0, 0, 0.0f);
                break;
            default:
                ((H0.T) obj).d(this.f1038s, 0, 0, 0.0f);
                break;
        }
        return p110k9.y.f19095a;
    }
}
