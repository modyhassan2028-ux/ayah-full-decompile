package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10346a;

    public a(int i10) {
        this.f10346a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f10346a == ((a) obj).f10346a;
    }

    public final int hashCode() {
        return this.f10346a;
    }

    public final String toString() {
        return android.support.v4.media.session.p.A(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f10346a, ')');
    }
}
