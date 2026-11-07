package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final va.g f10406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, int i10, float f3, float f7, va.g gVar) {
        super(i10);
        p251z9.j.e(str, "numberCodePoint");
        this.f10403b = str;
        this.f10404c = f3;
        this.f10405d = f7;
        this.f10406e = gVar;
    }

    @Override // Y3.g
    public final float a() {
        return this.f10405d;
    }

    @Override // Y3.g
    public final float b() {
        return this.f10404c;
    }
}
