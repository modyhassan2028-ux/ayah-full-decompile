package Z;

/* JADX INFO: renamed from: Z.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0696n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10701b;

    public /* synthetic */ C0696n(int i10, Object obj) {
        this.f10700a = i10;
        this.f10701b = obj;
    }

    public final void a() {
        switch (this.f10700a) {
            case 0:
                ((C0698o) this.f10701b).f10745z--;
                break;
            default:
                ((p093j0.t) this.f10701b).j--;
                break;
        }
    }

    public final void b() {
        switch (this.f10700a) {
            case 0:
                ((C0698o) this.f10701b).f10745z++;
                break;
            default:
                ((p093j0.t) this.f10701b).j++;
                break;
        }
    }
}
