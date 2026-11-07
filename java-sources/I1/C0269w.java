package I1;

import U6.C0532j;
import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: I1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0269w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0268v f3790a;

    public C0269w(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f3790a = new C0267u(nestedScrollView);
        } else {
            this.f3790a = new C0532j(10);
        }
    }
}
