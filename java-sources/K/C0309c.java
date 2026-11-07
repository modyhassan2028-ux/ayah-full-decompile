package K;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: K.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309c extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f4614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0309c(int i10, int i11, l0.r rVar) {
        super(2);
        this.f4614r = rVar;
        this.f4615s = i10;
        this.f4616t = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC0312f.b(C0672b.y(this.f4615s | 1), this.f4616t, (C0698o) obj, this.f4614r);
        return p110k9.y.f19095a;
    }
}
