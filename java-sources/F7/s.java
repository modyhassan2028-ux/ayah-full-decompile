package F7;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f2478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, int i10) {
        super(wVar);
        this.f2477e = i10;
        this.f2478f = wVar;
    }

    @Override // F7.t
    public final float a() {
        float f3;
        float f7;
        switch (this.f2477e) {
            case 0:
                w wVar = this.f2478f;
                f3 = wVar.f2502h;
                f7 = wVar.f2503i;
                break;
            case 1:
                w wVar2 = this.f2478f;
                f3 = wVar2.f2502h;
                f7 = wVar2.j;
                break;
            default:
                return this.f2478f.f2502h;
        }
        return f3 + f7;
    }
}
