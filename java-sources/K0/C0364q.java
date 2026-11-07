package K0;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: K0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0364q extends p251z9.m implements F9.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5148y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0364q(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f5148y = i11;
    }

    @Override // p251z9.c
    public final F9.b b() {
        p251z9.w.f24887a.getClass();
        return this;
    }

    @Override // F9.d
    public final Object get() {
        switch (this.f5148y) {
            case 0:
                return ((AndroidComposeView) this.f24870s).getLayoutDirection();
            default:
                return ((p162q0.k) this.f24870s).f21209l;
        }
    }

    @Override // p241y9.a
    public final Object invoke() {
        return get();
    }
}
