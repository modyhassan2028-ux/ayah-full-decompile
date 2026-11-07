package I1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0 f3682a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3684c;

    public H(View view, r rVar) {
        this.f3683b = view;
        this.f3684c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        B0 b0H = B0.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        r rVar = this.f3684c;
        if (i10 < 30) {
            I.a(windowInsets, this.f3683b);
            if (b0H.equals(this.f3682a)) {
                return rVar.p(view, b0H).g();
            }
        }
        this.f3682a = b0H;
        B0 b0P = rVar.p(view, b0H);
        if (i10 >= 30) {
            return b0P.g();
        }
        WeakHashMap weakHashMap = S.f3689a;
        G.c(view);
        return b0P.g();
    }
}
