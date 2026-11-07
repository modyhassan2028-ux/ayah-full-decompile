package G9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2942b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f2941a = i10;
        this.f2942b = obj;
    }

    @Override // G9.i
    public final Iterator iterator() {
        switch (this.f2941a) {
            case 0:
                return (Iterator) this.f2942b;
            case 1:
                return new H9.g((CharSequence) this.f2942b);
            default:
                return ((Iterable) this.f2942b).iterator();
        }
    }
}
