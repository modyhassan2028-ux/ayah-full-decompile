package I1;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class D extends F {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3673v;

    public D(int i10, Class cls, int i11, int i12, int i13) {
        this.f3673v = i13;
        this.f3677r = i10;
        this.f3680u = cls;
        this.f3679t = i11;
        this.f3678s = i12;
    }

    @Override // I1.F
    public final Object c(View view) {
        switch (this.f3673v) {
            case 0:
                return Boolean.valueOf(M.c(view));
            case 1:
                return M.a(view);
            case 2:
                return O.b(view);
            default:
                return Boolean.valueOf(M.b(view));
        }
    }

    @Override // I1.F
    public final void d(View view, Object obj) {
        switch (this.f3673v) {
            case 0:
                M.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                M.e(view, (CharSequence) obj);
                break;
            case 2:
                O.d(view, (CharSequence) obj);
                break;
            default:
                M.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // I1.F
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f3673v) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
