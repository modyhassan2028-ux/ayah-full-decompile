package R0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p241y9.e f7183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7184c;

    public v(String str, p241y9.e eVar) {
        this.f7182a = str;
        this.f7183b = eVar;
    }

    public final void a(j jVar, Object obj) {
        jVar.e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f7182a;
    }

    public /* synthetic */ v(String str) {
        this(str, r.f7133H);
    }

    public v(String str, boolean z10, p241y9.e eVar) {
        this(str, eVar);
        this.f7184c = z10;
    }
}
