package F;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, Object obj) {
        super(1);
        this.f2046r = i10;
        this.f2047s = obj;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2046r) {
            case 0:
                ((Number) obj).intValue();
                return this.f2047s;
            case 1:
                ((Number) obj).intValue();
                return this.f2047s;
            default:
                return Boolean.valueOf(p251z9.j.a(obj, this.f2047s));
        }
    }
}
