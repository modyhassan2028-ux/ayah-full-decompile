package p148o7;

import I1.S;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20374d;

    public j(View view) {
        this.f20371a = view;
    }

    public final void a() {
        int i10 = this.f20374d;
        View view = this.f20371a;
        int top = i10 - (view.getTop() - this.f20372b);
        WeakHashMap weakHashMap = S.f3689a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f20373c));
    }

    public final boolean b(int i10) {
        if (this.f20374d == i10) {
            return false;
        }
        this.f20374d = i10;
        a();
        return true;
    }
}
