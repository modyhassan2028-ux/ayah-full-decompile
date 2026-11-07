package p071g9;

import android.view.View;
import android.view.ViewGroup;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f16350b;

    public f(View view) {
        e eVar;
        j.e(view, "view");
        e eVar2 = new e(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            eVar = new e(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            eVar = e.f16344e;
        }
        this.f16349a = eVar2;
        this.f16350b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f16349a, fVar.f16349a) && j.a(this.f16350b, fVar.f16350b);
    }

    public final int hashCode() {
        return this.f16350b.hashCode() + (this.f16349a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewState(paddings=" + this.f16349a + ", margins=" + this.f16350b + ")";
    }
}
